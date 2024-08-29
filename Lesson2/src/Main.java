import java.util.Scanner;
public class Main {
    static int num;
    static String calc;
    public static void main(String[] args)
    {
     Input();
     Calc();
     Numbers();
    }
    public static void Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        num = input.nextInt();
        input.close();
    }
    public static void Calc() {
        if (num == 0) {
            System.out.println("Число равно нулю");
        } else if (num > 0) {
            System.out.println("Число положительное");
        } else if (num < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Ошибка! Проверьте введенное число");
        }
    }

    public static void Numbers() {
        for (int i = 2; i<=20; i+= 2) {
            System.out.println(i);

        }
        int p = 11;
        while (p > 1) {
            p -= 1;
            System.out.println(p);
        }
        int n=1;
        int m=1;
        do {
            n = n * m;
            m++;
        } while (m <= num);
        System.out.println(n);
    }
}