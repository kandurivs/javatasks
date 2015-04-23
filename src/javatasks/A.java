package javatasks;

class A {
	void m(){
		System.out.println("method is invoked");
	}
	void n(){
		this.m();//no need bcz compiler does it for you..
	}
	void o(){
		n();// compiler will add this invoke m method add this.n()
	}
	public static void main (String args[]){
		A a=new A();
		a.o();
		//		new A().o();

	}




	new test fot git

}
