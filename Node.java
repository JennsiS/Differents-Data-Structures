/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name Node.java
 * <p> Esta clase permite hacer referencia al siguiente elemento de una lista simple </p>
 * */
/**
 * @param <E>
 */
public class Node<E>
{

    /**
     *
     */
    protected E data; // value stored in this element

    /**
     * Apunta al siguiente elemento
     */
    protected Node<E> nextElement; // ref to next

    /**
     *
     * @param v
     * @param next
     */
    public Node(E v, Node<E> next)
    // pre: v is a value, next is a reference to
    //      remainder of list
    // post: an element is constructed as the new
    //      head of list
    {
        data = v;
        nextElement = next;
    }

    /**
     *
     * @param v
     */
    public Node(E v)
    // post: constructs a new tail of a list with value v
    {
        this(v,null);
    }

    /**
     *
     * @return devuelve el siguiente elemento
     */
    public Node<E> next()
    // post: returns reference to next value in list
    {
        return nextElement;
    }

    /**
     *
     * @param next
     */
    public void setNext(Node<E> next)
    // post: sets reference to new next value
    {
        nextElement = next;
    }

    /**
     *
     * @return devuelve un valor asociado como este elemento
     */
    public E value()
    {
        return data;
    }

    /**
     *
     * @param value
     */
    public void setValue(E value)
    // post: sets value associated with this element
    {
        data = value;
    }
}