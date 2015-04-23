package javatasks;

public class Bcd extends Abc{
	Bcd(){
		super();
		System.out.println("child class constructor invoked");
	}
	{
		System.out.println("instance initializer block ");
	}
	public static void main(String args[]){
		Bcd bcd=new Bcd();
		Bcd bc=new Bcd();
	}

}
