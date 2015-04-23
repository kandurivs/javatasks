package javatasks;

public class Counter {
	int counter= 0;// we will get memory when instance is created.
	
	Counter(){
		counter ++;
		System.out.println(counter);
	}

	public static void main (String args[]){
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
	}
}
