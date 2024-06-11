public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        for (byte i = 1; i <= 10; i ++) {
            System.out.println(i);
        }

        System.out.println("Задание 2");

        for (byte q = 10; q >= 1; q --) {
            System.out.println(q);
        }

        System.out.println("Задание 3");

        for (int w = 0; w < 17; w = w + 2) {
            System.out.println(w);
        }

        System.out.println("Задание 4");

        for (int e = 10; e >= -10; e --) {
            System.out.println(e);
        }

        System.out.println("Задание 5");

        for (int r = 1904; r <= 2096; r = r + 4) {
            System.out.println(r + " год являяется високосным");
        }

        System.out.println("Задание 6");

        for (int t = 7; t <= 98; t = t + 7) {
            System.out.println(t);
        }

        System.out.println("Задание 7");

        for (int y = 1; y <= 512; y = y * 2) {
            System.out.println(y);
        }

        System.out.println("Задание 8");

        int money = 29000;
        int total = 0;
        for (int y = 0; y <= 12; y ++) {
            total = total + money;
            System.out.println("Месяц " + y + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 9");

        int money1 = 29000;
        int total1 = 0;
        for (int u = 0; u <= 12; u ++) {
            total1 = total1 + total1/100;
            total1 = total1 + money1;
            System.out.println("Месяц " + u + ", сумма накоплений равна " + total1 + " рублей");
        }

        System.out.println("Задание 10");
        byte a = 2;
        for (int p = 1; p <= 10; p ++) {
            System.out.println(a + " * " + p + " = " + p * a);
        }
    }
}