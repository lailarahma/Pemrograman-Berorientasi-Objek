import java.util.Scanner;
public class Persegi{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s;
        System.out.println("~~~ Persegi ~~~");
        System.out.println("Sisi     : ");s=sc.nextInt();
        System.out.println("Luas     : "+luas(s));
        System.out.println("Keliling : "+keliling(s));
    }
static float keliling (int s)
{
    return 4*s;
}
static float luas(int s)
{
    return s*s;
}
}