import java.util.Scanner;

public class Determinan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lagi;
        double a,b,c,D,x1,x2;
        do{
            System.out.print("Input a : ");a= sc.nextDouble();
            System.out.print("Input b : ");b= sc.nextDouble();
            System.out.print("Input c : ");c= sc.nextDouble();
            System.out.println("Nilai a : "+a);
            System.out.println("Nilai b : "+b);
            System.out.println("Nilai c : "+c);
            D=(b*b)-(4*a*c);
            System.out.println("Determinan : "+D);
            if (D>0){
            
                x1 = (-b + Math.sqrt(D)) / (2*a);
                x2 = (-b - Math.sqrt(D)) / (2*a);
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
              }
              else if (D==0){
                System.out.println(" (akar real dan sama)");
                x1 = x2 = (-b + Math.sqrt(D)) / (2*a);
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
              }
              else {
                x1 = (-b / (2*a))+Math.sqrt(D)/(2*a);
                x2 = (-b / (2*a))-Math.sqrt(D)/(2*a);
               
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
              } 
              System.out.println("Input data lagi [Y/T] ?");lagi=sc.next();
    }while(lagi.equals("Y")||lagi.equals("y"));
}
}
