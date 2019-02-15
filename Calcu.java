/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name Calcu.java
 * <p>Esta clase es la implementacion de la interfaz calculadora donde se realizan las operaciones  </p>
 * */

public class Calcu implements Calculator {
    private Calcu(){
    }
    /**
     *
     * @param num1
     * @param num2
     * @param op
     * @return retorna el resultado de cualquiera de las operaciones que realice segun sea el caso
     */
    
  /*  @Override
    public int Calculate(int num1, int num2, String op) {
       int resultado =0;
       if (op.equals ("+")){
           resultado= num1+num2;
       }
       if (op.equals ("-")){
           resultado= num2-num1;
       }
       if (op.equals ("*")){
           resultado = num1*num2;
       }
       if (op.equals ("/")){
           resultado = num2/num1 ;
       }
       return resultado;
    }
   */
    
    
    
    public static Calcu getInstance() {
        return CalcuHolder.INSTANCE;
    }

    @Override
    public double calculate(String expresion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static class CalcuHolder {

        private static final Calcu INSTANCE = new Calcu();
    }
    
}
