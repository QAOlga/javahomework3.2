public class Main {

    public static void main(String[] args) {
        int currentBalance = 100;
        int refill = 1100;
        int newBalance;
        if(refill > 1000) {
            newBalance = refill / 100 + refill + currentBalance;
        } else {
            newBalance = refill + currentBalance;
        }
        System.out.println("Balance: " + newBalance);
    }
    }