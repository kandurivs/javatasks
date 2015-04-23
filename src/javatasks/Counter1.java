package javatasks;

public class Counter1 {
	static int counter= 0;// will get memory only once and retain its value
	
	Counter1(){
		counter ++;
		System.out.println(counter);
	}

	public static void main (String args[]){
		Counter1 c1=new Counter1();
		Counter1 c2=new Counter1();
		Counter1 c3=new Counter1();
	}
}
