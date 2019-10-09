package classop;


import java.util.Scanner;

public class Operaciones {

    
    public int[] arreglo = new int[10];
 
     Scanner lectura = new Scanner(System.in);

    //Constructor.
    public Operaciones() {
        this.mostrarMenu();

    }

    //Mostrar menu en pantalla.
    public void mostrarMenu() {
               //limpiar pantalla

        System.out.println("Escoja una opción\n"
                + "1. Llenar Array\n"
                + "2.Escribir Array\n"
                + "3.Sumatoria\n"
                + "4.Productoria\n"
                + "5. Tamaño del Array\n"
                + "6.Salir\n");
       
        int opcion = lectura.nextInt();//lee un array
        //int opcion = Operaciones.nextInt();
        this.cargarOpción(opcion);

    }

    //Leer el arreglo.

    public void leerArreglo() {
        
        System.out.println("escogio arreglo");
        System.out.println("digite los numeros");
        
        for (int i=0; i<10; i++){
        
        arreglo [i] =lectura.nextInt();
        
        
        
        }
        this.mostrarMenu();
    }

    //escribe el arreglo.
    public void escribirArreglo() {
        System.out.println("escogio escribir arreglo");
        this.mostrarMenu();
    }

    //genera sumatoria.
    public void sumatoria() {
        System.out.println("escogio sumatoria");
        this.mostrarMenu();
    }

    //genera productoria.
    public void productoria() {
        System.out.println("escogio productoria");
        this.mostrarMenu();
    }

    public void cargarOpción(int op) {
        //System.out.println("la opcion escogida es " + op);

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
            case 5:
                System.out.println(this.arreglo.length);
                break;

        }

    }

}
