package factory;

import java.util.Arrays;

public class FactoryDemo {

    public static void main(String[] args) {
        String origin = "Origin";
        String destination = "Destination";

        RouteCalculatorFactory[] routeCalculatorFactories = {new PedestrianRouteCalculatorFactory(),
                new BicycleRouteCalculatorFactory()};

        Arrays.stream(routeCalculatorFactories)
                .map(RouteCalculatorFactory::createRouteCalculator)
                .map(routeCalculator -> routeCalculator.calculateRoute(origin, destination))
                .forEach(FactoryDemo::paintRoute);

    }

    private static void paintRoute(String route) {
        System.out.println("Pintando " + route);
        System.out.println("");
    }
}