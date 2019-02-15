/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name DoubleLinkedList.java
 * <p>Esta lista implementa los metodos que permiten crear una lista doble enlazada</p>
 * */
import java.util.AbstractList;

/**
 * @param <E>
 */
public class DoubleLinkedList<E> extends AbstractList<E>{

    /**
     *
     */
    protected int count;

    /**
     * Este doble nodo se establece como la cabeza
     */
    protected DoublyLinkedNode<E> head;

    /**
     *  Este doble nodo se establece como la cola
     */
    protected DoublyLinkedNode<E> tail;

    /**
     * post: constructs an empty list
     */
    public DoubleLinkedList()

    {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     *
     * @param value
     */
    public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
    {
        // construct a new element, making it head
        head = new DoublyLinkedNode<E>(value, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }

    /**
     *
     * @param value
     */
    public void addLast(E value)

// post: adds new value to tail of list
    {
        // construct new element
        tail = new DoublyLinkedNode<E>(value, null, tail);
        // fix up head
        if (head == null) head = tail;
        count++;
    }

    /**
     *
     * @return de vuelve el valor de la cola
     */
    public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
    {
        DoublyLinkedNode<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
