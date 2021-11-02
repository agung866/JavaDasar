public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("agung");
        sayHello("agung","Setiawan");

    }
    static void sayHello(String firstName){
        System.out.println("hello "+firstName);

    }
    static void sayHello(String firstName,String lastName){
        System.out.println("hello "+firstName+lastName);
    }
    static void sayHello(){
        System.out.println("hello");

    }
}
