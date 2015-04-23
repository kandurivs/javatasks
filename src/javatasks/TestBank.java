package javatasks;

public class TestBank {
	public static void main (String args[]){
		Bank1 b=new SBI1();
		Bank1 b1=new PBN1();
		int interest = b.getRateOfInterest();
		int interest1 = b1.getRateOfInterest();
		System.out.println("Rate of Interest is: "+interest+" %");
		System.out.println("Rate of Interest is: "+interest1+" %");
	}

}
