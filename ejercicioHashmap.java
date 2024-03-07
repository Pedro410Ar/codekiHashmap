
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicioHashmap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> elementos = new HashMap<>();


        /*----------STOCK--------------*/
        elementos.put("Fideos", 4000);
        elementos.put("Arroz", 3000);
        elementos.put("Salsa", 800);
        elementos.put("Arvejas", 700);

        /*--------------***------------------*/
        //Introducir elemento y precio al HashMap
        System.out.println("---------------***----------------");
        System.out.println("Introducir elemento: ");
        String elemento = sc.nextLine();
        System.out.println("Introducir el precio: ");
        Integer precio = sc.nextInt();
        elementos.put(elemento, precio);

        System.out.println("---------------***----------------");
        System.out.println("Productos almacenados:");
        System.out.println(elementos);
        System.out.println(" ");
        System.out.println("---------------***----------------");

       //Modificar precio al elemento ...........

        //Mostrar los productos segun precio
        //Scanner sc = new Scanner(System.in);
        System.out.println("Busqueda de precios: ");
        String precioElemento = sc.nextLine();
        elementos.containsValue(precioElemento);

        System.out.println("Productos con el precio buscado son: " + elementos.values());

        //Eliminar elemento
        //Scanner sc1 = new Scanner(System.in);
        System.out.println("Eliminar elemento: ");
        String elementoIngresado  = sc.nextLine();
        elementos.remove(elementoIngresado);

        System.out.println("---------------***----------------");
        System.out.println("Productos almacenados:");
        System.out.println(elementos);
        System.out.println(" ");
        System.out.println("---------------***----------------");
    }



                /*MENU DE OPCIONES
                int opcion;
                do{
                    System.out.println("---------------***----------------");
                    System.out.println("1- Introducir Elemento: ");
                    System.out.println("2- Modificar Precio: ");
                    System.out.println("3- Mostrar Productos: ");
                    System.out.println("4- Eliminar Productos: ");
                    System.out.println("5- Salir: ");
                    System.out.println("Ingrese una ocpión: ");
                    opcion = sc.nextInt();

                } while (opcion <1 || opcion >5);

                switch (opcion){
                    case 1:
                        introducir();
                        break;
                    case 2:
                        modificar();
                        break;
                    case 3:
                        mostrar();
                        break;
                    case 4:
                        eliminar();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                }
                */

    }







