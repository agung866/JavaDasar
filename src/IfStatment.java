public class IfStatment {

    public static void main(String[] args) {

         var nilai=80;
         var absen=80;

         if(nilai >=75 && absen>=75){
             System.out.println("Anda Lulus");
         }else{
             System.out.println("Anda Gagal");
         }

         var nilaiA=40;
         var nilaiB=90;
         var rata =(nilaiA+nilaiB)/2;

         if(rata >=90){
             System.out.println("Nilai Anda A");
         }else if(rata >=75){
             System.out.println("Nilai Anda B");
         }else if(rata >=60){
             System.out.println("nilai Anda C");
         }else if(rata >=50){
             System.out.println("Nilai Anda D");
         }else{
             System.out.println("nilai Anda E");
         }

    }

}
