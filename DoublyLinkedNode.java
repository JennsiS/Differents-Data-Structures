/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name DoublyLinkedNode.java
 * <p> </p>
 * */

/**
 * @param <E>
 */
public class DoublyLinkedNode<E>{

    /**
     *
     */
    protected E data;

    /**
     * Permite reconocer el elemento siguiente
     */
    protected DoublyLinkedNode<E> nextElement;

    /**
     * Permite reconocer el elemento previo
     */
    protected DoublyLinkedNode<E> previousElement;

    /**
     *
     * @param v
     * @param next
     * @param previous
     */
    public DoublyLinkedNode(E v,DoublyLinkedNode<E> next,DoublyLinkedNode<E> previous){
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    /**
     *
     * @param v
     */
    public DoublyLinkedNode(E v){
        // post: constructs a single element
        this(v,null,null);
    }

    /**
     *
     * @return devuelve el elemento siguiente
     */
    public DoublyLinkedNode<E> next(){
        // post: returns reference to next value in list
        return nextElement;
    }

    /**
     *
     * @return devuelve el elemento previo
     */
    public DoublyLinkedNode<E> previous(){
        return previousElement;
    }

    /**
     *
     * @param previous
     */
    public void setPrevious(DoublyLinkedNode<E> previous){
        // post: sets reference to new next value
        previousElement = previous;
    }

    /**
     *
     * @param next
     */
    public void setNext(DoublyLinkedNode<E> next){
        // post: sets reference to new next value
        nextElement = next;
    }

    /**
     *
     * @return post: returns value associated with this element
     */
    public E value(){
        return data;
    }

    /**
     *
     * @param value
     */
    public void setValue(E value){
        data = value;
    }

}