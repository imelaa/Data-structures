import java.util.Scanner;

public class queue {
    Scanner read = new Scanner(System.in);
    int e, s, size;
    int col[];

    public queue(int si) {
        size = si;
        col = new int[size];
        s = 0;
        e = 0;

    }

    public void encolar() {
        if (llena() == 1) {
            System.out.println("La cola esta llena");
            return;
        } else {
            System.out.println("Give the data to insert");
            int data = read.nextInt();
            col[e] = data;
            e++;
            System.out.println(" has been inserted in the Queue");

        }

    }

    public int desencolar() {
        if (vacia() == 1) {
            System.out.println("queue empty");
            return -1;
        } else {
            int data = col[s];
            s++;
         System.out.println("Dequeued element: " + data);
        return data;
        }
    }

    public int vacia() {
        return (e == 0) ? 1 : 0;
    }

    public int llena() {
        return (e == size) ? 1 : 0;
    }
    public void show(){
        if (vacia()==1){
            System.out.println("The queue is empty");
            return;
        }else{
            for (int i=s;i<e;i++){
                System.out.println(col[i]+" ");
            }
        }
    }

public static void main(String[] args) {
    
    Scanner read = new Scanner(System.in);
        int size;
        int opt;
        System.out.println("Give the size");

        while (!read.hasNextInt()) {
        System.out.println("Invalid input. Please enter an integer.");
        System.out.print("Enter the size : ");
        read.next(); // Limpiar el búfer del Scanner
        }

        size = read.nextInt();
        queue A = new queue(size);
        do {
            System.out.println("Choose an action\n  1.ENQUEUE - 2.DEQUEUE - 3.SHOW - 0.EXIT");
            while (!read.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer. Choose an action\n  1.ENQUEUE - 2.DEQUEUE - 3.SHOW - 0.EXIT ");
            read.next(); // Limpiar el búfer del Scanner
            }

            opt = read.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("ENQUEUE");
                    A.encolar();
                    break;

                case 2:
                    System.out.println("DEQUEUE");
                    A.desencolar();
                    break;

                case 3:
                    System.out.println("SHOW");
                    A.show();
                    break;

                case 0:
                    System.out.println(" EXIT");
                    System.exit(0);

                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (opt != 0);
        read.close();
    }
}
