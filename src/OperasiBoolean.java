public class OperasiBoolean {

    public static void main(String[] args) {

        //&& dan
        // || atau
        //! keablikan

        var absen=70;
        var nilaiAkhir=80;

        boolean lulusAbsen = absen>=75;
        boolean lulusNilai = nilaiAkhir>=75;

        var lulus = lulusAbsen && lulusNilai;
        var remed =lulusAbsen ||lulusNilai;
        System.out.println(lulus);
        System.out.println(remed);


    }

}
