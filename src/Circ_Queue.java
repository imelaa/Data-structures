import java.util.Scanner;

public class Circ_Queue {
    Scanner read = new Scanner(System.in);
    int CC[] = new int[100];
    int e, s, size,last_oper;

    public Circ_Queue(int t) {
        size = t;
        e = 0;
        s = 0;
        last_oper=0;
    }

    public int enqueue() {
        if (fullCC() == 1) {
            System.out.println("The  Queue is Full");
            return -1;
        } else {
            int enqueueValue=CC[e];
            
            return enqueueValue;
        }
    }

    public int dequeue() {
   
        if (emptyCC() == 1) {
            System.out.println("The  Queue is Empty");
            return -1;
        } else {
            int dequeueValue=CC[s];
            last_oper=0;
            this.CC[s]=0;
            s++;
            if (s == size) {
                s = 0;
            }
            return dequeueValue;
        }

    }

    public int fullCC() {
        return (e == s && last_oper == 1) ? 1 : 0;
    }

    public int emptyCC() {
        return (s == e && last_oper == 0) ? 1 : 0;

    }

}
