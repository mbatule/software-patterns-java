package factory;

public class PedestrianRouteCalculatorFactory implements RouteCalculatorFactory {
    @Override
    public RouteCalculator createRouteCalculator() {
        return new PedestrianRouteCalculator();
    }
}