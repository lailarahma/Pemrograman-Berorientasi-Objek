import java.util.Scanner;
public class TestHewan {
    public static void main(String[] args) {
        int pil;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("===== MENU PILIHAN =====");
        System.out.println("= 1.Singa              =");
        System.out.println("= 2.Elang              =");
        System.out.println("= 3.Lebah              =");
        System.out.println("= 4.Paus               =");
        System.out.println("= 5.Keluar             =");
        System.out.print("= MASUKKAN PILIHAN ANDA : ");
        pil = input.nextInt();
        switch(pil){
            case 1:
            System.out.println("1.Singa");
            Singa singaku = new Singa();
            singaku.suara();
            singaku.berjalan();
            singaku.bernafas();
            break;
            case 2:
            System.out.println("Elang");
            break;
            case 3:
            System.out.println("3.Lebah");
            break;
            case 4:
            System.out.println("4.Paus");
            break;
            case 5:
            System.out.println("Anda Telah Keluar dari Program");
            default:
            System.out.println("Pilihan Tidak Tersedia");
        }
        }while(pil!=5);
        }
        
    }
