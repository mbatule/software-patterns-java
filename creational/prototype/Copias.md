# Copia profunda y copia superficial

Los conceptos de copia profunda (*deep copy*) y copia superficial (*shallow copy*) se aplican 
principalmente a la clonación de objetos, pero también tienen implicaciones en la serialización, 
la asignación de objetos y el manejo de estructuras de datos que contienen objetos. Además, estos 
conceptos no son exclusivos del lenguaje Java, sino que se aplican a la clonación o duplicación de 
objetos en varios lenguajes de programación.
La diferencia clave entre la copia superficial y la copia profunda es que la copia profunda 
crea nuevas instancias de todos los objetos anidados, mientras que la copia superficial comparte 
las referencias a los objetos anidados.

## Copia superficial (*shallow copy*):
Una copia superficial es cuando se crea una nueva instancia de un objeto, pero las referencias a 
los objetos anidados (es decir, los objetos que son campos de la clase) siguen apuntando a los mismos 
objetos que el original. Ejemplo de copia superficial en Java:

```java
public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown");
        Person person1 = new Person("John Doe", address);

        try {
            Person person2 = (Person) person1.clone();
            System.out.println("person1 address: " + person1.address);
            System.out.println("person2 address: " + person2.address);

            // Ambas referencias apuntan al mismo objeto Address
            person2.address.city = "New City";
            System.out.println("person1 address city: " + person1.address.city);
            System.out.println("person2 address city: " + person2.address.city);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

En este ejemplo, cuando se clona el objeto `Person`, se crea una nueva instancia de `Person`, pero la 
referencia al objeto `Address` sigue siendo la misma. Esto significa que cualquier cambio realizado en 
el objeto `Address` a través de `person2` también afectará al objeto `Address` de `person1`.

## Copia profunda (*deep copy*):
Una copia profunda es cuando se crea una nueva instancia del objeto principal y también se crean 
nuevas instancias de todos los objetos anidados. Esto significa que los objetos clonados son 
completamente independientes del original. Ejemplo de copia profunda en Java:

```java
public class Person implements Cloneable {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        clonedPerson.address = (Address) address.clone();
        return clonedPerson;
    }
}

public class Address implements Cloneable {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown");
        Person person1 = new Person("John Doe", address);

        try {
            Person person2 = (Person) person1.clone();
            System.out.println("person1 address: " + person1.address);
            System.out.println("person2 address: " + person2.address);

            // Cambiando el objeto Address de person2 no afecta a person1
            person2.address.city = "New City";
            System.out.println("person1 address city: " + person1.address.city);
            System.out.println("person2 address city: " + person2.address.city);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

En este ejemplo, cuando se clona el objeto `Person`, se crea una nueva instancia de `Person` y también se 
crea una nueva instancia del objeto `Address` anidado. Esto significa que los objetos clonados son 
completamente independientes del original, y los cambios realizados en uno no afectarán al otro.
