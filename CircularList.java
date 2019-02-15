/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name CircularList.java
 * <p>Esta clase implementa los metodos que permiten crear una lista de tipo circular </p>
 * */
/**
 *
 * @param <E>
 */
public class CircularList<E> extends AbstractList<E>{

    /**
     *
     */
    protected Node<E> tail; 

    /**
     *
     */
    protected int count;
    
    /**
     * Constructor de la clase
     */
    public CircularList()
    {
        tail = null;
        count = 0;
    }
    
    /**
     * método que tiene como funcion agregar un elemento al incio
     * @param value un valor de tipo generico 
     */
    @Override
    public void addFirst(E value) {
       Node<E> temp = new Node<E>(value);
       if(tail == null){
           tail = temp;
           tail.setNext(tail);
       }else{
           temp.setNext(tail.next());
           tail.setNext(temp);
       }
       count++;
    }
    /**
     * método que agrega un elemento al final de la lista
     * @param value de tipo generico
     */
    @Override
    public void addLast(E value) {
       addFirst(value);
       tail = tail.next();
    }
    /**
     * método que remueve el primer elemento
     * @return un genérico E
     */
    @Override
    public E removeFirst() {
        Node<E> finger = tail;
        while(finger.next() != tail){
            finger = finger.next();
        }
        Node<E> temp = tail;
        if(finger == tail){
            tail = null;
        }else{
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }
    /**
     * Verifica si la lista tiene elementos
     * @param value de tipo generico
     * @return un boolean con valores true o false
     */
    @Override
    public boolean contains(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Método heredado de la interfaz de Stack tiene como funcion ingresar un elemento en el stack
     * @param item generico
     */
    @Override
    public void push(E item) {
       addFirst(item);
    }
    /**
     * Saca el primer valor de una stack
     * @return un genérico E
     */
    @Override
    public E pop() {
        return  removeFirst();
    }
    /**
     * Selecciona el primer elemento
     * @return un genérico
     */
    @Override
    public E peek() {
        return getFirst();
    }
    /**
     * Un método heredado de size
     * @return un entero
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * getFirst elemento es el método para obtener el primer elemento
     * @return un genérico E
     */
    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}