public class Main {
    public static void main(String[] args) {

        int balance = 100; // на счете 100 рублей
        int replenishment = 2000; // сумма пополнения 2000 рублей
        int bonus = replenishment > 1000 ? replenishment / 100 : replenishment;
        int total = balance + replenishment + bonus;

        System.out.println("Итоговый баланс:" + total);
        System.out.println("Количество бонусов:" + bonus);

    }
}