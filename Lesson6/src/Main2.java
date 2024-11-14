//Создай класс, реализующий List (например, ArrayList), и наполни его элементами.
//Создай обобщенный класс, который хранит пару элементов (например, ключ-значение), и протестируй его с разными типами данных.


import java.util.ArrayList;
import java.util.HashMap;

public class Main2 {
    static ArrayList<Integer> intList = new ArrayList<>();

    public static ArrayList<Integer> ListInt() {
        intList.add(1);
        intList.add(2);
        intList.add(3);
        return intList;

    }

    class Gen<T, X> {
        private T value;
        private X value2;
        public void setValue(T value, X value2) {
            this.value = value;
        }

        public T getValue(T value, X value2) {
            return value value2;
        }


    }



    public static void main(String[] args){
        Main2 main = new Main2();
        ListInt();
        System.out.println(intList);
        Gen <Integer, String> hm = main.new Gen<>();
        hm.setValue(1, "String1");
        System.out.println(hm.getValue(2,"123"));

    }
}
