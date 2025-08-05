package org.jsp.chetan.Employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static SessionFactory factory=null;
	static final Scanner sc=new Scanner(System.in);
	
	static {
		factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public void addEmployee() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		System.out.print("Enter Employee name: ");
		String name=sc.next();
		System.out.print("Enter Employee salary: ");
		int salary=sc.nextInt();
		System.out.print("Enter Employee department: ");
		String department=sc.next();
		Employee employee=new Employee(name,salary,department);
		session .persist(employee);
		transaction.commit();
		session.close();
	}	
	
	public Employee getEmployee() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.print("Enter ID to fetch Employee: ");
		int id = sc.nextInt();
		Employee ref = session.get(Employee.class, id);
		
		if (ref == null) {
			System.out.println("Employee not found.");
		} else {
			System.out.println(ref);
		}
		
		transaction.commit();
		session.close();
		return ref;
	}

	
	public void deleteEmployee() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.print("Enter ID to delete: ");
		int id = sc.nextInt();
		Employee ref = session.get(Employee.class, id);
		
		if (ref != null) {
			session.remove(ref);
			System.out.println("Employee deleted successfully.");
		} else {
			System.out.println("Employee doesn't exist.");
		}
		
		transaction.commit();
		session.close();
	}

	public void updateEmployee() {
	    Session session = factory.openSession();
	    Transaction transaction = session.beginTransaction();

	    System.out.println("Enter ID to update");
	    Employee ref = getEmployee();

	    if (ref == null) {
	        session.close();
	        return;
	    }

	    while (true) {
	        System.out.println("press-1 to update name");
	        System.out.println("press-2 to update salary");
	        System.out.println("press-3 to update department");
	        System.out.println("press-4 to cancel update");

	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter your name: ");
	                ref.setName(sc.next());
	                break;
	            case 2:
	                System.out.print("Enter new salary: ");
	                ref.setSalary(sc.nextInt());
	                break;
	            case 3:
	                System.out.print("Enter new department: ");
	                ref.setDepartment(sc.next());
	                break;
	            case 4:
	                System.out.println("Update cancelled.");
	                session.close();
	                return;
	            default:
	                System.out.println("Invalid choice, try again.");
	                continue;
	        }

	        ref = (Employee) session.merge(ref);
	        transaction.commit();
	        System.out.println("Updated: " + ref);
	        session.close();
	        break;
	    }
	

		}
	
	
	
    public static void main( String[] args )
    {
        App app=new App();
        System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
        while(true) {
        	System.out.println("OUR MENU");
        	System.out.println("PRESS-1 TO VIEW EMPLOYEE");
        	System.out.println("PRESS-2 TO ADD A EMPLOYEE");
        	System.out.println("PRESS-3 TO DELETE EMPLOYEE");
        	System.out.println("PRESS-4 TO UPDATE EMPLOYEE");
        	System.out.println("OTHER NUMBER TO STOP");
        	
          int choice=sc.nextInt();
          
          switch(choice) {
          case 1:app.getEmployee();
          		break;
          case 2:app.addEmployee();
          		break;
          case 3:app.deleteEmployee();
          		break;
          case 4:app.updateEmployee();
          		break;
          default:System.out.println("THANK YOU SO MUCH FOR USING EMLPOYEE MANAGEMENT SYSTEM");
          System.out.println("OK GUYS COMPLETED");
          factory.close();
          return;
          
          }
        }
    }
}
