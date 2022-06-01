package ordenamiento;

public class Quicksort {

    public static void quickSort(int A[], int izq, int der){

        int pivote = A[izq];        // tomamos primer elemento como pivote
        int i = izq;                // i realiza la busqueda de izquierda a derecha
        int j = der;                // j realiza la busqueda de derecha a izquierda
        int aux;

        /*
        * Mientras no se crucen las busquedas ,  */
        while (i < j){                              // Mientras no se crucen las busquedas
            while (A[i] <= pivote && i < j) i++;    // Busca el elemento mayor que pivote
            while (A[j] > pivote) j--;              // Busca el elemento menor que pivote
            if (i < j){                             // Si no se han cruzado
                aux = A[i];                         //  los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j]; //se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su isquierda y los mayores a la derecha

        if (izq < j-1) quickSort(A, izq,j-1); // Ordenamos subArray izquierdo
        if (j+1 < der) quickSort(A, j+1, der); // Ordenamos subArray derecho


    }
}
