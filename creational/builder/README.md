# Patrón Builder

El patrón de diseño *Builder* es un patrón de diseño creacional que se 
utiliza para construir objetos complejos paso a paso. En lugar de crear 
un objeto directamente, el patrón *Builder* separa la construcción del 
objeto de su representación, lo que permite crear diferentes tipos de 
objetos usando el mismo proceso de construcción. Los objetos, al contrario 
de otros patrones creacionales, no tienen que tener una interfaz común. 

Características clave:
- **Builder**: Define la interfaz para construir las diferentes partes 
del objeto. Proporciona métodos para configurar cada parte.
- **Concrete Builder**: Son implementaciones concretas de la interfaz
definidar por `Builder`. Debe incluir un método para obtener el 
objeto resultado de la construcción (*Concrete Product*). Este método 
se debe definir en el `Builder` si los productos pertenecen a una única jerarquía.
- **Concrete Product**: Es el objeto complejo que se está construyendo. 
Contiene todas las partes que se han configurado a través de un *Concrete Builder*.
- **Director**: Es la clase que dirige el proceso de construcción
del objeto. Tiene una referencia a un objeto `Builder` y le da las
instrucciones para construir el objeto. (Se puede prescindir de este
elemento, pero es una buena práctica, ya que en ella se pueden definir
rutinas de construcción reutilizables).
Si se utiliza un `Director`, antes de que comience la construcción este debe conocer el objeto
a construir. Usualmente, esto se implementa mediante los parámetros del constructor del director.
Aunque también, alternativamente, se puede pasar el objeto constructor directamente al método de
construcción.

Tomando como ejemplo la implementación del patrón Builder para la construcción de objetos 
de configuración de aplicaciones en Java, tenemos:

- Interfaz `ConfigBuilder`: que define los métodos para construir los diferentes elementos 
de la configuración.
- Clase base abstracta `BaseConfigBuilder` que implementa la interfaz `ConfigBuilder` y proporciona 
una implementación común para los métodos del `Builder`.
- Implementaciones concretas del `Builder`: `ProductionConfigBuilder` y `DevelopmentConfigBuilder`, 
que extienden `BaseConfigBuilder` y construyen objetos de configuración específicos para entornos 
de producción y desarrollo, respectivamente.
- Clase `ConfigDirector` que utiliza un objeto `ConfigBuilder` para construir objetos de 
configuración completos.
- Clase `ApplicationConfig` que representa el producto final (objeto de configuración de la aplicación).
- Clase `BuilderDemo` que demuestra el uso del patrón `Builder` para crear y mostrar objetos de 
configuración.

En este ejemplo se incluye la clase `BaseConfigBuilder` para evitar código repetitivo en las clases
`ProductionConfigBuilder` y `DevelopmentConfigBuilder`.

Para utilizar el patrón `Builder` en este proyecto, sigue estos pasos:
1. Crear una instancia apropiada del `Builder` (`ProductionConfigBuilder` o `DevelopmentConfigBuilder`) basándote en los requisitos de la aplicación.
2. Crear una instancia de `ConfigDirector` y pasarle el objeto `Builder` del paso 1.
3. Llamar al método `constructConfig()` del `Director` para obtener el objeto de configuración construido.
4. Utilizar el objeto de configuración resultante en la aplicación.

Ejemplo:
```
ConfigBuilder builder = new ProductionConfigBuilder();
ConfigDirector director = new ConfigDirector(builder);
ApplicationConfig config = director.constructConfig();
// Usar el objeto config en la aplicación
```
.