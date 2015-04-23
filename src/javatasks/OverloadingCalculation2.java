package javatasks;

public class OverloadingCalculation2 {
	void sum(int a, int b){System.out.println("int arg method invoked");}
	void sum(long a, long b){System.out.println("long arg method invokde");}
	
	public static void main (String args[]){
		OverloadingCalculation2 ov =new OverloadingCalculation2();
		ov.sum(20, 20);//now int arg sum() method gets invoked  
	}

}
