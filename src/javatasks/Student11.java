package javatasks;

public class Student11 {
	int id;
	String name;
	
	Student11(int id, String name){
		this.id=id;
		this.name=name;
	}
	void display(){
		System.out.println(id+""+name);
	}
	public static void main(String args[]){
		Student11 s1=new Student11(12, ",myprgm");
		Student11 s2=new Student11(23, ",nameas");
		
		s1.display();
		s2.display();
	}
	
}
