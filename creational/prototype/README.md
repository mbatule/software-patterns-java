# Patrón Prototype

El patrón de diseño *Prototype* es un patrón de diseño creacional. 
Su objetivo principal es crear nuevos objetos clonando (copiando) otros 
existentes, en lugar de crearlos desde cero. Esto puede ser útil cuando 
crear un objeto es costoso o complejo.

Características clave:
- **Prototype**: interfaz que declara los métodos de clonación.
- **Concrete Prtotype**: implementa la interfaz *Prototype*.
- **Prototype Registry**: clase que almacena un catálogo de prototipos de uso frecuente y permite 
la clonación de estos objetos a partir de un criterio de búsqueda para localizar al objeto
adecuado. Este registro es una parte opcional del patrón de diseño. 


Consideraciones:

- En Java, el patrón *Prototype* se puede implementar a través de la interfaz `Cloneable`. 
La misma indica que una clase puede ser clonada a través del método `clone()` para devolver 
una copia del objeto.
- En la clonación es preciso considerar el tipo de [copia](./Copias.md) apropiado según el caso que se
esté implementando.

Ejemplo: 

Tomando como ejemplo la implementación del patrón *ProtoType* en una aplicación que trabaja con 
diferentes formas geométricas, como círculos, rectángulos y triángulos, tenemos:
- `Shape`: interfaz que define el contrato para las formas geométricas y extiende la interfaz `Cloneable`.
- `Circle` y `Rectangle`: clases concretas que implementan la interfaz `Shape` y sobrescriben el método 
`clone()`.
- `ShapeRegistry`: clase que actúa como el cliente del patrón `Prototype`. Registra los prototipos de 
formas y proporciona un método para crear nuevas formas clonando los prototipos.
- `PrototypeDemo`: clase que demuestra el uso del patrón. En el método `main()`, se registran los 
prototipos de círculo y rectángulo, y luego se crean nuevas formas clonando los prototipos.


