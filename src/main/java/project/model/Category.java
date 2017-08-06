package project.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Category {

	@Id
	@GeneratedValue
	@JsonView(DataTablesOutput.View.class)
	private int id;
	
	@Column(name = "name",  nullable=false , length= 255)
	@JsonView(DataTablesOutput.View.class)
	private String name;
	

	
	@Column(name = "description")
	@JsonView(DataTablesOutput.View.class)
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Category() {
		super();
	}
	
	
	
}
