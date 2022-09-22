public class Main {
    public static void main(String[] args) {
        // Домашнее задание 3
        System.out.println("Домашнее задание 3");
        // Задание 1.3
        System.out.println("Задание 1.3");
        int moneyPerMonth = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m += 1) {
            total = total + moneyPerMonth;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);

        // Задание 2.3
        System.out.println("Задание 2.3");
        int moneyPerMonth1 = 29000;
        int total1 = 0;
        for (int m = 1; m <= 12; m += 1) {
            total1 = total1 + total1 /100;
            total1 = total1 + moneyPerMonth1;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total1 + " рублей");
        }

    }
}