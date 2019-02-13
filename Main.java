
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
 * <p> </p>
 * */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here


       // Factory factory = new Factory();

        Scanner scan = new Scanner(System.in);

        System.out.println("Seleccione que tipo de implementacion del stack desea utilizar ");
        System.out.println("1. ArrayList");
        System.out.println("2. StackVector");
        System.out.println("3. Lista");
        String opcion1 = scan.nextLine();
        String opcion2 = null;

        if (opcion1.equals("3")){
            System.out.println("Seleccione la lista que desea utilizar");
            System.out.println("1. Lista simplemente enlazada");
            System.out.println("2. Lista doblemente enlazada");
            System.out.println("3. Lista circular");
            opcion2 = scan.nextLine();
        }


        //factory.opcionRealizada(opcion1, opcion2);

        //Implementando la calculadora con el diseño singleton
       Calcu operando= Calcu.getInstance();
         
    FileReader fr = new FileReader("C:\\Users\\bff_n_000\\Desktop\\datos.txt"); //aqui debes de poner tu ruta
     BufferedReader br = new BufferedReader (fr);

   
     String linea;
     while((linea=br.readLine())!=null) 
        {
            
            //caract guarda el numero de caracter, por lo que lo casteamos a char para que nos de
            //el caracter como lo necesitamos
            //System.out.println((char)caract);
            String cadena=linea;
            
            String[] post;
            post = cadena.split(" ");
            int largo= post.length;

        }


    }

}
