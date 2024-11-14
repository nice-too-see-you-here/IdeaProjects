//    Создайте программу, которая:
//        Читает файл, указанный пользователем.
//        Делит два числа, введенных пользователем.
//        Преобразует строку в число.
//
//Обработайте возможные исключения для каждой операции:
//
//    Чтение файла (FileNotFoundException, IOException).
//    Деление на ноль (ArithmeticException).
//    Преобразование строки в число (NumberFormatException).


import java.io.*;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {



    public static void main(String[] args) {

        try {
            File imprt = new File("/home/user/IdeaProjects/Lesson6/src/import.txt");
            FileReader fl = new FileReader(imprt);
            BufferedReader bfl = new BufferedReader(fl);
            String ln = bfl.readLine();
            System.out.println(ln);

            Scanner sc = new Scanner(System.in);
            System.out.println("Что будем делить?");
            int a = sc.nextInt();

            System.out.println("На что будем делить?");
            int b = sc.nextInt();


            int mres = a / b;

            String result = String.valueOf(mres);
            System.out.println(result);

            System.out.println("Введите Значение для строки (преобразование в число):");
            result = sc.next();
            int mres2 = Integer.valueOf(result);
            System.out.println(mres2);
        }

        catch (ArithmeticException e) {
            System.out.println("Ошибка! Деление на ноль?");
        }

        catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл не найден.");
        }

        catch (IOException e){
            System.out.println("Ошибка чтения файла!");
        }

        catch (NumberFormatException e){
            System.out.println("Ошибка вывода строки! Проверьте число!");
        }

        finally {
            System.out.println("Программа завершила свою работу.");
        }

    }




}