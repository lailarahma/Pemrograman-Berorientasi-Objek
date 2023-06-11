import java.util.Scanner;

public class Pecah {
    public static void main(String[] args) {
        int bil;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Bilangan : ");
        bil=sc.nextInt();
        for(int i=1;i<=bil;i++)
        {
            System.out.print(i+" ");
            if(i%5==0) 
            {
                System.out.println();
            }
        }
        System.out.println("------------------");
        System.out.printf("Pecah : ");
        int pecah = sc.nextInt();
        for(int i = 1; i <= bil; i++){
        System.out.printf(i + " ");
            if(i%pecah==0){
                System.out.println();
            }
        }

    }
}
 