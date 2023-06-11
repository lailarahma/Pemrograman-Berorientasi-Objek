import java.util.Scanner;//import the scanner class
//import javax.sound.sampled.SourceDataLine;
public class MatematikaDemo {
    public static void main(String[] a) {
        Scanner myObj = new Scanner( System.in);
        Matematika mtkku = new Matematika();
        mtkku.pertambahan(20, 10);
        mtkku.pengurangan(10, 5);
        mtkku.perkalian(10, 20); 
        mtkku.pembagian(20, 2);
        System.out.print("Nilai 1 : ");
        float b = myObj.nextFloat();
        System.out.print("Nilai 2 : ");
        float c = myObj.nextFloat();
        System.out.println("Hasil pertambahan : "+mtkku.pertambahan(b, c));
        System.out.println("Hasil pengurangan : "+mtkku.pengurangan(b, c));
        System.out.println("Hasil perkalian   : "+mtkku.perkalian(b, c));
        System.out.println("hasil pembagian   : "+mtkku.pembagian(b, c));
        System.out.print("Double a : ");
        double d = myObj.nextDouble();
        System.out.print("Double b : ");
        double e = myObj.nextDouble();
        System.out.print("Double c : ");
        double f = myObj.nextDouble();
        System.out.println("Hasil pertambahan : "+mtkku.pertambahan(d, e, f));
        System.out.println("Hasil pengurangan : "+mtkku.pengurangan(d, e, f));
        System.out.println("Hasil perkalian   : "+mtkku.perkalian(d, e, f));
        System.out.println("hasil pembagian   : "+mtkku.pembagian(d, e, f));
    }   
}   
