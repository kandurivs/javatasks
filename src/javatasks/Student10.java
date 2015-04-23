package javatasks;
/*without using this keyword.*/

class Student10 {
	int id;
	String name;
	
	Student10(int id, String name){
		id=id;
		name=name;
	}
	void display(){System.out.println(id+""+name);}
	public static void main(String args[]){
		Student10 s1=new Student10(10, "name");
		Student10 s2=new Student10(11, "sssname");
		s1.display();
		s2.display();
	}
}
