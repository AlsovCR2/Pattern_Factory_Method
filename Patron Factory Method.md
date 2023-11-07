# Patrón de diseño Factory Method

## Propósito
El patrón de diseño Factory Method, también conocido como Método de Fabricación, es un patrón creacional que proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos que se crearán. Su propósito es promover la abstracción y la independencia entre la creación de objetos y su uso.

## Problema que resuelve
Imagina que estás creando una aplicación de gestión logística. La primera versión de tu aplicación sólo es capaz de manejar el transporte en camión, por lo que la mayor parte de tu código se encuentra dentro de la clase Camión.

Al cabo de un tiempo, la aplicación se vuelve bastante popular. Cada día recibes decenas de peticiones de empresas de transporte marítimo para que incorpores la logística por mar a la aplicación.

En este momento, la mayor parte de tu código está acoplado a la clase Camión. Para añadir barcos a la aplicación habría que hacer cambios en toda la base del código. Además, si más tarde decides añadir otro tipo de transporte a la aplicación, probablemente tendrás que volver a hacer todos estos cambios.

Al final acabarás con un código bastante sucio, plagado de condicionales que cambian el comportamiento de la aplicación dependiendo de la clase de los objetos de transporte.

## Solución
El patrón Factory Method sugiere que, en lugar de llamar al operador new para construir objetos directamente, se invoque a un método fábrica especial. Los objetos se siguen creando a través del operador new, pero se invocan desde el método fábrica. Los objetos devueltos por el método fábrica a menudo se denominan productos.

No obstante, hay una pequeña limitación: las subclases sólo pueden devolver productos de distintos tipos si dichos productos tienen una clase base o interfaz común. Además, el método fábrica en la clase base debe tener su tipo de retorno declarado como dicha interfaz.

## Estructura
La estructura del Factory Method consta de los siguientes elementos:
- **Producto**: La interfaz o clase abstracta que define los métodos que los objetos creados por el Factory Method deben implementar.
- **Producto Concreto**: Las clases que implementan la interfaz del Producto y proporcionan una implementación específica.
- **Creador**: La interfaz o clase abstracta que declara el Factory Method.
- **Creador Concreto**: Las subclases que implementan el Factory Method para crear instancias de Productos Concretos.

## Ventajas
- Evitas un acoplamiento fuerte entre el creador y los productos concretos.
- Principio de responsabilidad única. Permite mover el código de creación de producto a un lugar del programa, haciendo que el código sea más fácil de mantener.
- Principio de abierto/cerrado. Permite incorporar nuevos tipos de productos en el programa sin descomponer el código cliente existente.
- 
## Desventajas
Puede ser que el código se complique, ya que se debe incorporar una multitud de nuevas subclases para implementar el patrón. La situación ideal sería introducir el patrón en una jerarquía existente de clases creadoras.

## Cómo implementarlo
Puedes implementar el patrón Factory Method en tu código siguiendo estos pasos:
1. Define una interfaz o clase abstracta para el Producto que declara los métodos comunes que deben implementar las clases concretas.
2. Crea clases concretas que implementen la interfaz del Producto.
3. Define una interfaz o clase abstracta para el Creador que declare el Factory Method.
4. Crea subclases concretas del Creador que implementen el Factory Method para crear instancias de Productos Concretos.
5. En tu código cliente, utiliza una instancia del Creador para crear objetos de Productos sin necesidad de conocer la clase concreta.

## Referencias
Refactoring Guru. (s.f.). Patrón de diseño Factory Method. Recuperado de https://refactoring.guru/es/design-patterns/factory-method
