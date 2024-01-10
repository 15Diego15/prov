import java.util.Random;

public class Ejercicio25 {
    public static Random random = new Random();
    public static final int NUMFILAS = 4;
    public static final int NUMCOLUMNAS = 8;

    public static void main(String[] args) {
        int[][] array = new int[NUMFILAS][NUMCOLUMNAS];
        for (int i = 0; i < NUMFILAS; i++) {
            for (int j = 0; j < NUMCOLUMNAS; j++) {
                array[i][j] = random.nextInt(100000 - 1 + 1) + 1;
            }
        }
        mostrarArrayOrdenado(array);
    }
    /**
     * Ordena el array bidimensional y lo estructura en 4 filas y 8 columnas
     * @param array array bidimensional 
     */
    public static void mostrarArrayOrdenado(int[][] array) {
        for (int i = 0; i < NUMFILAS; i++) {
            for (int j = 0; j < NUMCOLUMNAS; j++) {
                System.out.print(array[i][j] + "     ");
            }
            System.out.println("");
        }
    }
}
