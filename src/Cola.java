import java.util.Scanner;

public class Cola {
    Scanner read = new Scanner(System.in);
    int C[];
    int e, s, tam;

    public Cola(int t) {
        tam = t;
        C= new int [tam];
        e = 0;
        s = 0;
    }

    public void enqueue() {

        if (llena() == 0) {
            System.out.print("Enter the value: ");
            int dato = read.nextInt();
            C[e] = dato;
            e++;
            System.out.println("data enqueued correctly");
        } else {

            System.out.print("The Queue is full\n");
            return;
        }
    }

    public int dequeue() {
        if (vacia() == 0) {
            int dequeueValue = C[s];
            s++;
            System.out.println("data dequeued: " + dequeueValue);
            return dequeueValue;
        } else {
            System.out.println("The Queue is empty");
            return -1;

        }

    }

    public int vacia() {
        // ? Es el operador ternario, que funciona como un "if-else" en una sola línea.
        // : Separa las dos opciones del operador ternario.
        return (e == s) ? 1 : 0;
    }

    public int llena() {
        return (e == tam) ? 1 : 0;
    }

    public void mostrar() {
        if (vacia() == 0) {
            for (int i = s; i < e; i++)
                System.out.println(C[i] + " ");
        } else
            System.out.println("The queue is empty");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tam;
        int opt;
        System.out.println("Give the size");
        tam = read.nextInt();
        Cola A = new Cola(tam);
        do {
            System.out.println("Choose an action\n  1.ENQUEUE - 2.DEQUEUE - 3.SHOW - 0.EXIT");
            opt = read.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("ENQUEUE");
                    A.enqueue();
                    break;

                case 2:
                    System.out.println("DEQUEUE");
                    A.dequeue();
                    break;

                case 3:
                    System.out.println("SHOW");
                    A.mostrar();
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
