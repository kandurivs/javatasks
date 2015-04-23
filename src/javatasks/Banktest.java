package javatasks;

public class Banktest {

	public static void main(String args[]){
		SBI s= new SBI();
		AXIS a=new AXIS();
		ICICI i=new ICICI();
		System.out.println("SBI rate of Intrest "+s.getRateOfIntrest());
		System.out.println("ICICI rate of Intrest"+i.getRateOfIntrest());
		System.out.println("AXIS rate of Intrest"+a.getRateOfIntrest());
	}
}
