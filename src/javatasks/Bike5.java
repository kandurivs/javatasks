package javatasks;
//Example of instance initializer block

public class Bike5 {
	int speed;
	
	Bike5(){System.out.println("Speed is: " +speed);}
	{
		speed=100;
	}
	public static void main(String args[]){
		Bike5 b=new Bike5();
		Bike5 b1=new Bike5();
	}

}
