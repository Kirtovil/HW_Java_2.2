public class Main {

    public static void main(String[] args) {

        int balance = 250; // сумма присутствуящая на счету
        int replenishment = 1325; // сумма пополнения
        int bonusPrice = 100; // цена бонусного рубля
        int bonusCash;

        if (replenishment > 1000) {
            bonusCash = replenishment / bonusPrice;
        } else {
            bonusCash = 0;
        }
        int newBalance = balance + replenishment +bonusCash;
        System.out.println("На вашем счету - " + newBalance + "руб.; бонус составил - " + bonusCash + "руб.");
    }
}