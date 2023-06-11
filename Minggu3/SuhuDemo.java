import java.util.Scanner;
public class SuhuDemo {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter celcius : ");
    int c = myObj.nextInt();
    System.out.println("Celcius is  : "+c);
    Suhu suhuku = new Suhu();
    suhuku.setC(36);
    System.out.println("Celcius     : "+suhuku.getC());
    System.out.println("Kelvin      : "+suhuku.cToK());
    System.out.println("Fahrenheit  : "+suhuku.cToF());
    System.out.println("Rankine     : "+suhuku.cToRa());
    System.out.println("Delisle     : "+suhuku.cToDe());
    System.out.println("Newton      : "+suhuku.cToN());
    System.out.println("Reaumur     : "+suhuku.cToRe());
    System.out.println("Romer       : "+suhuku.cToRo());
    }
}
