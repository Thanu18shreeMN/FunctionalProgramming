package inter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RechargeConsumerData {
    public static void rechargeData(List<Recharge> rechargeList, Function<Recharge, String> function) {
        for (Recharge recharge : rechargeList) {
            String result = function.apply(recharge);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        List<Recharge> rechargeList = new ArrayList<>();
        rechargeList.add(new Recharge(1, 100.0f));
        rechargeList.add(new Recharge(2, 50.0f));
        rechargeList.add(new Recharge(3, 200.0f));

        Function<Recharge, String> function = recharge -> "Customer ID: " + recharge.getCustomerId() +
                ", Amount Recharged: " + recharge.getAmount();

        rechargeData(rechargeList, function);
    }
}
