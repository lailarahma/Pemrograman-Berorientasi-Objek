import java.util.Scanner;

public class pecahan{
    public static void main(String[] args) {
        int bilangan,pec;
        Scanner input= new Scanner(System.in);
        System.out.print("Bilangan : ");
        bilangan = input.nextInt();
        for (int a = 1; a <= bilangan; a++) {
            System.out.print(a+" ");
            if (a % 5 == 0 || a == bilangan ) {
                System.out.println("");
            }
        }
        System.out.println("-----------------------");
        System.out.print("Dipecah : "); pec = input.nextInt();
        for (int a = 1; a <=bilangan; a++){
            System.out.print(a+" ");
            if(a%pec==0){
                System.out.println("");
            }
        }
    }

}