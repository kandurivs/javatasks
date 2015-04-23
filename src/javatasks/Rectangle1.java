package javatasks;

class Rectangle1 {
	int length;
	int wedth;
	
	void insert(int l, int w){
		length =l;
		wedth = w;
	}
	
	void calculateArea(){
		System.out.println(length * wedth);
	}
	
	public static void main(String args[]){
		Rectangle1 re =new Rectangle1(), re1 = new Rectangle1();
		re.insert(2, 2);
		re1.insert(2, 5);
		re.calculateArea();
		re1.calculateArea();
	}

}
