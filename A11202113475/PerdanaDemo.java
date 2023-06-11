import java.util.Scanner;

public class PerdanaDemo {
    public static void main(String[] args) {
        char pil;
        Scanner scan = new Scanner(System.in);
        Grosir grosir = new Grosir("Laila Rahmatin Nisa - A11.2021.13475");

        do{
            grosir.cetak();
            System.out.print("Tambah data (Y / T ) : ");
            pil = scan.next().charAt(0);
        }while (pil == 'Y' || pil == 'y');
        
    }
}