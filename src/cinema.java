import java.util.ArrayList;
import java.util.Scanner;

public class cinema {
    static ArrayList<ArrayList<String>> peliculas = new ArrayList<ArrayList<String>>();

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char letra;
        do {
            System.out.println("1). Ingresar peliculas");
            System.out.println("2). Ver inventario");
            System.out.println("3). Salir");
            System.out.print("Digite su opcion: ");
            letra = lector.next().charAt(0);
            switch (letra){
                case '1':
                    ingresarPeliculas();
                    break;
                case '2':
                    verInventario();
                    break;
                default:
                    break;
            }
        } while (letra != '3');
    }

    private static void verInventario() {
        for (int i = 0; i <peliculas.size() ; i++) {
            System.out.println("");
            for (int j = 0; j < peliculas.get(i).size(); j++) {
                System.out.print(" /" + peliculas.get(i).get(j));
            }
            System.out.println("");
        }
    }

    private static void ingresarPeliculas() {
        Scanner lector = new Scanner(System.in);
        String texto;
        ArrayList<String> nuevo = new ArrayList<String>();

        System.out.print("Digite el titulo: ");
        texto = lector.next();
        nuevo.add(texto);
        System.out.println(nuevo.size());

        System.out.print("Digite el director: ");
        texto = lector.next();
        nuevo.add(texto);
        System.out.println(nuevo.size());

        System.out.print("Digite el productor: ");
        texto = lector.next();
        nuevo.add(texto);
        System.out.println(nuevo.size());

        System.out.print("Digite la casa: ");
        texto = lector.next();
        nuevo.add(texto);
        System.out.println(nuevo.size());

        System.out.print("Digite el protagonista: ");
        texto = lector.next();
        nuevo.add(texto);
        System.out.println(nuevo.size());

        System.out.print("Digite la duracion: ");
        texto = lector.next();
        nuevo.add(texto);
        System.out.println(nuevo.size());

        System.out.print("Digite el precio: ");
        double valor = lector.nextDouble();

        System.out.println("A. Terror");
        System.out.println("B. Accion");
        System.out.println("C. Drama");
        System.out.println("D. Comedia");
        System.out.print("Digite el genero: ");
        texto = lector.next().substring(0,1).toUpperCase();
        switch (texto){
            case "A":
                nuevo.add("Terror");
                valor = valor + valor * 0.10;
                break;
            case "B":
                nuevo.add("Accion");
                valor = valor + valor * 0.15;
                break;
            case "C":
                nuevo.add("Drama");
                valor = valor + valor * 0.20;
                break;
            case "D":
                nuevo.add("Comedia");
                valor = valor + valor * 0.15;
                break;
            default:
                break;
        }
        nuevo.add(String.valueOf(valor));
        System.out.println(nuevo.size());

        System.out.println(peliculas.size());
        peliculas.add(nuevo);
        System.out.println(peliculas.size());
    }
}