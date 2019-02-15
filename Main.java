
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name Main.java
 * <p>Esta es la clase principal que permite al usuario elegir que opcion desea utilizar </p>
 * */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Factory factory = new Factory();
        String opcion1= " ";
        String opcion2 = " ";
        Scanner scan = new Scanner(System.in);
        while (!opcion1.equals("4")){
        System.out.println("Desea utilizar Stack o Lista? ");
        System.out.println("1. ArrayList");
        System.out.println("2. StackVector");
        System.out.println("3. Lista");
        System.out.println("4. Salir");
        opcion1 = scan.nextLine();
        

        if (opcion1.equals("3")){
            System.out.println("Seleccione la lista que desea utilizar");
            System.out.println("1. Lista simplemente enlazada");
            System.out.println("2. Lista doblemente enlazada");
            System.out.println("3. Lista circular");
            opcion2 = scan.nextLine();
        }


        factory.opcionRealizada(opcion1, opcion2);


       Calcu operando= new Calcu();
        File opera = new File("C:datos.txt");
        FileReader leer = new FileReader(opera);
        BufferedReader buff = new BufferedReader(leer);

        String linea;
        while((linea = buff.readLine()) != null){
            System.out.println(linea);
            System.out.println("Respuesta: " + operando.calculate(linea) + "\n");
        }
        
        System.out.println("Desea utilizar Stack o Lista? ");
        System.out.println("1. ArrayList");
        System.out.println("2. StackVector");
        System.out.println("3. Lista");
        System.out.println("4. Salir");
        opcion1 = scan.nextLine();
        }

    }	
        
    }

