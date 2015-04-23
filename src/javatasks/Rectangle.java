package javatasks;

class Rectangle {
	int length;
	int wedth;
	
	void insert(int l, int w){
		length = l;
		wedth =w;
	}
	
	void calculateArea(){
		System.out.println(length * wedth);
	}
	
	public static void main(String args[]){
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		
		r1.insert(3, 5);
		r1.insert(5, 5);
		
		r1.calculateArea();
		r2.calculateArea();
	}
	
}
