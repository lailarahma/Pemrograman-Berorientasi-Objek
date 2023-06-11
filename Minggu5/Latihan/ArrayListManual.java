import java.util.ArrayList;
public class ArrayListManual{
public static void main(String args[]){
ArrayList<String> data = new ArrayList<String>();
//memasukkan data kedalam array
data.add("Data 1");
data.add("Data 2");
data.add("Data 3");
data.add("Data 4");
data.add("Data 5");
//menampilkan data
System.out.println(data.get(0)); //data 1
System.out.println(data.get(1)); //data 2
System.out.println(data.get(2)); //data 3
System.out.println(data.get(3)); //data 4
System.out.println(data.get(4)); //data 5
}}