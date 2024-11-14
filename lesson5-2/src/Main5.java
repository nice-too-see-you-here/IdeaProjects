//Создай базовый класс Person, который содержит поля name и age, а также метод displayInfo(), который выводит
// информацию о человеке.

//Создай класс-наследник Student, который добавляет поле studentId и переопределяет метод displayInfo() для вывода
// дополнительной информации.

//Создай класс-наследник Teacher, который добавляет поле subject и также переопределяет метод displayInfo().

public class Main5 {
    class Person {
        private String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("Имя: " + name + "; Возраст: " + age);
        }
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class Student extends Person {
            int studentID;

            Student(String name, int age, int studentID){
                super(name,age);
                this.studentID = studentID;
            }

            @Override
            public void displayInfo() {
            super.displayInfo();
            System.out.println("ID :" + studentID);
            }
    }

    class Teacher extends Person {
            String subject;

            Teacher(String name, int age, String subject){
                super(name, age);
                this.subject = subject;
            }

            @Override
            public void displayInfo(){
                super.displayInfo();
                System.out.println("Предмет: " + subject);
            }

    }




    public static void main(String[] args) {
        Main5 main = new Main5();
        Person Vasya = main.new Person("Вася", 22);
        Vasya.displayInfo();
        Student Vasiliy = main.new Student("Василий", 25, 10011);
        Vasiliy.displayInfo();
        Teacher VasPetr = main.new Teacher("Василий петрович", 35, "Java");
        VasPetr.displayInfo();
    }
}
