public class Main {
    public static void main(String[] args) {
        int start = 100;
        int put = 1123;

        int bonus;
        int total;
        if (put > 1000) {
            bonus = put / 100;
            total = start + put + bonus;
            System.out.println("Итоговая сумма на счету клиента - " + total);
        } else {
            total = start + put;
            System.out.println("Итоговая сумма на счету клиента - " + total);
        }
    }
}
