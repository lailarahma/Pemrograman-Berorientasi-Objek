public class PesawatTempur extends Pesawat {
    void PesawatTempur(){
        System.out.println("object pesawat tempur dibuat....");
    }   
    void manuver(){
        System.out.println("manuver....");
    } 
    void terbang(){
        super.terbang();
        System.out.println("terbang ala tempur....");
    }
}
