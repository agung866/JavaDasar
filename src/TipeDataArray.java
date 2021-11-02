public class TipeDataArray {

    public static void main(String[] args) {

        String[] array;
        array=new String[3];
        array[0]="agung";
        array[1]="setia";
        array[2]="wan";

        System.out.println(array[0]);

        //mengganti isi array
        array[0]="delvyn";
        System.out.println(array[0]);

        //membuat array langsung memasukan datanya

        int[]arrayInt={9,8,8,7,5};
        int[]arrayInt2=new int[]{9,8,8,7,5};

        System.out.println(arrayInt.length);

        //Array di dalam Array

        int[][] members={{0,1,1},{2,3,5},{2,2,3}};
        System.out.println(members.length);
        System.out.println(members[0][2]);

    }

}
