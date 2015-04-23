package javatasks;
// this() can be used to invoked current class constructor.
//Program of this() constructor call (constructor chaining)  

public class Student12 {
	int id;
	String name;
	int age;
	static String college="TTI";
	Student12(){
		System.out.println("default constructor is invoked");
	}
	
	Student12(int id,String name){
		this();
		this.id=id;
		this.name=name;
		
	}
	Student12(int id, String name, int age){
		this();
		this.id=id;
		this.age=age;
		this.name=name;
	}
	
	void display(){System.out.println(id+""+name+""+college+"age");}
	public static void main(String args[]){
		Student12 s1=new Student12(12,"Haris");
		Student12 s2=new Student12(123,"Ramakarishna");
		s1.display();
		s2.display();
	}

}
