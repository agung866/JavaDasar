public class SwitchStatment {
    public static void main(String[] args) {

        var nilai =60;

        switch(nilai) {
            case 70:
                System.out.println("greet");
                break;
            case 80:
            case 90:
                System.out.println("excelent");
                break;
            case 100:
                System.out.println("Perfect");
                break;
            default:
                System.out.println("bad");
                break;
        }
         // switch Lambda tanpa break;
            var nilai1="A";

        switch (nilai1){
            case"A"-> System.out.println("Anda Lulus dengan Perfect");
            case"B"-> System.out.println("Anda Lulus dengan baik");
            case"C"-> System.out.println("Anda Lulus ");
            case"D"-> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Anda Salah Jurusan");
            }

            // tanpa kata kunci yield
        }
        String ucapan;
        switch (nilai1) {
            case "A" -> ucapan = "Anda Lulus dengan Perfect";
            case "B" -> ucapan = "Anda Lulus dengan baik";
            case "C" -> ucapan = "Anda Lulus ";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Anda Salah Jurusan";
            }

        }
        System.out.println(ucapan);



        ucapan= switch (nilai1) {
            case "A" : yield "Anda Lulus dengan Perfect";
            case "B" : yield "Anda Lulus dengan baik";
            case "C" : yield "Anda Lulus ";
            case "D" : yield "Anda Tidak Lulus";
            default : yield "Anda Salah Jurusan";

        };
        System.out.println(ucapan);
    }
}
