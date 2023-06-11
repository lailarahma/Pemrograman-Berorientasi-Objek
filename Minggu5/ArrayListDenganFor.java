import java.util.ArrayList;
public class ArrayListDenganFor {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        for(int i=0;i<5;i++){
            data.add("Data "+(i+1));
        }
        //menampilkan data
        for(int i=0;i<5;i++){
            System.out.println(data.get(i));
        }
    }
    
}
