public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));

    }
    //bukan recursive
    static int factorial(int value){
        var result=1;
        for (int i =1;i<=value;i++){

            result*=i;

        }
        return result;
    }
    //ini recursive
    static int factorialRecursive(int value){
        if(value==1){
            return 1;
        }else{
            return value*factorialRecursive(value-1);
        }

    }
}
