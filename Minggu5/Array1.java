import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("jumlah data : ");
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Data ke -"+ (i+1) +" : ");
            x[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++){
        System.out.println("Hasil nilai ["+ i +"] : " + x[i]);
    }

}
}