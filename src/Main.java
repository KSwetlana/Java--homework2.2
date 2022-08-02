public class Main {
    public static void main(String[] args) {
        System.out.println("===Домашняя работа N2.2===\n");
        int amount = 1500;
        int balance = 200;
        int bonus = 0;
        if (amount >= 1000) {
            bonus = (amount / 100);
        }
        System.out.println("итоговый бонус: " + bonus);
        System.out.println("итоговая сумма: " + (bonus + amount + balance));
        System.out.println("\n\n\n");
    }


}
