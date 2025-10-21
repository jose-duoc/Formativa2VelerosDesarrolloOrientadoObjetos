# Formativa2 - Gestión de Veleros

Este proyecto en Java es una aplicación de consola para gestionar un catálogo de veleros, permitiendo ingresar nuevos veleros, mostrar el precio final calculado, aplicar ajustes y contar los veleros registrados.

---

## Descripción

La aplicación permite:
- Registrar veleros de tipo *Ligero* u *Oceánico*.
- Mostrar el precio base y el precio final calculado de un velero específico.
- Aplicar ajustes de precio (en desarrollo).
- Contar la cantidad de veleros registrados (en desarrollo).

El código utiliza programación orientada a objetos con clases que representan los diferentes tipos de veleros, y usa polimorfismo para el cálculo del precio final.

---

## Estructura del proyecto

- `Formativa2.java`: clase principal con el menú y la lógica de interacción con el usuario.
- Clases `VeleroLigero` y `VeleroOceanico`: heredan de una clase base (presumiblemente `Datos`) y contienen la lógica específica para cada tipo de velero.

---

## Uso

1. Clonar el repositorio:
    ```bash
    git clone <url-del-repositorio>
    ```

2. Compilar el proyecto (desde la carpeta raíz):
    ```bash
    javac package_formativa2/*.java
    ```

3. Ejecutar la aplicación:
    ```bash
    java package_formativa2.Formativa2
    ```

4. Seguir el menú para:
   - Ingresar veleros con sus datos (tipo, código, nombre, precio base, marca, modelo, año, cantidad de velas, eslora).
   - Consultar el precio final de un velero ingresado por su código.
   - (Próximamente) Ajustar precios y contar veleros.

---

## Requisitos

- Java JDK 8 o superior
- Terminal o consola para ejecutar la aplicación

---

## Notas

- El menú actualmente tiene opciones en desarrollo (3 y 4).
- El código prevé evitar veleros duplicados por código.
- El método de cálculo del precio final está basado en polimorfismo en las subclases de velero.

---

## Autor

Duoc

---

¿Preguntas o sugerencias? Abre un issue o contacta al autor.

