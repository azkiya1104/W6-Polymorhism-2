public class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    void sayHello(String name) throws Exception{
        System.out.println("Hello "+name+", My name is employee "+this.name);
    }
}
    
