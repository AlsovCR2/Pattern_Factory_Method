# Patrón de diseño Factory Method

## Propósito
El patrón de diseño Factory Method, también conocido como Método de Fabricación, es un patrón creacional que proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos que se crearán. Su propósito es promover la abstracción y la independencia entre la creación de objetos y su uso.

## Problema que resuelve
Cuando necesitas crear objetos de una familia de clases relacionadas, pero no sabes de antemano qué clase concreta debes instanciar, el Factory Method resuelve este problema. Permite la creación de objetos sin especificar la clase exacta del objeto que se creará.

## Solución
El Factory Method consiste en definir una interfaz (o clase abstracta) que declara un método para crear objetos. Las subclases concretas implementan este método para proporcionar la implementación específica de la creación de objetos. Así, las subclases pueden crear diferentes tipos de objetos mientras se adhieren a la misma interfaz definida por la superclase.

## Estructura
La estructura del Factory Method consta de los siguientes elementos:
- **Producto**: La interfaz o clase abstracta que define los métodos que los objetos creados por el Factory Method deben implementar.
- **Producto Concreto**: Las clases que implementan la interfaz del Producto y proporcionan una implementación específica.
- **Creador**: La interfaz o clase abstracta que declara el Factory Method.
- **Creador Concreto**: Las subclases que implementan el Factory Method para crear instancias de Productos Concretos.

## Ventajas
- Promueve el principio de diseño "Programar para una interfaz, no para una implementación".
- Facilita la expansión de la familia de objetos creados.
- Permite una mayor flexibilidad al cambiar las clases concretas sin modificar el código cliente.

## Desventajas
- Puede llevar a un aumento en la complejidad del código debido a la necesidad de crear múltiples clases.
- Requiere una comprensión más profunda de la estructura de clases y puede resultar en una mayor cantidad de clases en el sistema.

## Cómo implementarlo
Puedes implementar el patrón Factory Method en tu código siguiendo estos pasos:
1. Define una interfaz o clase abstracta para el Producto que declara los métodos comunes que deben implementar las clases concretas.
2. Crea clases concretas que implementen la interfaz del Producto.
3. Define una interfaz o clase abstracta para el Creador que declare el Factory Method.
4. Crea subclases concretas del Creador que implementen el Factory Method para crear instancias de Productos Concretos.
5. En tu código cliente, utiliza una instancia del Creador para crear objetos de Productos sin necesidad de conocer la clase concreta.

Ejemplo de implementación en código:
```python
class Producto:
    def operacion(self):
        pass

class ProductoConcretoA(Producto):
    def operacion(self):
        return "Producto Concreto A"

class ProductoConcretoB(Producto):
    def operacion(self):
        return "Producto Concreto B"

class Creador:
    def factory_method(self):
        pass

class CreadorConcretoA(Creador):
    def factory_method(self):
        return ProductoConcretoA()

class CreadorConcretoB(Creador):
    def factory_method(self):
        return ProductoConcretoB()

# Uso del Factory Method
creador = CreadorConcretoA()
producto = creador.factory_method()
print(producto.operacion())  # Salida: "Producto Concreto A"

