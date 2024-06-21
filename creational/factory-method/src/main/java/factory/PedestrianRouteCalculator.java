package factory;

public class PedestrianRouteCalculator implements RouteCalculator {
    @Override
    public String calculateRoute(String origin, String destination) {
        return "Ruta a pie desde " + origin + " hasta " + destination;
    }

}