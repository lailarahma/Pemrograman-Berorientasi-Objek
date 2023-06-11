import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahdata;
        ArrayList<Integer> nilai1 = new ArrayList<Integer>();
        ArrayList<Integer> nilai2 = new ArrayList<Integer>();
        ArrayList<Integer> jumlah = new ArrayList<Integer>();
        ArrayList<Integer> pengurangan = new ArrayList<Integer>();
        ArrayList<Integer> perkalian = new ArrayList<Integer>();
        ArrayList<Integer> Pembagian = new ArrayList<Integer>();
        System.out.print("Masukkan Jumlah Data : "); jumlahdata = input.nextInt();
        //Nilai 1
        System.out.println("Nilai 1: ");
            for(int i=0;i<jumlahdata;i++){
                System.out.print("Index ke "+i+" = ");
                nilai1.add(input.nextInt());
            }
        //Nilai 2
        System.out.println("Nilai 2: ");
            for(int i=0;i<jumlahdata;i++){
                System.out.print("Index ke "+i+" = ");
                nilai2.add(input.nextInt());
            }
        //Main Menu
        int Pilihan;
        //Menu
        while(true){
            System.out.println("===== PROGRAM ARRAY LIST =====");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Exit");
            System.out.print("Pilihan : "); Pilihan = input.nextInt();
                switch (Pilihan) {
                    case 1:
                    System.out.println("Jumlah ");
                        for(int i=0;i<jumlahdata;i++){
                            jumlah.add(nilai1.get(i)+nilai2.get(i));
                        }
                        for(int i=0;i<jumlahdata;i++){
                            System.out.println("Jumlah Index ke "+i+" = "+jumlah.get(i));
                        }
                    break;
                    case 2:
                    System.out.println("Pengurangan ");
                        for(int i=0;i<jumlahdata;i++){
                            pengurangan.add(nilai1.get(i)-nilai2.get(i));
                        }
                        for(int i=0;i<jumlahdata;i++){
                            System.out.println("Pengurangan Index ke "+i+" = "+pengurangan.get(i));
                        } 
                    break;
                    case 3:
                    System.out.println("Perkalian ");
                        for(int i=0;i<jumlahdata;i++){
                            perkalian.add(nilai1.get(i)*nilai2.get(i));
                        }
                        for(int i=0;i<jumlahdata;i++){
                            System.out.println("Perkalian Index ke "+i+" = "+perkalian.get(i));
                        } 
                    break;
                    case 4:
                    System.out.println("Pembagian ");
                        for(int i=0;i<jumlahdata;i++){
                            Pembagian.add(nilai1.get(i)/nilai2.get(i));
                        }
                        for(int i=0;i<jumlahdata;i++){
                            System.out.println("Pembagian Index ke "+i+" = "+Pembagian.get(i));
                        }
                    break;
                    case 5:
                        System.exit(0);
                        break;
                    default: System.out.println("Pilihan Tidak Ada");
                        break;
                }
        }
    } 
}