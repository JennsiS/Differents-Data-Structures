/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name Factory.java
 * <p> Esta clase permite crear a jerarquia entre las clases </p>
 * */

public class Factory {


    StackFactory pila = new StackFactory();
    FactoryList listas = new FactoryList();

    /**
     * Este metodo permite crear una stack o una lista segun sea el caso
     * @param opcion1
     * @param opcion2
     */
    public void opcionRealizada(String opcion1, String opcion2){
        switch(opcion1){
            case "1":{
                //Crea un ArrayList
                pila.getStack("AL");
                break;
            }

            case "2":{
                //Crea un StackVector
                pila.getStack(" ");
                break;
            }

            case "3":{
                switch(opcion2){
                    case "1":{
                        //crea lista simplemente enlazada
                        listas.getList("1");
                        break;
                    }

                    case "2":{
                        //crea lista doblemente enlazada
                        listas.getList("2");
                        break;
                    }

                    case "3":{
                        //crea lista circular
                        listas.getList("3");
                        break;
                    }
                }

                break;
            }
        }
    }
}
