import java.util.Scanner;
public class Main {
    static int number;
    static int a;
    static int b;
    static String result;
    static String dispmatr = "";
    static int[] matrix1 = new int[number];
    static int[][] matrix2;

    public static void Echo(){
        System.out.println(result + "");
    }

    public static void Input() {
        Scanner input = new Scanner(System.in);
        result = "Введите число: ";
        Echo();
        number = input.nextInt();
    }

    public static void main(String[] args) {
        Matrix();
        result ="Сумма элеметнов одномерного массива = " + Sum(matrix1);
        Echo();
        result ="Рандомный двумерный массив: ";
        Echo();
        Matrix2();
        result = "Проверяем массив - элемент второй строки второго столбца равен:" + matrix2[1][1];
        Echo();
        Div();
    }
    public static void  Matrix() {
        result = "Сколько элементов хотите в одномерном массиве?";
        Echo();
        Input();
        int size = number;
        matrix1 = new int[number];
        for (int i = 0; i < size; i++) {
            result = ("Элемент " + (i+1) + ".");
            Echo();
            Input();
            matrix1[i] = number;
        }
    }
    public static int Sum(int[] matrix1) {
        int sum = 0;
        for (int i = 0; i < matrix1.length; i++) {
            sum = sum + matrix1[i];
        }
        return sum;
    }
    public static void Matrix2() {
         int a = (int) ((Math.random() * 9)+2);
         int b = (int) ((Math.random() * 9)+2);
         matrix2 = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int c = 0; c < b; c++) {
                matrix2[i][c] = (int) ((Math.random() * 9)+1);
                dispmatr = dispmatr + matrix2[i][c] + " ";
            }
            result = dispmatr;
            Echo();
            dispmatr = "";
        }
    }

    public static void Div() {
        result = "ЧТО будем делить?";
        Echo();
        Input();
        int d1 = number;
        result = "НА ЧТО будем делить?";
        Input();
        int d2 = number;
        try {
          int div =  d1 / d2;
          result = div + "";
        } catch (ArithmeticException e) {
            result = "Ошибка! Делим на ноль?";
        } finally {
            Echo();
        }

    }


}