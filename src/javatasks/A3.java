package javatasks;

public class A3 implements printable,Showable{

	public void show() {
		System.out.println("Hi Show");
	}
	public void print() {
		System.out.println("Hi print");	
	}
	public static void main(String args []){
		A3 a=new A3();
		a.print();
		a.show();
	}
	
}
