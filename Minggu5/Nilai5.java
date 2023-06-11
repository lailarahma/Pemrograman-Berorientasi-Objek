import java.util.Scanner;
public class Nilai5{
        String nim,nama;
        float tgs,uts,uas,pTgs,pUts,pUas,na;
        char nHuruf;
        String predikat;
        Scanner sc = new Scanner(System.in);
        public Nilai(String nim,String nama,float tgs,float uts,float uas)
        {
            this.nim=nim;
            this.nama=nama;
            this.tgs=tgs;
            this.uts=uts;
            this.uas=uas;
        }
        public Nilai(){}
        void isiData()
        {
            System.out.print("Nim     : ");nim=sc.next();
            System.out.print("Nama    : ");nama=sc.next();
            System.out.print("Tugas   : ");tgs=sc.nextFloat();
            System.out.print("UTS     : ");uts=sc.nextFloat();
            System.out.print("UAS     : ");uas=sc.nextFloat();
        }
        void hitungNilai()
        {
            pTgs=0.3f*tgs;
            pUts=0.35f*uts;
            pUas=0.35f*uas;
            na=pTgs+pUts+pUas;
        }
        void cetakNilai(){
            System.out.println("Nim     : "+nim);
            System.out.println("Nama    : "+nama);
            System.out.println("Tugas   : "+tgs+"    30% : "+pTgs);
            System.out.println("UTS     : "+uts+"    35% : "+pUts);
            System.out.println("UAS     : "+uas+"    35% : "+pUas);
            System.out.println("N.Akhir : "+na);
            System.out.println("Nilai Huruf : "+getNilHuruf(na));
            System.out.println("Predikat : "+getPredikat(nHuruf));
        }
        void judul(){
            System.out.println("Daftar Nilai PBO");
            System.out.println("========================");
            System.out.println();
        }
        void setNim(String nim){this.nim=nim;}
        String getNim(){return nim;}
        char getNilHuruf(float nilai)
        {
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
    }