public class TestPesawat {
    public static void main(String[] args) {
        Pesawat airbus = new Pesawat();
        airbus.Pesawat();
        airbus.Pesawat();
        PesawatTempur f16 = new PesawatTempur();
        f16.PesawatTempur();
        System.out.println("...airbus...");
        airbus.terbang();
        airbus.mendarat();
        System.out.println("...f16...");
        f16.terbang();
        f16.mendarat();
        f16.manuver();
    }
}
