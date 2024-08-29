import java.util.Scanner;
public class Main {
    static int number;
    static String result;
    public static void Echo() { // Метод - публикация результаотов
        System.out.println(result);
    }
    public static void Input() { // Метод - инициализация числа из консоли
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        number = input.nextInt();
    }
    public static void main(String[] args) { // Основной код
        Input(); // Запрашиваем число
        if (number > 0) {
            result = "Положительное";
        } else if (number < 0) {
            result = "Отрицательное";
        } else if (number == 0) {
            result = "Зеро";
        } else {
            result = "Не число";
        }
        Echo(); // Выводим результат
        for (int i = 2; i <= 20; i+=2) {
            result = i +"";
            Echo(); // Выводим результат 2 - все четные числа от 0 до 20
        }
        Input(); // Запрашиваем число 2
        switch (number) {
            case 1 :
                result = "Пн";
                break;
            case 2 :
                result = "Вт";
                break;
            case 3:
                result = "Ср";
                break;
            default:
                result = "Другой день недели";
        }
        Echo(); // Выводим результат 3
    }
}