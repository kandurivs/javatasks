package javatasks;

public class Dog1 extends Animal{
	void eat(){
		System.out.println("Animal is eating ");
	}
	public static void main (String args[]){
		Animal a= new Dog1();
		a.eat();
	}

}
