public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here


        Factory factory = new Factory();

        Scanner scan = new Scanner(System.in);

        System.out.println("Desea utilizar Stack o Lista? ");
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


        factory.opcionRealizada(opcion1, opcion2);


        Calculadora main = new Calculadora();
        File opera = new File("C:/Users/Antonio/Documents/NetBeansProjects/calculadora/CalculadoraHT2/src/prueba.txt");
        FileReader leer = new FileReader(opera);
        BufferedReader buff = new BufferedReader(leer);

        String linea;
        while((linea = buff.readLine()) != null){
            System.out.println(linea);
            System.out.println("Respuesta: " + main.calcular(linea) + "\n");
        }




    }

}

