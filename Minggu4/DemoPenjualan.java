import java.util.Scanner;
public class DemoPenjualan {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String lagi;
    Penjualan penjualanku = new Penjualan();
    do{
    penjualanku.inputData();
    penjualanku.getTotalPembelian();
    penjualanku.getBonus();
    penjualanku.cetakNota();
    System.out.print("Input data lagi[Y/T] ?");lagi=input.next();
    }while(lagi.equals("Y") || lagi.equals("y"));
}

}
