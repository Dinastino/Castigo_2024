import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio_7_8_9_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tarea 1: Descomposición en factores primos
        System.out.print("Introduce un número entero para descomponer en factores primos: ");
        int num = scanner.nextInt();
        int[] primeFactors = primeFactorization(num);
        System.out.print("Los factores primos de " + num + " son: ");
        for (int i = 0; i < primeFactors.length; i++) {
            if (i != 0) {
                System.out.print(" * ");
            }
            System.out.print(primeFactors[i]);
        }
        System.out.println();

        // Tarea 2: Calcular media, mínimo y máximo
        System.out.println("Introduce números enteros (0 para terminar):");
        int[] numbers = readNumbers(scanner);
        double average = calculateAverage(numbers);
        int min = findMin(numbers);
        int max = findMax(numbers);
        System.out.println("Media: " + average);
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);

        // Tarea 3: Producto escalar de dos vectores
        System.out.print("Introduce la longitud de los vectores: ");
        int N = scanner.nextInt();
        int[] vector1 = readVector(scanner, N);
        int[] vector2 = readVector(scanner, N);
        int scalarProduct = calculateScalarProduct(vector1, vector2);
        System.out.println("El producto escalar de los dos vectores es: " + scalarProduct);

        // Tarea 4: Rellenar matriz cuadrada simétrica con números aleatorios
        System.out.print("Introduce la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();
        int[][] symmetricMatrix = generateSymmetricMatrix(dimension);
        System.out.println("Matriz cuadrada simétrica:");
        printMatrix(symmetricMatrix);

        scanner.close();
    }

    // Tarea 1
    public static int[] primeFactorization(int num) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        return factors.stream().mapToInt(Integer::intValue).toArray();
    }

    // Tarea 2
    public static int[] readNumbers(Scanner scanner) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        int num;
        while ((num = scanner.nextInt()) != 0) {
            numbersList.add(num);
        }
        return numbersList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static double calculateAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

    public static int findMin(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(0);
    }

    public static int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElse(0);
    }

    // Tarea 3
    public static int[] readVector(Scanner scanner, int N) {
        int[] vector = new int[N];
        System.out.println("Introduce los elementos del vector:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    public static int calculateScalarProduct(int[] vector1, int[] vector2) {
        int product = 0;
        for (int i = 0; i < vector1.length; i++) {
            product += vector1[i] * vector2[i];
        }
        return product;
    }

    // Tarea 4
    public static int[][] generateSymmetricMatrix(int dimension) {
        Random random = new Random();
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int randomNumber = random.nextInt(100); // Limitado a 100 para simplificar la visualización
                matrix[i][j] = randomNumber;
                matrix[j][i] = randomNumber; // Simetría
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
