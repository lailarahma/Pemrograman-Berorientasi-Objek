public class MobilDemo2{
    public static void main(String[] a){
        Mobil2 avanza = new Mobil2();
        Mobil2 xenia = new Mobil2();
        avanza.hidupkanMobil("Avanza Silver");
        avanza.ubahGigi("Avanza Silver");
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda Avanza         :"+avanza.getRoda());
        System.out.println("Roda Xenia          :"+xenia.getRoda());
        System.out.println("Mesin Avanza        :"+avanza.getMesin());
        System.out.println("Mesin Xenia         :"+xenia.getMesin());
        avanza.setRoda(5);
        System.out.println("Roda Avanza         :"+avanza.getRoda());
        System.out.println("Roda Xenia          :"+xenia.getRoda());
        avanza.setMesin(9);
        xenia.setMesin(9);
        System.out.println("Mesin Avanza        :"+avanza.getMesin());
        System.out.println("Mesin Xenia         :"+xenia.getMesin());
        System.out.println("Mesin Avanza        :"+avanza.getMesin());
        System.out.println("Mesin Xenia         :"+xenia.getMesin());
        avanza.matikanMobil("Avanza Silver");
    }
}