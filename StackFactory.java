/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name StackFactory.java
 * <p> </p>
 * */
/**
 * @param <E>
 */
public class StackFactory<E> {
    //selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory

    /**
     *
     * @param entry
     * @return Devuelve la pila de vector
     */
    public Stack<E> getStack(String entry) {
        // seleccion de la implementacion a utilizar:
        if (entry.equals("AL"))
            return (Stack<E>) new StackArrayList<E>(); //regresa ArrayList
        else
            return new StackVector<E>(); //regresa Vector
    }
}