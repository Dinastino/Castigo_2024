import java.util.Arrays;
public class Ejercicio_1_2_3 {
    public static void main(String[] arg){
        System.out.println(problema1());
        System.out.println(problema2());
        problema3();
    }

    public static int problema1(){
        int dias_Año = 365;
        int horas_dia = 24;
        int min_hora = 60;
        int sec_min = 60;
        int segundos_año = dias_Año*horas_dia*min_hora*sec_min;
        return segundos_año;
    }

    public static int problema2(){
        System.out.println("El maximo del char es: \n" + ((int) Character.MAX_VALUE));
        System.out.println("El maximo del int es: \n" + Integer.MAX_VALUE);
        System.out.println("El maximo del short es: \n" + Short.MAX_VALUE);
        return 0;
    }

    public static void problema3() {
        int[] multiplosDe5 = obtenerMultiplosDe5(1, 100);
        System.out.println("Los múltiplos de 5 entre 1 y 100 son: " + Arrays.toString(multiplosDe5));
        System.out.println("La suma de los múltiplos de 5 es: " + sumarValoresArray(multiplosDe5));
    }

    public static int[] obtenerMultiplosDe5(int begin, int end) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }
        int[] multiplos = new int[count];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplos[index] = i;
                index++;
            }
        }
        return multiplos;
    }

    public static int sumarValoresArray(int[] array) {
        int suma = 0;
        for (int i : array) {
            suma += i;
        }
        return suma;
    }
}
