import java.util.Random;
import java.util.Scanner;

public class Ejercicio26 {
    public static Random random = new Random();
    public static Scanner lector = new Scanner(System.in);

    public static final int NUMFILAS = 4;
    public static final int NUMCOLUMNAS = 8;
    public static int contadorFila;
    public static int numFilas;
    public static int numColumnas;

    public static void main(String[] args) {

        System.out.print("Indica el número de filas que quiere: ");
        numFilas = lector.nextInt();
        System.out.print("Indica el número de columnas que quiere: ");
        numColumnas = lector.nextInt();
        int[][] array = new int[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                array[i][j] = random.nextInt(100 - 1 + 1) + 1;
            }
        }
        mostrarArrayOrdenado(array);

        mostrarMaximo(array);
        mostrarMinimo(array);

        filaColumna(array);

        mostrarFila(array);
        mostrarColumnna(array);
    }

    /**
     * Ordena el array bidimensional y lo estructura en 4 filas y 8 columnas
     * 
     * @param array array bidimensional
     */
    public static void mostrarArrayOrdenado(int[][] array) {
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print(array[i][j] + "     ");
                contadorFila = contadorFila + array[i][j];
            }
            System.out.println("= " + contadorFila);
            System.out.println("");
            contadorFila = 0;
        }
    }

    /**
     * Muestra el valor máximo de la matriz
     * 
     * @param array array bidimensional
     */
    public static void mostrarMaximo(int[][] array) {
        int maximo = array[0][0];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (array[i][j] > maximo) {
                    maximo = array[i][j];
                }
            }
        }
        System.out.println("El valor máximo de la matriz es: " + maximo);
    }

    /**
     * Muestra el valor mínimo de la matriz
     * 
     * @param array array bidimensional
     */
    public static void mostrarMinimo(int[][] array) {
        int minimo = array[0][0];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (array[i][j] < minimo) {
                    minimo = array[i][j];
                }
            }
        }
        System.out.println("El valor mínimo de la matriz es: " + minimo);
    }

    /**
     * Calcula y muestra la media de la matriz
     * 
     * @param array array bidimensional
     */
    public static void calcularMediaMatriz(int[][] array) {
        int suma = 0;
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                suma += array[i][j];
            }

        }
        double media = (double) suma / (numFilas * numColumnas);
        System.out.println("La media de la matriz es: " + media);
    }

    /**
     * Muestra el elemento de la matriz elegido despues de indicar la fila y columna
     * 
     * @param array array bidimensional
     */
    public static void filaColumna(int[][] array) {
        System.out.print("Dima la fila: ");
        int elementoFila = lector.nextInt();
        System.out.print("Dima la fila: ");
        int elementoColumnna = lector.nextInt();

        System.out.println("El elemento elegido es: " + array[elementoFila][elementoColumnna]);

    }

    /**
     * Indica la fila que indica el usuario 
     * @param array array bidimensional
     */
    public static void mostrarFila(int[][] array) {
        System.out.print("Dima la fila: ");
        int elementoFila = lector.nextInt();

        for (int i = 0; i < numColumnas; i++) {
            System.out.print(array[elementoFila][i] + "  ");
        }
    }

    /**
     * Indica la columna que indica el usuario 
     * @param array array bidimensional
     */
    public static void mostrarColumnna(int[][] array) {
        System.out.print("Dima la fila: ");
        int elementoColumna = lector.nextInt();

        for (int i = 0; i < numFilas; i++) {
            System.out.print(array[elementoColumna][i] + "  ");
        }
    }
}

/**
 * Crea una matriz de 4 filas y 8 columnas de enteros (aleatorios) y a
 * continuación visualiza:
 * a) Toda la matriz (por filas)
 * b) La matriz traspuesta (por columnas)
 * c) La matriz por filas con la suma total de cada fila
 * d) Los valores máximo y mínimo de la matriz
 * e) La media de toda la matriz
 * f) El elemento que nos indique el usuario (Dime la fila? Dime la columna? )
 * g) La fila que nos indique el usuario
 * h) La columna que nos indique el usuario
 * i) Guarda en la columna 8 el total de todas las anteriores.
 * 
 */
