public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        for (byte impaledStacks = 1; impaledStacks <= 10; impaledStacks++) {
            System.out.println(impaledStacks);
        }

        System.out.println("Задание 2");

        for (byte evenNumber = 10; evenNumber >= 1; evenNumber--) {
            System.out.println(evenNumber);
        }

        System.out.println("Задание 3");

        for (int countDown = 0; countDown < 17; countDown = countDown + 2) {
            System.out.println(countDown);
        }

        System.out.println("Задание 4");

        for (int countReverse = 10; countReverse >= -10; countReverse--) {
            System.out.println(countReverse);
        }

        System.out.println("Задание 5");

        for (int yearLeap = 1904; yearLeap <= 2096; yearLeap = yearLeap + 4) {
            System.out.println(yearLeap + " год являяется високосным");
        }

        System.out.println("Задание 6");

        for (int timeRunning = 7; timeRunning <= 98; timeRunning = timeRunning + 7) {
            System.out.println(timeRunning);
        }

        System.out.println("Задание 7");

        for (int youngPeople = 1; youngPeople <= 512; youngPeople = youngPeople * 2) {
            System.out.println(youngPeople);
        }

        System.out.println("Задание 8");

        int money = 29000;
        int total = 0;
        for (int y = 0; y <= 12; y++) {
            total = total + money;
            System.out.println("Месяц " + y + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 9");

        int money1 = 29000;
        int total1 = 0;
        for (int u = 0; u <= 12; u++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + money1;
            System.out.println("Месяц " + u + ", сумма накоплений равна " + total1 + " рублей");
        }

        System.out.println("Задание 10");
        byte multiplier = 2;
        for (int p = 1; p <= 10; p++) {
            System.out.println(multiplier + " * " + p + " = " + p * multiplier);
        }
    }
}