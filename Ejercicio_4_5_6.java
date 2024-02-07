import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_4_5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calculateMinMax(scanner);

        int[][] tables = generateMultiplicationTables(10);
        displayMultiplicationTables(tables);

        displayFirstNPrimes(10);

        scanner.close();
    }

    public static void calculateMinMax(Scanner scanner) {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");

        int num;
        while ((num = scanner.nextInt()) >= 0) {
            numbers.add(num);
        }

        if (numbers.isEmpty()) {
            System.out.println("No se introdujeron números.");
        } else {
            int min = numbers.get(0);
            int max = numbers.get(0);

            for (int i = 1; i < numbers.size(); i++) {
                int currentNum = numbers.get(i);
                if (currentNum < min) {
                    min = currentNum;
                }
                if (currentNum > max) {
                    max = currentNum;
                }
            }

            System.out.println("El mínimo es: " + min);
            System.out.println("El máximo es: " + max);
        }
    }

    public static int[][] generateMultiplicationTables(int N) {
        int[][] tables = new int[N][10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                tables[i][j] = i * j;
            }
        }
        return tables;
    }

    public static void displayMultiplicationTables(int[][] tables) {
        for (int i = 0; i < tables.length; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + tables[i][j]);
            }
            System.out.println();
        }
    }

    public static void displayFirstNPrimes(int N) {
        ArrayList<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < N) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }

        System.out.println("Los primeros " + N + " números primos son:");
        for (int prime : primes) {
            System.out.println(prime);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}