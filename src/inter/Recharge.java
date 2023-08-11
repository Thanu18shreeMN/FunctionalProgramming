package inter;

public class Recharge {
    private int customerId;
    private float amount;

    public Recharge(int customerId, float amount) {
        this.customerId = customerId;
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public float getAmount() {
        return amount;
    }
}
