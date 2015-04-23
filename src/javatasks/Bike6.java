package javatasks;

public class Bike6 {
	int speed;
	Bike6(){
		System.out.println("constructor is invoked");
	}
	{
		System.out.println("instance initializer block invoked");
	}
	public static void main (String args[]){
		Bike6 b=new Bike6();
		Bike6 b1=new Bike6();
		Bike6 b2=new Bike6();
	}

}
