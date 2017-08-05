package project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ubigeo")
public class Ubigeo {
	
	@Id
	private String id;
	@Column
	private String departamento;
	@Column
	private String provincia;
	@Column
	private String distrito;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public Ubigeo(String id, String departamento, String provincia, String distrito) {
		super();
		this.id = id;
		this.departamento = departamento;
		this.provincia = provincia;
		this.distrito = distrito;
	}
	public Ubigeo() {
		super();
	}
	
	
	
	

}
