class Student{    
 int id;  
   String name;   
  Student(){     
    System.out.println("this is a default constructor");   
  }     
Student(int i,String n){      
   id = i;      
   name = n; 
    } 
}
 public class Main{  
   public static void main(String[] args){        
 Student s = new Student();  
       System.out.println("\n Default Constructor values:\n");      
   System.out.println("StudentID:"+s.id+"\nStudentName:"+s.name);       
  System.out.println("\n Parameterized Constructor values:\n");      
   Student student = new Student(10,"tom");       
  System.out.println("StudentID:"+student.id+"\nStudentName:"+student.name); 
    }
}