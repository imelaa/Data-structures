import java.util.Scanner;

public class Circ_Queue {
    Scanner read = new Scanner(System.in);
    int CC[];
    int e, s, size, last_oper;

    public Circ_Queue(int t) {
        size = t;
        CC = new int[size];
        e = 0;
        s = 0;
        last_oper = 0;
    }

    public void enqueueCQ() {
        if (fullCQ() == 1) {
            System.out.println("The Queue is Full");
            return;
        } else {
            last_oper = 1;
            System.out.print("\nEnter the element to be added : ");

            while (!read.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print("Enter the element to be added : ");
                read.next(); // Limpiar el búfer del Scanner
            }

            int enqueueValue = read.nextInt();
            CC[e] = enqueueValue;
            e++;
            if (e == size)
                e = 0;
            System.out.println("\nData enqueued correctly");

        }
    }

    public int dequeueCQ() {

        if (emptyCQ() == 1) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            last_oper = 0;
            int dequeueValue = CC[s];
            this.CC[s] = 0;
            s++;
            if (s == size)
                s = 0;
            System.out.println("Data dequeued: " + dequeueValue);
            return dequeueValue;
        }

    }

    public int fullCQ() {
        return (e == s && last_oper == 1) ? 1 : 0;
    }

    public int emptyCQ() {
        return (s == e && last_oper == 0) ? 1 : 0;

    }

    public void showCQ() {
        if (emptyCQ() == 1) {
            System.out.println("The Queue is Empty");
        } else {
            int current = s; // Posiciona current en la salida
            do {
                System.out.println(CC[current] + " ");
                current = (current + 1) % size; // avanza a la siguiente posicion de la cola, % sirve pq si llega al
                                                // final del tamaño pero no esta ahi la entrada se devuelve al principio
                                                // del array para seguir en el bucle do,while hasta que current este
                                                // posicionado en la entrada
            } while (current != e);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size, opt;
        System.out.println("Give the size");

        while (!read.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            System.out.print("Enter the size : ");
            read.next(); // Limpiar el búfer del Scanner
        }
        size = read.nextInt();

        Circ_Queue obj = new Circ_Queue(size);

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
                    obj.enqueueCQ();
                    break;

                case 2:
                    System.out.println("DEQUEUE");
                    obj.dequeueCQ();
                    break;

                case 3:
                    System.out.println("SHOW");
                    obj.showCQ();
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
