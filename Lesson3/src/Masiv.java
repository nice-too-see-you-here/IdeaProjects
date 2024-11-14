//Создайте массив строк и инициализируйте его несколькими значениями. Пройдитесь по массиву и выведите каждую строку в верхнем регистре.
//Создайте строку, которая содержит ваше полное имя. Используйте методы класса String, чтобы:
//
//    Получить и вывести первую букву вашего имени.
//    Найти индекс пробела между именем и фамилией.
//    Заменить фамилию на другую.


public class Masiv {
    public static void main(String[] args) {
        String[] matrix;
        matrix = new String[3];
        matrix[0] = "string 1";
        matrix[1] = "string 2";
        matrix[2] = "string 3";

        for(int i = 0; i < matrix.length; i++){
           String str = matrix[i];
           String uStr = str.toUpperCase();
           System.out.println(uStr);
        }

        String name = new String("Федор Достоевский");
        int index = name.indexOf(" ");
        System.out.println("Индекс пробела: " + index);
        System.out.println("Первая буква: " + name.charAt(0));
        name = name.replace("Достоевский", "Двинятин");
        System.out.println(name);



    }
}
