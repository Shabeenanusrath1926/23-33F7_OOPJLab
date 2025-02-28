class Shape{
 void draw(){
 System.out.println("drawing...");
 }
}
class Rectangle extends Shape{
 void draw(){
 System.out.println("draw Rectangle...");
 }
}
class Circle extends Rectangle{
 void draw(){
 System.out.println("draw Circle..."); 
 }
}
class Triangle extends Circle{
 void draw(){
 System.out.println("draw Triangle...");
 }
}
class Polymorphism{
 public static void main(String[] args){
 Shape S;
 S=new Rectangle();
 S.draw();
 S=new Circle();
 S.draw();
 S=new Triangle();
 S.draw();
 }
}