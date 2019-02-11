public class StackLista2 {
    protected DoublyLinkedList lista2;

    public StackLista2(){
        StackLista2 lista = new StackLista2();
    }

    public void push (String item){
        lista2.addLast(item);
    }

    public void pop (String item){
        lista2.removeLast();
    }
}
