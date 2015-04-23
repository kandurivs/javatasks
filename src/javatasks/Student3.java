package javatasks;

public class Student3 {
	int id;
	String name;
	
	void display(){
		System.out.println(id+""+name);
	}
	
	public static void main (String arfs[]){
		Student3 st1=new Student3();
		Student3 st2=new Student3();
		
		st1.display();
		st2.display();
	}

}
