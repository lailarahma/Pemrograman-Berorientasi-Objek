import java.util.Scanner;
public class DemoSorting {
    public static void main(String[] args) {
    Sorting bs = new Sorting();
    Scanner scanner = new Scanner(System.in);
    System.out.println("============ PROGRAM SORTING ===========");
    System.out.print("Jumlah bilangan : ");
    int n = scanner.nextInt();
    
    int arr[] = new int[n];
    int temp[] = new int[n];
    System.out.print("Input : ");
    for(int i=0; i<n;i++)
    {
    arr[i] = scanner.nextInt();
    temp[i] = arr[i];
    }
    System.out.println();
    System.out.println("------------ BUBBLE SORT ------------");
    bs.bubbleSort(arr);
    System.out.print("Hasil sorting : ");
    bs.printArray(arr);
    for(int i =0 ; i < n; i++){
    arr[i] = temp[i];
    }
    
    System.out.println("------------ QUICK SORT ------------");
    bs.quickSort(arr, 0, n-1);
    System.out.print("Hasil sorting : ");
    bs.printArray(arr);
    for(int i =0 ; i < n; i++){
    arr[i] = temp[i];
    }
 
    System.out.println("------------ INSERTION SORT ------------");
    bs.insertionSort(arr);
    System.out.print("Hasil sorting : ");
    bs.printArray(arr);
    for(int i =0 ; i < n; i++){
    arr[i] = temp[i];
    }
    
    System.out.println("------------ SELECTION SORT ------------");
    bs.selectionSort(arr);
    System.out.print("Hasil sorting : ");
    bs.printArray(arr);
    for(int i =0 ; i < n; i++){
    arr[i] = temp[i];
    }

    System.out.println("------------ MERGE SORT ------------");
    bs.mergeSort(arr, 0, n-1);
    System.out.print("Hasil sorting : ");
    bs.printArray(arr);
    for(int i =0 ; i < n; i++){
    arr[i] = temp[i];
    }

    }
    }