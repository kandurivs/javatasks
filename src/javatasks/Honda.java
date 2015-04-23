package javatasks;

public class Honda extends Bike7{
	void run() {
		System.out.println("running safely...");
	}
	
	public static void main(String args[]){
		Bike7 b=new Honda();
		b.run();
	}
	
}
