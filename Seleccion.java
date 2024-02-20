package Principal;

public class Seleccion {

    public static void main(String arg[]) {
        int arreglo[] = {16, 28, 3, 45, 24, 9, 100, 72, 91, 47};
        int cont = 0;
        System.out.print("Vector sin ordenar: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        
        //Ordenamiento
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    Integer aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }
        System.out.print("\nVector ordenado: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\nNumero de iteraciones: "+cont);
    }
}