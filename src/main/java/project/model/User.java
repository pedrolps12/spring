package project.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.JoinColumn;


import project.model.Role;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue
	@JsonView(DataTablesOutput.View.class)
	private int id;
	
	@Column(name = "email", unique = true, nullable=false , length= 45)
	@JsonView(DataTablesOutput.View.class)
	private String email;
	
	@Column(name = "password", length = 90)
	private String password;
	
	@Column(name = "firstname")
	@JsonView(DataTablesOutput.View.class)
	private String firstname;
	
	@Column(name = "lastname")
	@JsonView(DataTablesOutput.View.class)
	private String lastname;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "ubigeo", length=6)
	private String ubigeo;	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}
	@ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
	public User(String email, String password) {
		super();
		this.email 	  = email;
		this.password = password;
	}
	public User(String email, String password, String firstname, String lastname, Set<Role> roles) {
		super();
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.roles = roles;
	}
	public User(){}
}

