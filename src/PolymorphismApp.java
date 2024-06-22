public class PolymorphismApp {

    public static void main(String[] args) throws Exception {
        sayHello(new Employee ("Azkiya"));

        //user.sayHello("Azkiya")
        sayHello(new Manager ("Azkiya"));
        //user.sayHello("Azkiya")
        sayHello(new VicePresident ("Azkiya"));
        
    }

    //type check & cast
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee ;
            System.out.println("Hello VP "+vicePresident.name);
        }else if (employee instanceof Manager) {
            Manager manager = (Manager) employee ;
            System.out.println("Hello Manager "+manager.name);
        }else {
            System.out.println("Hello "+employee.name);
        }
    }
}
