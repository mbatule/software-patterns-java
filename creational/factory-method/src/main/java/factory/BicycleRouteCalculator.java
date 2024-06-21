package factory;

public class BicycleRouteCalculator implements RouteCalculator {
    @Override
    public String calculateRoute(String origin, String destination) {
        return "Ruta en bicicleta desde " + origin + " hasta " + destination;
    }

}