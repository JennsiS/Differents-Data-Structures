/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name SinglyLinkedList.java
 * <p>Esta clase implementa los metodos de una lista, para una lista enlazada simple </p>
 * */
/*
 * @param <E>
 */
public class SinglyLinkedList<E> extends AbstractList<E> {

    /**
     *
     */
    protected int count; // list size

    /**
     *
     */
    protected Node<E> head; // ref. to first element

    /**
     *
     */
    public SinglyLinkedList()
    // post: generates an empty list
    {
        head = null;
        count = 0;
    }

    @Override
    public int size()
    // post: returns number of elements in list
    {
        return count;
    }
    /**
     * Agrega un valor al inicio
     * @param value un genérico
     */
    @Override
    public void addFirst(E value)
    // post: value is added to beginning of list
    {
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<>(value, head);
        count++;
    }
    /**
     * un removeFirst para tomar el primer elemento
     * @return un genérico
     */
    @Override
    public E removeFirst()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    {
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }
    /**
     * un getFirst para tomar el primer elemento
     * @return un genérico
     */
    @Override
    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }
    /**
     * Método para agregar al final
     * @param value un valor genérico E
     */
    @Override
    public void addLast(E value)
    // post: adds value to end of list
    {
        // location for new value
        Node<E> temp = new Node<>(value,null);
        if (head != null)
        {
            // pointer to possible tail
            Node<E> finger = head;
            while (finger.next() != null)
            {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else head = temp;

        count++;

    }

    /**
     * método contains
     * @param value un genérico
     * @return un booleano
     */
    @Override
    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff value is found in list
    {
        Node<E> finger = head;

        while (finger != null &&
                !finger.value().equals(value))
        {
            finger = finger.next();
        }
        return finger != null;
    }

    //Métodos de la clase Stack
    /**
     * Estos métodos son de las interfaces heredas
     * @param item un genérico E
     */
    @Override
    public void push(E item) {
        addFirst(item);
    }

    @Override
    public E pop() {
        return removeFirst();
    }

    @Override
    public E peek() {
        return getFirst();
    }



}
