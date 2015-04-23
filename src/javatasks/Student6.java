package javatasks;
//copy one object to another object
class Student6{  
    int id;  
    String name;  
    Student6(int i,String n){  
    id = i;  
    name = n;  
    }  
      
    Student6(){}  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student6 s12 = new Student6(111,"Karan");  
    Student6 s22 = new Student6();
    
    s22.id=s12.id;  
    s22.name=s12.name;
    
    s12.display();  
    s22.display();  
   }  
}  