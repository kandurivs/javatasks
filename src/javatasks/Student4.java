package javatasks;
// parameterized Constructor - is used to provide different value to the distinct o=objects. 
// class name and method name should be same
//Constructor name must be same as its class name

class Student4 {
	int id;
	String name;
	
	Student4(int i, String n){
		id =i;
		name=n;
	}
	
	void display (){System.out.println(id+ "" +name);}
	
	public static void main (String args[]){
		Student4 s1=new Student4(12, "names");
		Student4 s2=new Student4(15, "ours");
		s1.display();
		s2.display();
		
	}
}
