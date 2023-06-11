import java.util.Scanner;
public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("===== PROGRAM QUEUE =====");
        System.out.print("Input Max Data : ");
        int max = input.nextInt();
        while(true){
            System.out.println("===== MENU =====");
            System.out.println("1. Insert ");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            System.out.println("7. Print Queue");
            System.out.println("8. Exit");
            System.out.print("Your Choice ? "); choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("insert data : ");
                        int data = input.nextInt();
                        if(!queue.isFull()){
                            queue.enqueue(data);
                        }else{
                            System.out.println("Queue is Full");
                        }
                    break;
                    case 2:
                        if(!queue.isEmpty()){
                            System.out.println("Remove data : "+queue.dequeue());
                        }else{
                            System.out.println("Queue is Empty");
                        }
                    break;
                    case 3:
                        System.out.println("Front : "+queue.getFront()); 
                    break;
                    case 4:
                        if(queue.isEmpty()){
                            System.out.println("Queue is Empty");
                        }else{
                            System.out.println("Queue is Not Empty");
                        }
                        break;
                    case 5:
                        if(queue.isFull()){
                            System.out.println("Queue is Full");
                        }else{
                            System.out.println("Queue is Not Full");
                        }
                        break;
                    case 6:
                        System.out.println("Size : "+queue.getSize()+ "/"+queue.maximumSize);
                        break;
                    case 7:
                        queue.display();
                        break;
                    case 8:
                        System.exit(0);
                        break;
                    default: System.out.println("Pilihan Tidak Ada");
                        break;
                    }
                }
            }
}