package Linked_List;
//Insertar al principio
public class Linked_List {
    private Nodo raiz;

    public Linked_List() {
        raiz = null;
    }

    public void inserta(int dato) {
        Nodo temp = new Nodo(dato);
        if (raiz == null)
            raiz = temp;
        else {
            temp.liga = raiz;
            raiz = temp;
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
        Linked_List l1 = new Linked_List();
        l1.inserta(50);
        l1.inserta(60);
        l1.inserta(70);
        l1.mostrar();
    }

}
