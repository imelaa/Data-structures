package Linked_List;

public class Linked_ListD {
    NodoD head_D;

    public Linked_ListD(){
        head_D = null;
    }

    public void insertarD(int dato){
        NodoD tempD = new NodoD(dato);
        if (head_D==null){
            head_D=tempD;
            head_D.last=null;
            head_D.next=null;
        }
        else {
            NodoD holder=null; //Varible auxiliar idk why
            NodoD auxD=head_D;
            while(auxD.next!=null ) {
                holder = auxD; //Guarda el valor de aux idk why
                auxD=auxD.next;
            }
            if (auxD.next==null){
                auxD.next=tempD;
                tempD.last=auxD;
                tempD.next=null;
            }   
        }
     }

     public int delete(int dato){

        if (head_D==null){
            System.out.println("Lista vacia");
            return -1;
        }else{
            NodoD auxD=head_D;;
            while (auxD.next.info!=dato && auxD.next!=null){
                auxD=auxD.next;
            }
            if(auxD.next==null){
                System.out.println("No se encontro el nodo");
                return -1;
        }   else {
            auxD.next.last
        }
        int x;
        x=tempD.info;
     }


    public void showD(){
        NodoD auxD;
        auxD=head_D;
        while (auxD!=null){
            System.out.println(auxD.info+"");
            auxD=auxD.next;
        }
    
    }
public static void main(String[] args) {
    Linked_ListD ld = new Linked_ListD();
    ld.insertarD(5);
    ld.insertarD(7);
    ld.insertarD(6);
    ld.insertarD(10);
    ld.showD();
    int x = ld.delete(7);
    ld.showD();
}
}
