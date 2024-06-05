package app.laptop;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Laptop lap1 = new Laptop();
    	Laptop lap2 = new Laptop();
    	Laptop lap3 = new Laptop();
    	Laptop lap4 = new Laptop();

    	List list1=new ArrayList();
        list1.add(lap1);
        list1.add(lap2);
        
        List list2=new ArrayList();
        list2.add(lap3);
        list2.add(lap4);
        
        Employees emp1 = new Employees(101,"Gowri",120000,list1);
        Employees emp2 = new Employees(102,"Priya",190000,list2);
        
        lap1.setId(1111);
        lap1.setName("HP");
        lap1.setEmp(emp1);
        
        lap2.setId(2222);
        lap2.setName("LENOVO");
        lap2.setEmp(emp1);

        lap3.setId(3333);
        lap3.setName("ACER");
        lap3.setEmp(emp2);
        
        lap4.setId(4444);
        lap4.setName("APPLE");
        lap4.setEmp(emp2);

            Configuration cfg= new Configuration();
            cfg.configure();
            SessionFactory factory=cfg.buildSessionFactory();
            Session s=factory.openSession();
             
            Transaction t=s.beginTransaction();
            
            s.save(emp1);
            s.save(emp2);
            s.save(lap1);
            s.save(lap2);
            s.save(lap3);
            s.save(lap4);

            t.commit();
    }
}
