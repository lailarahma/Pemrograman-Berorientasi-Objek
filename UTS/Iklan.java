import java.util.Scanner;

class Iklan {
    String kodeIklan, nmIklan;
    int tarifIklan, durasi;

    void inputIklan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode iklan: ");
        kodeIklan = input.nextLine();
        System.out.print("Masukkan nama iklan: ");
        nmIklan = input.nextLine();
        System.out.print("Masukkan tarif iklan: ");
        tarifIklan = input.nextInt();
    }

    int getTarifIklan() {
        return tarifIklan;
    }

    void inputDurasi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Durasi (hari): ");
        durasi = input.nextInt();
    }
}

class PasangIklan extends Iklan {
    String noNota, nama, alamat, souvenir;
    int jmlIklan, durasi, diskon, biayaIklan, ppn, totBiaya;

    public PasangIklan(String cabang) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- CABANG " + cabang.toUpperCase() + " ---");
        System.out.println("=== PASANG IKLAN ===");
        System.out.print("Masukkan nomor nota: ");
        noNota = input.nextLine();
        System.out.print("Masukkan nama pemasang: ");
        nama = input.nextLine();
        System.out.print("Masukkan alamat: ");
        alamat = input.nextLine();
        System.out.println("Pilih kode produk iklan:");
        System.out.println("1. Iklan Baris");
        System.out.println("2. Iklan Display");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            nmIklan = "Iklan Baris";
            tarifIklan = 20000;
            System.out.print("Masukkan jumlah baris: ");
            jmlIklan = input.nextInt();
        } else if (pilihan == 2) {
            nmIklan = "Iklan Display";
            tarifIklan = 25000;
            System.out.print("Masukkan luas (mmk): ");
            jmlIklan = input.nextInt();
        }
        System.out.print("Masukkan durasi (hari): ");
        durasi = input.nextInt();
        System.out.print("Masukkan diskon (%): ");
        diskon = input.nextInt();
    }

    void setNota() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor nota: ");
        noNota = input.nextLine();
    }

    void inputJumlah() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah iklan: ");
        jmlIklan = input.nextInt();
    }

    int getDiskon() {
        return diskon;
    }

    int getBiayaIklan() {
        biayaIklan = tarifIklan * jmlIklan * durasi - (tarifIklan * jmlIklan * durasi * diskon / 100);
        return biayaIklan;
    }

    String getSouvenir() {
        if (nmIklan.equals("Iklan Display")) {
            if (durasi >= 3 && durasi <= 6) {
                souvenir = "Mug";
            } else if (durasi >= 7 && durasi <= 10) {
                souvenir = "Payung";
            } else if (durasi >= 11 && durasi <= 14) {
                souvenir = "Tas";
            }
        } else {
            souvenir = "-";
        }
        return souvenir;
    }

    int getTotal() {
        totBiaya = (int) (biayaIklan + (0.1 * biayaIklan));
        return totBiaya;
    }

    void cetak() {
        System.out.printf("%-10s%-15s%-15s%-15s%-10s%-10s%-10s%-10s%-15s%-20s%n",
                noNota, nama, alamat, nmIklan, jmlIklan, durasi, getTarifIklan(), diskon, getBiayaIklan(),
                getTotal());
    }

}
