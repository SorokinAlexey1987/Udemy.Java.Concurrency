public class ATM {
    private int amount;

    public ATM(int amount) {
        this.amount = amount;
    }

    public void withdraw(String name, int amount) {
        System.out.println(name + " went to the ATM");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (amount <= this.amount) {
            this.amount -= amount;
            System.out.println(name + " withdrew " + amount);
            System.out.println("Left: " + this.amount);
        } else {
            System.out.println("There is not enought money in the account for " + name);
        }
    }
}
