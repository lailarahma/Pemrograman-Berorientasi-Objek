import java.io.*;
public class KaryawanKontrak extends Karyawan {
double upahHarian;
int jmlAnak, hariMasuk;
public void inputKontrak() throws IOException {
BufferedReader keyboard = new BufferedReader(
new InputStreamReader(System.in));
System.out.println("\n~~ Karyawan Kontrak ~~");

System.out.print("Upah Harian : ");
upahHarian = Double.parseDouble(keyboard.readLine());
System.out.print("Jumlah Masuk : ");
hariMasuk = Integer.parseInt(keyboard.readLine());
System.out.print("Jumlah Anak : ");
jmlAnak = Integer.parseInt(keyboard.readLine());
}
public double totalUpah() {
return upahHarian * hariMasuk + (jmlAnak * (0.1 * upahHarian));
}
}