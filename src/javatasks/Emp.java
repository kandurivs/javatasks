package javatasks;

public class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display(){
		System.out.println(id+"   "+name);
		System.out.println(address.city+" "+address.country+" "+address.state);
	}
	
	public static void main(String args[]){
		Address address=new Address("Dehradun","UA","INDIA");
		Address address1=new Address("Hyderabad", "AP", "INDIA");
		
		Emp e=new Emp(10, "Seshu", address1);
		Emp e1=new Emp(13, "Venkata", address);
		e.display();
		e1.display();
		
	}
}
