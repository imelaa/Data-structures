package Linked_List;

public class Linked_ListD {
    NodoD firstD;
    NodoD lastD;

    public Linked_ListD(){
        firstD = null;
        lastD=null;
    }

    public void insertarD(int dato,int posicion){
        NodoD tempD = new NodoD(dato);
        if (firstD==null){
            firstD=lastD=tempD;
        }
        




     }

public static void main(String[] args) {
    Linked_ListD ld = new Linked_ListD();
}
}
