class College{
   void dept()
   {
   System.out.println("Department");
   }
}
class Faculty extends College {
   void teach()
   {
    System.out.println("Teaching");
    }
}
class Student extends Faculty{
   void read()
   {
     System.out.println("Reading");
     }
}
public class MLInheritance{
   public static void main(String args[]){
      Student s=new Student ();
      s.dept();
      s.teach();
      s.read();
      }
}