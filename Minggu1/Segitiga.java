import java.util.Scanner;
public class Segitiga{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t,s;
        System.out.println("~~~ Segitiga (Sama Sisi) ~~~");
        System.out.println("Tinggi      : ");t=sc.nextInt();
        System.out.println("Alas/Sisi   : ");s=sc.nextInt();
        System.out.println("Luas        : "+luas(s,t));
        System.out.println("Keliling    : "+keliling(s));
    }
static float keliling (int s)
{
    return 3*s;
}
static double luas(int s,int t)
{
    return 0.5*s*t;
}
}