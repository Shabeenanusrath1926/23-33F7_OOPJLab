abstract class Shape{
     abstract int calculatearea();
     void display(){
	System.out.println("Area:"+calculatearea());
     }
}
class square extends Shape{
	int side=10;
		int calculatearea(){
		return side*side;
	}
}
class rect extends Shape{
	int length=10;
        int width=5;
		int calculatearea(){
		return length*width;
	}
}
class Shapetest{
	public static void main(String[] args){
		square sq=new square();
		rect rt=new rect();
		sq.display();
		rt.display();
	}
}