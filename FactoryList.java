/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name FactoryList.java
 * <p></p>
 * */


public class FactoryList {
    public List getList(String entry){
        /*if(entry.equals("1")){
            return new SinglyLinkedList();
        }
        if(entry.equals("2")){
            return new DoublyLinkedList();
        }
        if(entry.equals("3")){
            return new CircularList();
        }
        */
        List nuevo = null;
        switch(entry){
            case "1":{
                nuevo = new SinglyLinkedList();
            }

            case "2":{
                nuevo = new DoubleLinkedList();
            }

            case "3":{
                nuevo = new CircularList();
            }
        }

        return nuevo;
    }
}
