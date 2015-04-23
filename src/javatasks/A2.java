package javatasks;

public class A2 implements printable{

	@Override
	public void print() {
		System.out.println("Hello");
	}
	
	public static void main(String args []){
		A2 a=new A2();
		a.print();
	}

}
