package app.laptop;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	int id;
	String name;
	@ManyToOne
	Employees emp;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int id, String name, Employees emp) {
		super();
		this.id = id;
		this.name = name;
		this.emp = emp;
	}
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
	public Employees getEmp() {
		return emp;
	}
	public void setEmp(Employees emp) {
		this.emp = emp;
	}
	
	
}
