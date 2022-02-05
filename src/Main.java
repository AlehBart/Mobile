public class Main {
    public static void main(String[] args) {
        int saldo = 200;
        int boost = 1500;
        int newbalance;
        if (boost >= 1000) {
            newbalance = saldo + boost + boost / 100;
        } else {
            newbalance = saldo + boost;
        }
        System.out.println("Ваш счет пополнен. Актуальный баланс:");
        System.out.println(newbalance);

    }
}