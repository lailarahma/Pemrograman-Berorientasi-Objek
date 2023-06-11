import java.util.Scanner;
class Perdana {
    int barCode;
    float hrgBeli, hrgJual;
    String nmKartu;
    Scanner in = new Scanner(System.in);

    void inputPerdana() {
        System.out.print("Barcode         : ");
        barCode = in.nextInt();
        System.out.print("Nama Produk     : ");
        nmKartu = in.next();
        System.out.print("Harga Beli      : ");
        hrgBeli = in.nextFloat();
    }
}

class Grosir extends Perdana {
    String ketByr, souvernir;
    int noNota, jmlJual, jnsByr, wktTempo;
    double totJual, ppn, bunga, totByr;
    

    Grosir() {
    }

    Grosir(String cabang) {
        super();
        System.out.println("Grosir Kartu Perdana " + cabang + ">");
    }
    void setNota() {
        noNota++;
        System.out.println("No. Nota        : " + noNota);
        inputPerdana();
        hitungJual();
        inputJumlah();
        totJual = jmlJual * hrgJual;
        System.out.println("Total           : " + totJual);
        inputJenis();
        System.out.print("Waktu Tempo     : ");
        if (jnsByr == 2) {
        wktTempo = in.nextInt();
        } else {
        wktTempo = 0;
        }
        ppn = 0.11 * totJual;
        System.out.println("\nPPN             : " + ppn);
        if (wktTempo > 1) {
            bunga = 0.05 * totJual;
        } else {
            bunga = 0;
        }
        System.out.println("Bunga           : " + bunga);
        totByr = totJual + ppn + bunga;
        System.out.println("Total Bayar     : " + totByr);
        getSouvenir();
    }
    
    void inputJenis() {
        System.out.println("Jenis Bayar     : ");
        System.out.println("1.Cash ");
        System.out.println("2.Tempo");
        System.out.print("Pilihan         : ");
        jnsByr = in.nextInt();
        if (jnsByr == 1) {
            ketByr = "Cash";
        } else if (jnsByr == 2) {
            ketByr = "Tempo";
        }
        System.out.println("Ket. Bayar      : " + ketByr);
    }

    void getSouvenir(){
        if(jnsByr == 1){
            if (totByr >= 100000 && totByr <= 500000) {
                souvernir = "Mug";
            } else if (totByr >= 500001 && totByr <= 750000) {
                souvernir = "Payung";
            } else if (totByr >= 750001 && totByr <= 1000000) {
                souvernir = "Tas";
            } else if (totByr >= 1000001) {
                souvernir = "Voucher 100.000";
            }  else{
                souvernir = "Tidak ada souvenier";
            }
        } else{
            souvernir = "Tidak ada souvenier";
        }
        System.out.println("Souvenir        : " + souvernir);
        }
    void inputJumlah() {
        System.out.print("Jumlah Jual     : ");
        jmlJual = in.nextInt();
    }

    void hitungJual() {
        if (hrgBeli > 200000) {
            hrgJual = hrgBeli + (0.5f * hrgBeli);
        } else if (hrgBeli > 100000) {
            hrgJual = hrgBeli + (0.75f * hrgBeli);
        } else if (hrgBeli > 50000) {
            hrgJual = hrgBeli + (1.0f * hrgBeli);
        } else if (hrgBeli > 25000) {
            hrgJual = hrgBeli + (1.5f * hrgBeli);
        } else if (hrgBeli < 25000) {
            hrgJual = hrgBeli + (2.0f * hrgBeli);
        }

        System.out.println("Harga Jual      : " + hrgJual);
    }

    public double getHargaJual() {
        return hrgJual;
    }
   
    void cetak() {
        setNota();
        
        
    }
}
