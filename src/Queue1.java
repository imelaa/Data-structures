public class Queue1{
    int input, output, size;
    int Q[] = new int[100];

    public Queue1(int s) {
        size = s;
        input = 0;
        output = 0;
    }

    public void insert(int data) {
        if (isFull() == 1)
            return;
        Q[input] = data;
        input++;
    }

    public int extract() {
        if (isEmpty() == 1)
            return -1;
        int n;
        n = Q[output];
        output++;
        return (n);

    }

    public int isEmpty() {
        return (input == output) ? 1 : 0;
    }

    public int isFull() {
        return (input == size) ? 1 : 0;
    }

    public void showQ() {
        if (isEmpty() == 1)
            return;
        for (int i = output; i < input; i++) {
            System.out.print(Q[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Queue1 que = new Queue1(5);
        que.insert(5);
        que.insert(8);
        que.insert(3);
        que.showQ();
        int x = que.extract();
        System.out.println("Dato eliminado = " + x);
        que.showQ();

    }
}