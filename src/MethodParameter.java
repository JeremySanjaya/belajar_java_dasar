public class MethodParameter {
    public static void main(String[] args) {


    sayHello("Jeremy", "Edward");
    sayHello("Jeremy", "Domnenico");
    sayHello("Jeremy", "Sanjaya");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
