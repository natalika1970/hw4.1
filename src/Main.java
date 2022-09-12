public class Main {
    public static void main(String[] args) {
// Циклы задание 1
        System.out.println("Циклы задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация " + i);
        }
        // Циклы задание 2
        System.out.println("Циклы задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация " + i);
        }
        // Циклы задание 3
        System.out.println("Циклы задание 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Итерация " + i);
        }
        // Циклы задание 4
        System.out.println("Циклы задание 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация " + i);
        }

        // Циклы задание 5
        System.out.println("Циклы задание 5");

        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("високосным является год  " + year);
            }


            // Циклы задание 6
            System.out.println("Циклы задание 6");

            for (int i = 7; i <= 98; i = i + 7) {
                System.out.print(i);
            }

            // Циклы задание 7
            System.out.println("Циклы задание 7");

            for (int i = 0; i <= 9; i++) {
                System.out.print(String.format("%.0f", Math.pow(2, i)) + " ");
            }
            System.out.println();

            // Циклы задание 8
            System.out.println("Циклы задание 8");

            int salary = 29000;

            for (int i = 0; i < 12; i = i + 29000) {
                System.out.println("Месяц " + i + " итого " + salary + " рублей");
            }
        }
    }
}

