public class MethodParamater {
    
    public static void main(String[] args) {
        
        sayHelloWorld("Trian", "Eka Putra");
    }

    static void sayHelloWorld(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
