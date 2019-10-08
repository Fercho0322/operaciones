package classop;

import java.util.Scanner;

public class Operaciones {

    public int[] arreglo = new int[10];
    public int opcion;

    //Constructor.
    public Operaciones() {
        this.mostrarMenu();

    }

    //Mostrar menu en pantalla.
    public void mostrarMenu() {

        System.out.println("Escoja una opción\n"
                + "1. Llenar Array\n"
                + "2.Escribir Array\n"
                + "3.Sumatoria\n"
                + "4.Productoria\n"
                + "5. Tamaño del Array\n"
                + "6.Salir\n");
        Scanner Operaciones = new Scanner(System.in);
        opcion = Operaciones.nextInt();//lee un array
        this.cargarOpción(opcion);
    }

    //Leer el arreglo.
    public void leerArreglo() {

    }

    //escribe el arreglo.
    public void escribirArreglo() {

    }

    //genera sumatoria.
    public void sumatoria() {

    }

    //genera productoria.
    public void productoria() {

    }

    public void cargarOpción(int op) {
        System.out.println("la opcion escogida es " + op);

        switch (op) {

            case 1:
                this.leerArreglo();
                break;
            case 2:
                this.escribirArreglo();
                break;
            case 3:
                this.sumatoria();
                break;
            case 4:
                this.productoria();
                break;

        }

    }

}
