public class Method {
    public static void main(String[] args) {

        sayHello();
        sayHai("Agung");
        var result1=sum(10,10);
        System.out.println(result1);
        System.out.println(hitung(10,"+", 15));
        System.out.println(hitung(10,"-", 15));
        System.out.println(hitung(10,"*", 15));
    }
    //method tanpa parameter
    static void sayHello(){
        System.out.println("Hello World");
    }
    //method dengan parameter
    static void sayHai(String name){
        System.out.println("hello "+name);
    }
    //method dengan Return value
    static int sum(int a, int b){

    var total = a+b;
    return total;
    }

    static int hitung(int a, String operasi, int b){

        switch (operasi){
            case"+": return a+b;
            case"-": return a-b;

            default: return 0;

        }
    }
}
