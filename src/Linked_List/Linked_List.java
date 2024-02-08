package Linked_List;

public class Linked_List {
    private Nodo raiz;
    public Linked_List(){
        raiz =null;
    }
public void inserta (int dato){
    Nodo temp =new Nodo(dato);
    if (raiz==null) raiz=temp;
    else{
        temp.liga=raiz;
        raiz=temp;
    }
}
public void mostrar(){
    Nodo aux;
    aux=raiz;
    while(aux!= null){
        System.out.println(aux.info + "");
        aux=aux.liga;
}}
public int eliminar(){
int x;
x=raiz.info;
raiz=raiz.liga;
return x;
}

public static void main(String[] args) {
    Linked_List l1= new Linked_List();
    l1.inserta(50);
    l1.inserta(60);
    l1.inserta(70);
    l1.mostrar();
}


}


// Nodo:
// Nodo es una clase que representa cada elemento de la lista ligada.
// Contiene un campo para almacenar datos (dato) y un puntero al siguiente nodo (siguiente).
// Cabeza:
// La cabeza es una referencia al primer nodo de la lista.
// Se utiliza como punto de inicio para acceder a los demás nodos.
// Puntero al Siguiente Nodo:
// Cada nodo tiene un puntero (siguiente) que apunta al siguiente nodo en la secuencia.
// Inserción al Principio:
// insertarAlPrincipio agrega un nuevo nodo al principio de la lista, actualizando la cabeza.
// Inserción al Final:
// insertarAlFinal agrega un nuevo nodo al final de la lista, recorriendo la lista hasta el último nodo.
// Eliminación:
// eliminar elimina un nodo con un valor específico de la lista, ajustando los punteros de los nodos adyacentes.
// Lista Vacía:
// estaVacia verifica si la lista está vacía comprobando si la cabeza es null.
// Recorrido:
// imprimirLista recorre la lista desde la cabeza hasta el final, imprimiendo los datos de cada nodo.
// Método Main (principal):
// La clase Main contiene el método main que sirve como punto de entrada del programa.
// Aquí se instancian y utilizan objetos de la clase ListaLigada para demostrar el funcionamiento de la lista.
// Encapsulación:
// Los campos de la clase Nodo están encapsulados, y se accede a ellos mediante métodos públicos.
// La encapsulación ayuda a mantener la integridad de los datos y facilita la modificación interna de la implementación