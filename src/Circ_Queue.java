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
            int enqueueValue = read.nextInt();
            CC[e] = enqueueValue;
            e++;
            if (e == size)
                e = 0;
            System.out.println("data enqueued correctly");

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
            System.out.println("data dequeued: " + dequeueValue);
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
            if (s <= e || fullCQ() == 1) { // Si la cola no se ha llenado o si esta llena
                for (int i = s; i < e; i++) {
                    System.out.println(CC[i] + " ");
                }
                for (int i = 0; i < e; i++) {
                    System.out.println(CC[i] + " ");
                }
            } else { // Si la cola volvio al princpio
                for (int i = s; i < e; i++) {
                    System.out.println(CC[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size, opt;
        System.out.println("Give the size");
        size = read.nextInt();
        Circ_Queue obj = new Circ_Queue(size);

        do {
            System.out.println("Choose an action\n  1.ENQUEUE - 2.DEQUEUE - 3.SHOW - 0.EXIT");
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
