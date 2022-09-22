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
    }
}