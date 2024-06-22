public class VicePresident extends Employee {
    VicePresident(String name){
        super(name);
    }

    void sayHello(String name) throws Exception {
        System.out.println("Hello "+ name+", My name is Vicepresident "+this.name);
    }
}
