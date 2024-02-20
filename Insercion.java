public class Insercion {
    public static void main(String arg[]) {
        int arreglo[] = { 16, 28, 3, 45, 24, 9, 100, 72, 91, 47 };
        int cont = 0;
        System.out.print("Vector sin ordenar: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
        System.out.print("\nVector ordenado: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\nNumero de iteraciones: " + cont);
    }
}