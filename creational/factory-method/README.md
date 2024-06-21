# Patrón *Factory Method*

El patrón de diseño *Factory Method* también conocido como *Factory*
permite delegar la creación de objetos a subclases, manteniendo una 
interfaz común para la creación de objetos.

Características clave:

- **Product**: Interfaz común que define el tipo de objeto a crear mediante el método de fabricación. 
- **Concrete Product**: Implementación concreta de la interfaz *Product*.
- **Creator**: Interfaz o clase abstracta que contiene el *Factory Method* que delega la
creación de objetos a las subclases. 
- **Concrete Creators**: Implementación concreta o subclase que extiende al *Creator*, proporcionando
la implementación del *Factory Method* para crear instancias de objetos concretos.

Tomando como ejemplo una aplicación de cálculo de rutas, que tiene dos posibles
modalidades de cálculo a pie o en bicicleta, podemos implementar:
- `RouteCalculator`: interfaz común que define los objetos para calcular rutas (*Product*).
- `PedestrianRouteCalculator` y `BicycleRouteCalculator`: clases para representar los objetos para 
calcular rutas disponibles. 
- `RouteCalculatorFactory`: interfaz que contiene el método `createRouteCalculator` (*factory method*).
- `PedestrianRouteCalculatorFactory` y `BicycleRouteCalculatorFactory`: implementaciones de `RouteCalculatorFactory` 
que crean a `PedestrianRouteCalculator` y `BicycleRouteCalculator` respectivamente mediante 
la implementación del método `createRouteCalculator` (*f
- actory method*).

Si se quisiera adicionar un nuevo tipo de ruta, por ejemplo para calcular una ruta en
automóvil, se pueden seguir los siguientes pasos:
1. Agregar una nueva implementación de `RouteCalculator`:
```
    public class CarRouteCalculator implements RouteCalculator {
        @Override
        public String calculateRoute(String origin, String destination) {
            return "Ruta en automóvil desde " + origin + " hasta " + destination;
        }
    }
```
2. Agregar una nueva implementación de `RouteCalculatorFactory`:
```
    public class CarRouteCalculatorFactory implements RouteCalculatorFactory {
        @Override
        public RouteCalculator createRouteCalculator() {
            return new CarRouteCalculator();
        }
    }
```