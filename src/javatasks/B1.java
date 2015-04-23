package javatasks;

public class B1 extends Abc{
	B1(){
		super();
		System.out.println("child class constructor");
		}
	{
		System.out.println("instance initilizeeer block1");
	}
	B1(int a){
		super();
		System.out.println("child class is invoked :"+a);
	}
	{
		System.out.println("instance initilizer block 2");
	}
	public static void main(String args[]){
		B1 b=new B1();
		B1 b1=new B1(12);
	}
}
