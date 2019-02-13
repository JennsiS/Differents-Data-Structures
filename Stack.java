/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name Stack.java
 * <p> </p>
 * */
/**
 * @param <E>
 */
public interface Stack<E>
{

    /**
     *
     * @param item
     */
    public void push(E item);
    // pre:
    // post: item is added to stack
    // will be popped next if no intervening push

    /**
     *
     * @return devuelve el objeto que saca de la pila
     */
    public E pop();
    // pre: stack is not empty
   

    /**
     *
     * @return devuelve el valor donde se encuentra algo
     */
    public E peek();
    // pre: stack is not empty
    // post: top value (next to be popped) is returned

    /**
     *
     * @return Devuelve si la pila se encuentra vacia o no
     */
    public boolean empty();
    

    /**
     *
     * @return Devuelve el tamaño del stack
     */
    public int size();


}
