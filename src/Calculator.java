import java.util.Scanner;

public class Calculator {

    public static int sumar(int a, int b){
        int result;
        result = a + b;
        return result;
    }

    public static int restar(int a, int b){
        int result;
        result = a - b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = sumar(5, 7);
        int resta = restar(10, 5);
        System.out.print("suma = " + suma + " "+ "resta = " + resta);
    }

        public static int multiplicar(int a, int b){
            int result;
            result = a * b;
            return result;
        }

    public static int dividir(int a, int b){
        int result;
        result = a / b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicacion = multiplicar(5, 7);
        int division = dividir(10, 5);
        System.out.print("multiplicacion = " + multiplicacion + " "+ "division = " + division);
    }
}
