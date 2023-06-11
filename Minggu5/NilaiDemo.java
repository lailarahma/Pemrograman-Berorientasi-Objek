import java.util.Scanner;
public class NilaiDemo {
    public static void main(String[] args) {
        nilai nilaiku = new nilai("A11.2021.13475","Laila",95,95,100);
        Scanner input = new Scanner(System.in);
        String inputlagi;
        int jmlMhs;
        nilaiku.hitungNilai();
        nilaiku.cetakNilai();
        System.out.println("------------------------------------------");

        System.out.print("Masukan Data Jumlah Mahasiswa : ");
        jmlMhs = input.nextInt();
        nilai[] nilaiN = new nilai[jmlMhs];
        for(int a=0; a<jmlMhs; a++){
            nilaiN[a] = new nilai();
            System.out.println("Data Mahasiswa ke "+(a+1));
            nilaiN[a].isiData();
            nilaiN[a].hitungNilai();
            nilaiN[a].cetakNilai();
        }
        nilaiN[0].judul();
        for(int a=0;a<jmlMhs;a++){
            nilaiN[a].daftarNilai();
        }  
    }
}
