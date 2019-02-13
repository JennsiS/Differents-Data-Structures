/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name StackLista.java
 * <p> </p>
 * */
public class StackLista{

    /**
     *
     */
    protected SinglyLinkedList lista1;

    /**
     *
     */
    public StackLista(){
        StackLista lista = new StackLista();
    }

    /**
     *
     * @param item
     */
    public void push(String item){
        lista1.addLast(item);
    }

    /**
     *
     * @param item
     */
    public void pop(String item){
        lista1.removeLast();
    }



}