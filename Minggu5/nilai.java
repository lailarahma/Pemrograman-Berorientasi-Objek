import java.util.Scanner;
public class nilai{
    String nim,nama,predikat;
    float tgs,uts,uas,pTgs,pUts,pUas,na;
    char nHuruf;
    Scanner sc=new Scanner(System.in);
    public nilai(String nim,String nama, float tgs, float uts, float uas){
        this.nim=nim;
        this.nama=nama;
        this.tgs=tgs;
        this.uts=uts;
        this.uas=uas;
    }
    public nilai(){}
    void isiData(){
        System.out.println("Masukkan Data");
        System.out.print("Nim     : ");nim=sc.next();
        System.out.print("Nama    : ");nama=sc.next();
        System.out.print("Tugas   : ");tgs=sc.nextFloat();
        System.out.print("Uts     : ");uts=sc.nextFloat();
        System.out.print("Uas     : ");uas=sc.nextFloat();
    }
    void hitungNilai(){
        pTgs=0.3f*tgs;
        pUts=0.35f*uts;
        pUas=0.35f*uas;
        na=pTgs+pUts+pUas;
    }
    void cetakNilai(){
        System.out.println("Nim     : "+nim);
        System.out.println("Nama    : "+nama);
        System.out.println("Tugas   :  "+tgs+" 30% : "+pTgs);
        System.out.println("Uts     : "+pUts+" 35% : "+pUts);
        System.out.println("Uas     : "+pUas+" 35% : "+pUas);
        System.out.println("N.akhir : "+na);
        System.out.println("Nilai Huruf : "+getNilHuruf(na));
        System.out.println("Predikat : "+getPredikat(nHuruf));
    }

    char getNilHuruf(float nilai){
        if(nilai>=85)
        nHuruf='A';
        else if(nilai>=70 && nilai<85)
        nHuruf='B';
        else if(nilai>=60 && nilai<70)
        nHuruf='C';
        else if(nilai>=40 && nilai<60)
        nHuruf='D';
        else
        nHuruf='E';
        return nHuruf;
    }

    String getPredikat(char huruf){
        switch(huruf)
        {
        case 'A':predikat="Apik";
        break;
        case 'B':predikat="Baik";
        break;
        case 'C':predikat="Cukup";
        break;

        case 'D':predikat="Dablek";
        break;
        default:predikat="Elek";
        }
        return predikat;
        }

    void judul(){
        System.out.println("---Daftar Nilai---");
        System.out.println("Nim     \tNilai Akhir   \tNilai Huruf   \tPredikat");       
    }

    void daftarNilai(){
        System.out.println(nim+"\t" +nama+"\t" +na+"\t\t" +nHuruf+ "\t\t" +predikat);
        }

}