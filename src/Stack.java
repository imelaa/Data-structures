
import java.util.Scanner;

public class Stack {
    Scanner read = new Scanner(System.in);
    int P[];
    int tope, tam;

    public Stack(int t) {
        tam = t;
        P =new int [tam];
        tope = 0;
    }

    public void push() {

        if (llena() == 0) {
            System.out.print("Give me the value: ");
            int dato = read.nextInt();
            P[tope] = dato;
            tope++;
            System.out.println("data inserted correctly");
        } else {

            System.out.print("The stack is full\n");
            return;
        }
    }

    public int pop() {
        if (vacia() == 0) {
            int PoppedValue = P[--tope];
            System.out.println("Elemento eliminado: " + PoppedValue);
            return PoppedValue;
        } else {
            System.out.println("The stack is empty");
            return -1;

        }

    }

    public int vacia() {
        // ? Es el operador ternario, que funciona como un "if-else" en una sola línea.
        // : Separa las dos opciones del operador ternario.
        return (tope == 0) ? 1 : 0;
    }

    public int llena() {
        return (tope == tam) ? 1 : 0;
    }

    public void mostrar() {
        if (vacia() == 0) {
            for (int i = 0; i < tope; i++)
                System.out.println(P[i] + " ");
        } else
            System.out.println("The stack is empty");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opt;
        int tama;
        System.out.println("Dame el tamaño: ");
        tama = read.nextInt();
        Stack A = new Stack(tama);

        do {
            System.out.println("1.PUSH - 2.POP - 3.MOSTRAR - 0.EXIT");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Elegiste PUSH\n");
                    A.push();
                    break;

                case 2:
                    System.out.println("Elegiste POP ");
                    A.pop();
                    break;

                case 3:
                    System.out.println("Elegiste MOSTRAR");
                    A.mostrar();
                    break;

                case 0:
                    System.out.println("Elegiste EXIT");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Option invalid");
                    break;
            }
        } while (opt != 0);

        read.close();

    }

}
