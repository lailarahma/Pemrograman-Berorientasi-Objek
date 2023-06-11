import java.util.Scanner;

public class KonversiDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Konversi konversi = new Konversi();
        String lagi;
        do{
        konversi.inputDetik();
        konversi.Konversi();
        konversi.cetak();
        System.out.print("Input data lagi[Y/T] ?");lagi=input.next();
        }while(lagi.equals("Y")||lagi.equals("y"));
        }
}
