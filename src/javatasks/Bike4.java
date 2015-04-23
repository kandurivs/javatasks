package javatasks;

public class Bike4 extends Vehicle2{
	Bike4(){
		   super();//will invoke parent class constructor  
		   System.out.println("Bike is created");
	}
	public static void main(String args[]){
		Bike4 b=new Bike4();
	}
}
