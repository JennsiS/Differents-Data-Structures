public class StackLista{

    protected SinglyLinkedList lista1;

    public StackLista(){
        StackLista lista = new StackLista();
    }

    public void push(String item){
        lista1.addLast(item);
    }

    public void pop(String item){
        lista1.removeLast();
    }



}
