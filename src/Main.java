public class Main {
    public static void main(String[] args) {
        //Задание 1.1
        System.out.println("Задание 1.1");

        for (int i =0; i <=10; i++) {
            System.out.println("Итерация цикла " + i );
        }
        System.out.println("\n");

        //Задание 1.2
        System.out.println("Задание 1.2");

        for (int i = 10; i >= 0; i --) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("\n");

        //Задание 1.3
        System.out.println("Задание 1.3");

        for (int i = 2; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("Итерация цикла " + i );
            }
        }
        System.out.println("\n");

        //Задание 1.4
        System.out.println("Задание 1.4");

        for (int i = 10; i >= -10; i --) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("\n");

        //Задание 2.1
        System.out.println("Задание 2.1");

        for (int i = 1904; i <= 2096; i = i +4) {
            System.out.println( i + " год является високосным" );
        }
        System.out.println("\n");

        //Задание 2.2
        System.out.println("Задание 2.2");

        for (int i = 7; i <= 98; i = i + 7 ) {
            System.out.print (i + " ");
        }
        System.out.println("\n");

        //Задание 2.3
        System.out.println("Задание 2.3");

        for (int i = 1; i <= 512; i = i*2) {
            System.out.print (i + " ");
        }
        System.out.println("\n");

        //Задание 3.1
        System.out.println("Задание 3.1");

        int contribution = 29_000;
        int vBanke = 0;
        for (int i = 1; i <= 12; i++) {
            vBanke += contribution;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + vBanke + " рублей");
        }
        System.out.println("\n");

        //Задание 3.2
        System.out.println("Задание 3.2");

        int contribution1 = 29_000; // Ежемесячные вложения
        int vBanke1 = 0; // Стартовый капитал
        int godovajaStavka = 12; // процентная ставка (годовых)
        int stavka = godovajaStavka/12;

        for (int i = 1; i <= 12; i++) {
            vBanke1 += contribution1;
            vBanke1 += (vBanke1 * stavka/100);
            System.out.println("Месяц " + i + " , сумма накоплений равна " + vBanke1 + " рублей");
        }
    }
}