# TIPOS DE DATOS EN JAVA

## JavaVirtualMachine (JVM)

* Realiza una gestión eficiente de la memoria.
* Distribuye la memoria en dos zonas: stack(pila) y heap (monton)

![RAM](ram.jpeg "RAM")

### Stack

* Se almacenan: variables locales, llamadas a metodos (parametros y resutados), variables primitivas, referencias a objetos del heap.
* Memoria estática.

### Heap

* Es gestionado por el garbage collector.
* Espacio de memoria en tiempo de ejecucion donde se registran los objetos.
* Es una memoria dinámica.
* No posee estructura de asignacion de espacios.

## Variable
* Contenedor de memoria donde se almacena informacion.
* En java se declara con un tipo que se conservara durante todo su ciclo de vida en el interior de la aplicacion.
* La variable debe tener un nombre.
* Existen de tipo primitivo y referenciado.

## PRIMITIVOS

* Contenedores de tamaño especifico que almacenan valores y no tienen metodos
* Ejemplos: Boolean, char, byte, shot, long, float, double.

## REFERENCIADOS

* Almacenan  las referencias a los datos.
* Estos datos se escriben en una zona de memoria llamada heap.
