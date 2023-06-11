import java.io.*;
import java.text.DecimalFormat;
class Karyawan {
    public int sts_peg;
    public void inputKar() throws IOException {
    BufferedReader keyboard = new BufferedReader(
    new InputStreamReader(System.in)
    );
    System.out.println("Jenis Karyawan");
    System.out.println("1. Karyawan Tetap");
    System.out.println("2. Karyawan Kontrak");
    System.out.print("Pilihan [1-2] = " );
    sts_peg = Integer.parseInt(keyboard.readLine());
    }
    }