public class FactoryLista {
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
                nuevo = new DoublyLinkedList();
            }

            case "3":{
                nuevo = new CircularList();
            }
        }

        return nuevo;
    }
}
