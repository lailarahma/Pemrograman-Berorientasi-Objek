import java.util.Scanner;

public class NilaiDemo{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String lagi;
            Nilai nilaiku = new Nilai();
            do{
            nilaiku.isiData();
            nilaiku.hitungNilai();
            nilaiku.cetakNilai();
            System.out.println("Input data lagi [Y/T] ?");lagi=input.next();
            }while(lagi.equals("Y")||lagi.equals("y"));
    }
}