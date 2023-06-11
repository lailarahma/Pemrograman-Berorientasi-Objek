import java.util.Scanner;

public class Matrix {
    Scanner input = new Scanner(System.in);
    int [][] matriks;
    int baris,kolom;
    Matrix(int [][] matriks,int baris,int kolom){
        this.matriks = matriks;
        this.baris = baris;
        this.kolom = kolom;
    }

    Matrix(int baris,int kolom){
        this.baris = baris;
        this.kolom = kolom;
        int [][] penampung = new int[baris][kolom];
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                penampung[i][j] = 0;
            }
        }
        this.matriks = penampung;
    }
    public Matrix(){

    }

    //Penjumlahan
    public Matrix penjumlahan(Matrix matriks1, Matrix matriks2){
        Matrix hasil = new Matrix();
        if(matriks1.baris == matriks2.baris && matriks1.kolom ==matriks2.kolom){
            hasil = new Matrix(matriks1.baris,matriks1.kolom);
            for(int i=0;i<matriks1.baris;i++){
                for(int j=0;j<matriks1.kolom;j++){
                    hasil.matriks[i][j] = matriks1.matriks[i][j] +matriks2.matriks[i][j];
                }
            }
        }
        else{
            System.out.println("Dimensi Matriks Tidak Sama");
        }
        return hasil;
    }
    //Pengurangan
    public Matrix pengurangan(Matrix matriks1, Matrix matriks2){
        Matrix hasil = new Matrix();
        if(matriks1.baris == matriks2.baris && matriks1.kolom == matriks2.kolom){
            hasil = new Matrix(matriks1.baris,matriks1.kolom);
            for(int i=0;i<matriks1.baris;i++){
                for(int j=0;j<matriks1.kolom;j++){
                    hasil.matriks[i][j] = matriks1.matriks[i][j] - matriks2.matriks[i][j];
                }
            }
        }
        else{
            System.out.println("Dimensi Matriks Tidak Sama");
        }
        return hasil;
    }
    //Perkalian
    public Matrix perkalian(Matrix matriks1, Matrix matriks2){
        Matrix hasil = new Matrix();
        if(matriks1.kolom == matriks2.baris){
            hasil = new Matrix(matriks1.baris,matriks2.kolom);
            for(int i=0;i<matriks1.baris;i++){
                for(int j=0;j<matriks2.kolom;j++){
                    for(int k=0;k<matriks1.kolom;k++){
                        hasil.matriks[i][j] += matriks1.matriks[i][k] * matriks2.matriks[k][j];
                    }
                }
            }
        }
        else{
            System.out.println("Dimensi Matriks Tidak Sama");
        }
        return hasil;
    }
    //Transpose
    public Matrix transpose(Matrix matriks){
        Matrix hasil = new Matrix(matriks.kolom,matriks.baris);
        for(int i=0;i<matriks.baris;i++){
            for(int j=0;j<matriks.kolom;j++){
                hasil.matriks[j][i] = matriks.matriks[i][j];
            }
        }
        return hasil;
    }
    //TampilMatrix
    public static void TampilMatrix(Matrix matriks){
        Matrix erorr = new Matrix();
        if(matriks.matriks== erorr.matriks){
            System.out.println("Dimensi Matriks Tidak Sama");
        }
        else{
            for(int i=0;i<matriks.baris;i++){
                for(int j=0;j<matriks.kolom;j++){
                    System.out.print(matriks.matriks[i][j] + " ");
                }
                System.out.println("\n");
            }
        }
    }
    //InputMatrix A
    public static Matrix inputMatriksA(){
        int baris,kolom;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Baris : ");
        baris = input.nextInt();
        System.out.print("Masukkan Kolom : ");
        kolom = input.nextInt();
        int[][] matriks = new int[baris][kolom];
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print("Masukkan Elemen Matriks A [" + i + "][" + j + "] : ");
                matriks[i][j] = input.nextInt();

                }
            }
            Matrix matriks1 = new Matrix(matriks,baris,kolom);
            return matriks1;
        }
    //InputMatrix B
    //InputMatrix A
    public static Matrix inputMatriksB(){
        int baris,kolom;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Baris : ");
        baris = input.nextInt();
        System.out.print("Masukkan Kolom : ");
        kolom = input.nextInt();
        int[][] matriks = new int[baris][kolom];
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print("Masukkan Elemen Matriks B [" + i + "][" + j + "] : ");
                matriks[i][j] = input.nextInt();
            }
        }
        Matrix matriks2 = new Matrix(matriks,baris,kolom);
        return matriks2;
    }
}