# Patrón *Abstract Factory*

El patrón de diseño *Abstract Factory* es un patrón que permite crear familias de objetos 
relacionados sin especificar sus clases concretas. Permite a los clientes generar objetos sin preocuparse 
por la implementación detallada de los objetos.

Características clave:
- **Abstract Factory**: Interfaz que define una familia de objetos relacionados. (Ella conoce todos los 
objetos (productos abstractos) y tendrá que ser implementada por cada familia).
- **Concrete Factory**: Implementación concreta de la interfaz *Abstract Factory* para la creación de los
distintos objetos de una familia.
- **Abstract Product**: Interfaz que define un objeto de la familia.
- **Concrete Product**: Implementación concreta de la interfaz *Abstract Product*.

Tomando como ejemplo un comercio de electrodomésticos que tiene tres líneas de produción (gamas Alta, 
Media y Baja) podemos implementar:
- `ElectronicFactory`: interfaz que se corresponde con la *Abstract Factory* y permite crear los objetos de 
una familia de electrodomésticos (laptop, tableta y teléfono inteligente).
- `HighEndFactory`, `MidRangeFactory` y `LowEndFactory`: interfaces que se corresponden con 
implementaciones concretas de `ElectronicFactory` y representan las diferentes líneas de producción 
(*Concrete Factory*).
- `Laptop`, `Tablet` y `Smartphone`: interfaces que definen los productos a comercializar (*Abstract 
Product*).
- `HighEndLaptop`, `HighEndTablet`, `HighEndSmartphone`, `MidRangeLaptop`, `MidRangeTablet`, 
`MidRangeSmartphone`, `LowEndLaptop`, `LowEndTablet` y `LowEndSmartphone`: clases para representar 
los productos concretos de cada una de las líneas de producción (*Concrete Product*).

En esta implementación se incluye la clase `FactoryProvider` donde se elige
la implementación concreta de una fábrica en tiempo de ejecución en función
de un parámetro específico (Cadena de texto en el ejemplo). 
Esta es clase es una muestra de implementación de *selección dinámica de 
fábricas* donde en lugar de instanciar directamente una implementación 
concreta, se utiliza un mecanismo para determinar qué fábrica concreta 
debe ser utilizada en función de ciertas condiciones o requisitos en el 
momento de la ejecución del programa. 
Esto proporciona flexibilidad y extensibilidad al permitir cambiar la
implementación de la fábrica sin modificar el código principal.





