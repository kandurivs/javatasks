package javatasks;

public class Bike3 extends Vehicle1{
	int speed=100;
	
	void disply(){
		System.out.println(super.speed);
		//System.out.println(speed);
	}
	public static void main(String args[]){
		Bike3 b=new Bike3();
		b.disply();
	}

}
