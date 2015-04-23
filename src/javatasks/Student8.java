package javatasks;

class Student8 {
	int rollno;
	String name;
	static String collage="ITS";
	
	Student8(int r,String n){
		rollno=r;
		name=n;
	}
	void display(){
		System.out.println(rollno+""+name+""+collage);
	}
	public static void main(String args[]){
		Student8 s1=new Student8(12, "names");
		Student8 s2=new Student8(14, "urname");
		
		s1.display();
		s2.display();
	}
}
