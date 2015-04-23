package javatasks;

class Student5 {
	int id;
	int age;
	String name;
	
	Student5(int i, String n){
		id = i;
		name = n;
	}
	Student5(int i, String n, int a){
		id = i;
		name=n;
		age =a;
	}
	void display(){System.out.println(id+""+name+""+age);}
	
	public static void main (String args[]){
		Student5 s5=new Student5(12, "karana");
		Student5 s6=new Student5(13,"ramesh",12);
		s5.display();
		s6.display();
	}
}
