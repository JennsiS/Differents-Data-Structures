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
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);

        //try{
        // Apertura del fichero y creacion de BufferedReader para poder
        // hacer una lectura comoda (disponer del metodo readLine()).
        archivo = new File("datos.txt");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);

        // Lectura del ficheroSi
        String linea;
        String Operacion = "";
        while ((linea = br.readLine()) != null)
            Operacion = Operacion + linea;



        // Factory factory = new Factory();

        Scanner scan = new Scanner(System.in);

        System.out.println("Seleccione que tipo de implementacion desea utilizar ");
        System.out.println("1.Stack ");
        System.out.println("2.Lista ");
        String opcion1 = scan.nextLine();
        String opcion2 = null;

        if (opcion1.equals("2")){
            System.out.println("Seleccione la lista que desea utilizar");
            System.out.println("1. Lista simplemente enlazada");
            System.out.println("2. Lista doblemente enlazada");
            System.out.println("3. Lista circular");
            opcion2 = scan.nextLine();
            if (opcion2.equals("1")){}
            if (opcion2.equals("2")){}
            if (opcion2.equals("3")){}
        }
        if (opcion1.equals("1")){
            System.out.println("Seleccione el tipo de stack que desea utilizar");
            System.out.println("1.Lista ");
            System.out.println("2.ArrayList ");
            System.out.println("3.Vector");
            opcion2 = scan.nextLine();
            if (opcion2.equals("1")){}
            if (opcion2.equals("2")){}
            if (opcion2.equals("3")){}
        }


        //factory.opcionRealizada(opcion1, opcion2);

        //Implementando la calculadora con el diseño singleton
        Calcu operando= Calcu.getInstance();




    }
    // }catch(IOException e);

}