import java.io.IOException;
import java.text.DecimalFormat;
public class KaryawanDemo {
public static void main(String[] args) throws IOException {
DecimalFormat df = new DecimalFormat("###,###,##0.00");
Karyawan kar = new Karyawan();
KaryawanTetap tetap = new KaryawanTetap();
KaryawanKontrak kontrak = new KaryawanKontrak();
int pilih = -1 ;
kar.inputKar();
while(pilih !=0 ){
if (kar.sts_peg == 1) {
tetap.inputTetap();
System.out.println("Gaji Diterima : " +
df.format(tetap.totalGaji()));
System.out.println("==============");
kar.inputKar();

} else if(kar.sts_peg ==2){
kontrak.inputKontrak();
System.out.println("Upah Diterima : " +
df.format(kontrak.totalUpah()));
System.out.println("==============");
kar.inputKar();
}
else{ 
    System.out.println("Input invalid, program selesai ");
    break;
}
}
}
}