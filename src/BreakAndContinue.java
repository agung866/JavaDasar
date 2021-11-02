public class BreakAndContinue {
    public static void main(String[] args) {
        //break menghentikan sebuah kondisi

        var counter = 1;
        while(true){
            System.out.println("perulangan"+counter);
            counter++;

            if(counter> 5){
                break;
            }
        }
        System.out.println("perulangan berhenti");

        //continue = menghentikan perulangan saat ini dan melanjutkan ke perulangan selanjutnya

        int i;
        for(i=1;i<=20;i++){
            if(i%2==1){
                continue;
            }
            System.out.println("Print angka genap "+ i);
        }
    }
}
