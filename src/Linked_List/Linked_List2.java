package Linked_List;
//insertar al final
public class Linked_List2 {
    private Nodo raiz;

    public Linked_List2() {
        raiz = null;
    }

    public void inserta(int dato) {
        Nodo temp = new Nodo(dato);
        if (raiz == null)
            raiz = temp;
        else {
            Nodo aux; //puntero
            aux = raiz;
            while (aux.liga != null)
                aux = aux.liga;
            aux.liga = temp;
        }
    }

    public void mostrar() {
        Nodo aux;
        aux = raiz;
        while (aux != null) {
            System.out.println(aux.info + "");
            aux = aux.liga;
        }
    }

    public int eliminar() {
        int x;
        x = raiz.info;
        raiz = raiz.liga;
        return x;
    }

    public static void main(String[] args) {
        Linked_List2 l1 = new Linked_List2();
        l1.inserta(5);
        l1.inserta(7);
        l1.inserta(6);
        l1.inserta(10);
        l1.mostrar();

    }

}
