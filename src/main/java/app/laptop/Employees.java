package app.laptop;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;
@Entity
public class Employees {
	@Id
   int e_id;
   String e_name;
   int e_salary;
   @OneToMany
   List<Laptop> laptop;
public Employees() {
	super();
	// TODO Auto-generated constructor stub
}
public Employees(int e_id, String e_name, int e_salary, List<Laptop> laptop) {
	super();
	this.e_id = e_id;
	this.e_name = e_name;
	this.e_salary = e_salary;
	this.laptop = laptop;
}
public int getE_id() {
	return e_id;
}
public void setE_id(int e_id) {
	this.e_id = e_id;
}
public String getE_name() {
	return e_name;
}
public void setE_name(String e_name) {
	this.e_name = e_name;
}
public int getE_salary() {
	return e_salary;
}
public void setE_salary(int e_salary) {
	this.e_salary = e_salary;
}
public List<Laptop> getLaptop() {
	return laptop;
}
public void setLaptop(List<Laptop> laptop) {
	this.laptop = laptop;
}
   
   
}