package proEstructuraDeDatos.paqS1.EjercicioVector04;

public class ProductoVectorEscalar {

    /**
     * Calcula el producto de un vector unidimensional por un escalar.
     *
     * @param vector       Array de números que representa el vector.
     * @param escalar      Escalar por el cual se multiplicará el vector.
     * @param numElementos Número de elementos del vector.
     * @return Un nuevo array resultante del producto.
     * @throws IllegalArgumentException Si el número de elementos del vector no coincide con el tamaño esperado.
     */
    public static double[] productoVectorEscalar(double[] vector, double escalar, int numElementos) {
        if (vector.length != numElementos) {
            throw new IllegalArgumentException("El número de elementos del vector no coincide con el argumento 'numElementos'.");
        }

        double[] resultado = new double[vector.length];

        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * escalar;
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double[] vector = {1.0, 2.0, 3.0, 4.0};
        double escalar = 2.0;
        int numElementos = 4;

        try {
            double[] resultado = productoVectorEscalar(vector, escalar, numElementos);
            System.out.println("Vector resultante:");
            for (double valor : resultado) {
                System.out.print(valor + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

