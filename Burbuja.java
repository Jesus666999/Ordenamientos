public class Burbuja {
    public static void main(String arg[]) {
        int arreglo[] = { 16, 28, 3, 45, 24, 9, 100, 72, 91, 47 };
        int cont = 0;
        System.out.print("Vector sin ordenar: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        // Ordenamiento
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < (arreglo.length - 1 - i); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                cont++;
            }
        }
        System.out.print("\nVector ordenado: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\nNumero de iteraciones: " + cont);
    }
}