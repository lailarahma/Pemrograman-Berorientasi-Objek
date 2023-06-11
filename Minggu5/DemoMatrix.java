import java.util.Scanner;

public class DemoMatrix {

    public static void main(String[] args) {
        Matrix matriks = new Matrix();
        Scanner input = new Scanner(System.in);
        Matrix matriksA = new Matrix();
        Matrix matriksB = new Matrix();
        Matrix hasil = new Matrix();
        int choice = -1;
        System.out.println("------------ PROGRAM MATRIX ---------");
        while(choice!=0){
            menu();
            choice = input.nextInt();
            if(choice==1){
            matriksA = matriks.inputMatriksA();
            System.out.println("----------- MATRIX A ------------");
            matriks.TampilMatrix(matriksA);
        }
        else if(choice==2){
            matriksB = matriks.inputMatriksB();
            System.out.println("----------- MATRIX B ------------");
            matriks.TampilMatrix(matriksB);
        }
        else if(choice==3){
            hasil = matriks.penjumlahan(matriksA, matriksB);
            System.out.println("-------- HASIL PENJUMLAHAN --------");
            matriks.TampilMatrix(hasil);
        }
        else if(choice==4){
            hasil = matriks.pengurangan(matriksA, matriksB);
            System.out.println("-------- HASIL PENGURANGAN --------");
            matriks.TampilMatrix(hasil);
        }
        else if(choice==5){
            hasil = matriks.perkalian(matriksA, matriksB);
            System.out.println("-------- HASIL PERKALIAN -------");
            matriks.TampilMatrix(hasil);
        }
        else if(choice==6){
            hasil = matriks.transpose(hasil);
            System.out.println("---------- HASIL TRANSPOSE --------");
            matriks.TampilMatrix(hasil);
        }
        else if(choice==7){
            System.out.println("TERIMA KASIH");
            break;
        }
        else{
            System.out.println("------------- Pilihan Tidak Tersedia ----------------");
        }
    }
    System.out.println("SELESAI");
    }
    public static void menu(){
        System.out.println("--------- MENU ----------");
        System.out.println("1. Input Matrix A :");
        System.out.println("2. Input Matrix B :");
        System.out.println("3. Penjumlahan A + B ");
        System.out.println("4. Pengurangan A - B ");
        System.out.println("5. Perkalian A * B ");
        System.out.println("6. Transpose hasil akhir");
        System.out.println("7. Keluar");
        System.out.println("-------------------");
        System.out.print("Pilih menu : ");
    }
}