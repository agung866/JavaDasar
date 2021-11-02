public class MethodVariableArgumen {
    public static void main(String[] args) {

        saySelamat("agung",80,80,75,90,50,40);

    }
    static void saySelamat(String name, int... values){
        var total =0;
        for (var value:values) {
        total+=value;
        }
        var finalValue=total/values.length;

        if(finalValue >= 75){
            System.out.println("selamat "+name+" anda lulus");
        }else{
            System.out.println("anda gagal");
        }
    }
}
