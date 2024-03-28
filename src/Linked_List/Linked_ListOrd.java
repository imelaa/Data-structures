package Linked_List;

public class Linked_ListOrd {
    Nodo first, last;

    public Linked_ListOrd() {
        first = null;
        last = null;
    }

    public void insertarOrd(int dato) {
        Nodo temp = new Nodo(dato);
        if (first == null) { //Si la lista esta vacia
            first = temp;
            last = temp;
        } else if (dato >= last.info) { // Si el nuevo elemento es mayor o igual que el ultimo de la lista
            last.liga = temp;
            last = temp;
        } else if (dato <= first.info) { //Si el nuevo elemento es menor o igual que el primero de la lista
            temp.liga = first;
            first = temp;

        } else { //Si el elemento se tine que insertar en medio
            Nodo ant, sig;
            ant = null;
            sig = first;
            while (sig != null && sig.info < dato) {
                ant = sig;
                sig = sig.liga;
            }
            ant.liga = temp;
            temp.liga = sig;
        }
    }

    public int deleteOrd(int dato) {
        if (first == null) { //La lista esta vacia
            System.out.println("The linked list is empty");
            return -1;
        }
        if (dato == first.info) { //eliminar el primer elemento
            first = first.liga;
            System.out.println("Primer Elemento (" + dato + ") eliminado correctamente");

            if (first == null)
                last = null;
            return dato;
        }

        Nodo ant = null;
        Nodo aux = first;

        while (aux != null && dato != aux.info) { //Recorre toda la lista hasta encontrar el nodo a borrar
            ant = aux;
            aux = aux.liga;
        }

        if (aux == null) { //Si el elemento no esta en la lista
            System.out.println("El elemento (" + dato + ") no está en la lista");
            return -1;
        }

        ant.liga = aux.liga; //Mueve el apuntador anterior al siguiente para saltar el que se elimina
        System.out.println("Elemento (" + dato + ") eliminado correctamente");

        if (aux == last) { //Si el elemento a eliminar es el unico que queda en la lista
            last = ant;
        }
        return dato;
    }

    public void showOrd() { //Recorre la lista  imprimiendo los elementos hasta que el apuntador auxiliar sea null
        Nodo aux = first;
        while (aux != null) {
            System.out.println(aux.info + "");
            aux = aux.liga;
        }
    }
    public static void main(String[] args) {
        Linked_ListOrd list = new Linked_ListOrd();
        list.insertarOrd(1);
        list.insertarOrd(5);
        list.insertarOrd(6);
        list.insertarOrd(7);
        list.showOrd();
        list.deleteOrd(5);
        list.showOrd();
    }
}
