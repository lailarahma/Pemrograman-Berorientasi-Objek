import java.util.ArrayList;
public class ArrayListPenjumlahan {
    public static void main(String[] args) {
        ArrayList<Integer> nilai1 = new ArrayList<Integer>();
        ArrayList<Integer> nilai2 = new ArrayList<Integer>();
        ArrayList<Integer> jumlah = new ArrayList<Integer>();
        System.out.println("Nilai 1");
        for(int i=0;i<6;i++)
        {
            nilai1.add(i);
            System.out.println("index ke " + i + "="+nilai1.get(i));
        }
        System.out.println("Nilai 2");
        for(int i=0;i<6;i++)
        {
            nilai2.add(i);
            System.out.println("Index ke " + i + " = " + nilai2.get(i));
        }
        for(int i=0;i<6;i++)
        {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
        } 
        System.out.println("Hasil jumlah nilai1 + nilai2");
        for(int i=0;i<6;i++)
        {
            System.out.println("Jumlah index ke " +i+" = "+jumlah.get(i));
        }
    }
}
