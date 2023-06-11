import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah agen : ");
        int jmlAgen = input.nextInt();
        PasangIklan[][] pasangIklan = new PasangIklan[jmlAgen][];
        for (int i = 0; i < jmlAgen; i++) {
            System.out.print("Masukkan jumlah nota untuk agen " + (i + 1) + " : ");
            int jmlNota = input.nextInt();

            pasangIklan[i] = new PasangIklan[jmlNota];
            for (int j = 0; j < jmlNota; j++) {
                pasangIklan[i][j] = new PasangIklan("Cabang " + (i + 1));
                pasangIklan[i][j].setNota();
                pasangIklan[i][j].inputJumlah();
                pasangIklan[i][j].inputDurasi();
                pasangIklan[i][j].getTarifIklan();
                pasangIklan[i][j].getDiskon();
                pasangIklan[i][j].getBiayaIklan();
                pasangIklan[i][j].getSouvenir();
                pasangIklan[i][j].getTotal();
            }
        }

        System.out.println("\n\n");
        System.out.println("Daftar Pasang Iklan");
        System.out.println("=============================================");
        System.out.printf("%-10s%-15s%-15s%-15s%-10s%-10s%-10s%-10s%-15s%-20s%n",
                "No. Nota", "Nama Pemasang", "Alamat", "Produk Iklan", "Jumlah", "Durasi",
                "Tarif", "Diskon (%)", "Biaya Iklan", "Total Biaya");

        System.out.println("=============================================");
        for (int i = 0; i < jmlAgen; i++) {
            for (int j = 0; j < pasangIklan[i].length; j++) {
                pasangIklan[i][j].cetak();
            }
        }
    }
}