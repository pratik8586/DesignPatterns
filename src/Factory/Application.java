package Factory;

public class Application {
    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();
        // Trial Plan
        Plan plan = planFactory.getPlan(PlanType.TRIAL);
        plan.subscribePlan();

        // Premium Plan
        plan = planFactory.getPlan(PlanType.PREMIUM);
        plan.subscribePlan();

        // Advanced Plan
        plan = planFactory.getPlan(PlanType.ADVANCED);
        plan.subscribePlan();
    }
}
