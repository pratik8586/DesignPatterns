package Factory;

public class PlanFactory {

    public Plan getPlan(PlanType planType) {

        switch (planType) {
            case BASIC -> {
                return new BasicPlan();
            }
            case PREMIUM -> {
                return new PremiumPlan();
            }
            case ADVANCED -> {
                return new AdvancedPlan();
            }
        }
        return new TrialPlan();
    }
}
