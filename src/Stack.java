public class Stack {
    public int tope, size;
    int S[] = new int[100];

    public Stack(int s) {
        size = s;
        tope = 0;
    }

    public void push(int dato) {
        if (isFull() == 1)
            return;
        S[tope] = dato;
        tope++;
    }

    public int pop() {
        if (isFull() == 1)
            return -1;
        int eliminado;
        tope--;
        eliminado = S[tope];
        return eliminado;
    }

    public int isEmpty() {return (tope == 0) ? 1 : 0;}

    public int isFull() {return (tope == size) ? 1 : 0;}

    public void showS() {
        for (int i = 0; i < tope; i++)
            System.out.print(S[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        Stack que = new Stack(5);
        que.push(5);
        que.push(8);
        que.push(3);
        que.showS();
        int x = que.pop();
        System.out.println("Dato eliminado = " + x);
        que.showS();

    }

}