/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name Calcu.java
 * <p>Esta clase es la implementacion de la interfaz calculadora donde se realizan las operaciones  </p>
 * */

public class Calcu implements Calculator {


    //Primera instancia para el singleton
    public static Calcu firstInstance = null;

    public Calcu(){}
    /**
     * metodo calcular. se utiliza para poder realizar operaciones escritas en postfix
     * @param esp
     * @return Valor de la operacion realizada
     */
    public String calculate(String esp){

        //IMPORTANTE
        //IMPORTANTE
        //IMPORTANTE
        //IMPORTANTE
        //Verificador para implementar el metodo singleton
        if(firstInstance == null){
            firstInstance = new Calcu();
        }

        String respuesta = "";
        StackVector<String> pila = new StackVector<String>();
        StackVector<Integer> evaluador = new StackVector<Integer>();
        Boolean error = false;

        String[] cadena = esp.split(" ");
        String caracter;

        // Se ingresan los elementos al stack de forma inversa
        for(int i= cadena.length - 1; i >= 0; i--){
            caracter = cadena[i];
            pila.push(caracter);
        }

        while (!pila.empty()) {
            if ("0123456789".contains(pila.peek())) {
                // Si el peek() es un numero
                evaluador.push(Integer.parseInt(pila.pop()));
            } else {
                // Si no es un numero
                caracter = pila.pop();
                switch (caracter.charAt(0)) {
                    case '+': {
                        // Suma.
                        evaluador.push((evaluador.pop() + evaluador.pop()));
                        break;
                    }
                    case '-': {
                        // Resta.
                        evaluador.push((evaluador.pop() - evaluador.pop()));
                        break;
                    }
                    case '*': {
                        // Multiplicacion.
                        evaluador.push((evaluador.pop() * evaluador.pop()));
                        break;
                    }
                    case '/': {
                        // Division.
                        int numerador = evaluador.pop();
                        int denominador = evaluador.pop();
                        // Evaluamos si no hay un error.
                        if (denominador != 0) {
                            // No hay error.
                            evaluador.push((numerador / denominador));
                        } else {
                            // Hay error, si el 0 esta en el denominador, no hay solucion
                            error = true;
                            evaluador.push(0);
                        }
                        break;
                    }
                }
            }

        }


        if (!error) {
            //en caso de que error = false
            return String.valueOf( evaluador.pop() );
        } else {
            //en caso de que error = true (hay una division con 0 como el denominador).
            return "Error";
        }
    }
} 