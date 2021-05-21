package org.btm;







import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class Dao {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	
	
	Configuration con= new Configuration();
	con.configure();
	SessionFactory sf=con.buildSessionFactory();
	Session session=sf.openSession();
  
	try {
	session.beginTransaction();
	readStudentRecord(session);
		createRecord(session);
		 deletRecord(session); 
	//listStudent(session );
		updateEmployee(session);
	
	session.getTransaction().commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		sf.close();
	}
}
private static void readStudentRecord(Session session) {
	
	//Retrieve flight details with id
	Student student= (Student) session.get(Student.class, 27);
	
	//Print student details fetched in previous step
	System.out.println("Read Student  Details -- "+student.toString());
	
	
}

 


  private static void deletRecord(Session session) {
  
  Student s=new Student(); 
  try{
	  s.setId(10); 
	  session.delete(s); 
	  }
  catch(Exception e){
	  e.printStackTrace();
	  } 
  }
 


	
	  private static void createRecord(Session session) {
	  
	  //list.add(new Student("aplamma","kus"));
	  
	  session.save(new Student("david","massy"));
	  
	  }
	 

  public static void updateEmployee(Session session ){
  
  
  
  Student employee = (Student) session.get(Student.class,13);
  employee.setName("fff"); session.update(employee);
  
  
  }
 
}
