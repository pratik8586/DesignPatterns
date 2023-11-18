package Factory;

public class PremiumPlan extends Plan {
    @Override
    public void subscribePlan() {
        System.out.println("Type : PremiumPlan");
    }
}
