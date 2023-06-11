import java.util.Scanner;
public class Penjualan {
    Scanner sc = new Scanner(System.in);
    String kode,nama,bonus;
    float harga;
    int jumlah, totalpembelian;
    
    void setData(String kode, String nama , float harga , int jumlah)
    {
        this.kode=kode;
        this.nama=nama;
        this.harga=harga;
        this.jumlah=jumlah;
    }
    public Penjualan(){}
    void inputData()
    {
        System.out.print("Kode barang : ");kode=sc.next();
        System.out.print("Nama barang : ");nama=sc.next();
        System.out.print("Harga       : ");harga=sc.nextFloat();
        System.out.print("Jumlah      : ");jumlah=sc.nextInt();
    }
    int getTotalPembelian(){
        totalpembelian =(int)harga*jumlah;
        return totalpembelian;
    }
    void getBonus(){
        if(totalpembelian>=500000 && jumlah > 5){
            bonus="Setrika";
            System.out.println("Bonus : "+bonus);
        }else if (totalpembelian >= 100000 && jumlah > 3){
            bonus = "Payung";
            System.out.println("Bonus : "+bonus);
        }else if(totalpembelian >=50000 || jumlah > 2){
            bonus = "Ballpoint";
            System.out.println("Bonus : "+bonus);
        }else{
            System.out.println(" Tidak Mendapat Bonus");
        }

    }
    void cetakNota()
    {   
        System.out.println("--------------------------");
        System.out.println("NOTA PEMBELIAN BARANG ");
        System.out.println("--------------------------");
        System.out.println("Kode barang : "+kode);
        System.out.println("Nama barang : "+nama);
        System.out.println("Harga       : "+harga);
        System.out.println("Jumlah      : "+jumlah);
        System.out.println("Total       : "+getTotalPembelian());  
        System.out.println("Bonus       : "+bonus);      
    }
}
