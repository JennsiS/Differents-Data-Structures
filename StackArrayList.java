import java.util.ArrayList;
/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name StackArrayList.java
 * <p> </p>
 * */
/**
 * @param <E>
 */
public class StackArrayList<E> extends AbstractStack<E>
{

    /**
     *
     */
    protected ArrayList<E> data;

    /**
     *
     */
    public StackArrayList()
    // post: constructs a new, empty stack
    {
        data = new ArrayList<E>();
    }

    public void push(E item)
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
        data.add(item);
    }

    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return data.remove(size()-1);
    }

    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
        return data.get(size() - 1);
    }

    public int size()
    // post: returns the number of elements in the stack
    {
        return data.size();
    }

    @Override
    public boolean empty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}