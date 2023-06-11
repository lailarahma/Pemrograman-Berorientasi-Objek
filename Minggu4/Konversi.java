import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Konversi{
    int dtk,mnt,jam,hari,Detik,sisaHari,sisaJam,sisaMenit;
    Scanner sc = new Scanner(System.in);
    Konversi(){}
    public Konversi(int dtk) // konstruktor dengan parameter
    {
        this.dtk=dtk;
    } 
    void inputDetik(){
        System.out.print("Input nilai detik : ");dtk=sc.nextInt();
    }
    void Konversi(){
        hari = dtk/86400;
        sisaHari = dtk % 86400;
        jam = sisaHari / 3600;
        sisaJam = sisaHari % 3600;
        mnt = sisaJam / 60;
        sisaMenit = sisaJam/60;
        Detik = sisaMenit;
    }
    void cetak(){
        System.out.println("==HASIL KONVERSI==");
        System.out.println("Detik : "+dtk);
        System.out.println("Hari  : "+hari);
        System.out.println("Jam   : "+jam);
        System.out.println("Menit : "+mnt);
        System.out.println("Detik : "+Detik);

    }
}