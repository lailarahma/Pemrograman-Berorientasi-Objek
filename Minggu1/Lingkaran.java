import java.util.Scanner;
public class Lingkaran{
    static float PHI=3.14f;
public static void main(String args[])
{
    Scanner sc = new Scanner (System.in);
    int r;
    System.out.println("~~~ Lingkaran ~~~");
    System.out.println("Jari  :");r=sc.nextInt();
    System.out.println("PHI  :"+PHI);
    System.out.println("Luas :"+luas(r));
    System.out.println("keliling: "+keliling(r));
}
static float keliling(int r)
{
    return 2*(PHI*r);
}
static float luas(int r)
{
    return PHI*r*r;
}
}