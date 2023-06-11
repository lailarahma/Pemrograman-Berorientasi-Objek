import java.util.Scanner;
public class Kubus{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s;
        System.out.println("~~~ Kubus ~~~");
        System.out.println("Rusuk/Sisi  : ");s=sc.nextInt();
        System.out.println("Luas    : "+luas(s));
        System.out.println("Keliling : "+keliling(s));
    }
    static float keliling (int s)
    {
        return 12*s;
    }
    static float luas(int s)
    {
        return 6*s*s;
    }
}