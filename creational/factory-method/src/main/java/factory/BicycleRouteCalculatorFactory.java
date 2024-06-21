package factory;

public class BicycleRouteCalculatorFactory implements RouteCalculatorFactory {
    @Override
    public RouteCalculator createRouteCalculator() {
        return new BicycleRouteCalculator();
    }
}