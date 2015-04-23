package javatasks;

class Student9 {
	int rollno;
	String name;
	static String college="XYZ";
	
	static void change(){
		college="IIN";
	}
	
	Student9(int r,String n){
		rollno=r;
		name =n;
	}
	
	void display(){
		System.out.println(rollno+""+name+""+college);
	}
	public static void main(String args[]){
		Student9.change();
		Student9 s1=new Student9(12, "kamal");
		Student9 s2=new Student9(13, "Srinivas");
		Student9 s3=new Student9(14, "rajen");
		
		s1.display();
		s2.display();
		s3.display();
	}
}
