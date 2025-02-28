interface Calculator
{
int add(int a,int b);
int subtract(int a,int b);
int multiply(int a,int b);
double divide(int a, int b);
}
class BasicCalculator implements Calculator
{
public int add(int a,int b){
return a+b;
}
public int subtract(int a,int b){
return a-b;
}
public int multiply(int a,int b){
return a*b;
}
public double divide(int a,int b){
 if(b==0){
   throw new ArithmeticException("division is not allowed");
 }
 return(double)a/b;
 }
}
public class Main{
 public static void main(String[] args){
  BasicCalculator calc=new BasicCalculator();
  int sum=calc.add(10,5); 
  int difference=calc.subtract(10,5);
  int product=calc.multiply(10,5);
  double quotient=calc.divide(10,5);
  System.out.println("Sum:" +sum);
  System.out.println("Difference:" +difference);
  System.out.println("Quotient:" +quotient);
  try {
      double invalid=calc.divide(10,0);
      }
       catch(ArithmeticException e){
        System.out.println("error:" +e.getMessage());
       }
   }
} 
