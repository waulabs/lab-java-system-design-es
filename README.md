
![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Java Diseño de sistema

## Introducción

Acabamos de aprender cómo usar Enums y HashMaps y crear diagramas de casos de uso y diagramas de clases UML, así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

1. Crea un nuevo proyecto de Java en tu entorno de desarrollo preferido.
2. En el proyecto, crea una clase llamada `Student` que contenga las siguientes propiedades:
   - `name`: String
   - `grade`: int (en el rango 0-100)
3. Crea un `Map` con una clave del nombre del estudiante (String) y un valor de un objeto `Student`.
4. Crea un método llamado `increaseGrades` que tome un `Map<String, Student>` como parámetro, aumente la calificación de cada estudiante en un 10% y devuelva el mapa actualizado.
5. Crea 4 objetos Student para tus compañeros de clase y agrégalos al `Map`.
6. Crea un diagrama de casos de uso y un diagrama de clases para un sistema bancario en línea. El sistema debe tener las siguientes características:
   - Los usuarios pueden transferir fondos, retirar de sus cuentas y depositar en sus cuentas.
   - Los administradores pueden congelar cuentas en caso de fraude.
   - Utiliza la clase `Money` en tu diagrama de clases.

<br>  

## FAQs (Preguntas frecuentes)

<br>  

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">Estoy atascado y no sé cómo resolver el problema o por dónde empezar. ¿Qué debo hacer?</summary>  

 <!-- ✅ -->  

Si estás atascado en tu código y no sabes cómo resolver el problema o por dónde empezar, debes dar un paso atrás y tratar de formular una pregunta clara y directa sobre el problema específico que enfrentas. El proceso que seguirás al tratar de definir esta pregunta te ayudará a limitar el problema y a encontrar soluciones potenciales.

Por ejemplo, ¿estás enfrentando un problema porque no entiendes el concepto o estás recibiendo un mensaje de error que no sabes cómo arreglar? Por lo general, es útil intentar formular el problema de la manera más clara posible, incluyendo cualquier mensaje de error que estés recibiendo. Esto puede ayudarte a comunicar el problema a otras personas y, potencialmente, a obtener ayuda de tus compañeros o recursos en línea.

Una vez que tengas una comprensión clara del problema, deberías poder comenzar a trabajar hacia la solución.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo creo un proyecto Maven en IntelliJ?</summary>  

 <!-- ✅ -->  

Para crear un proyecto Maven en IntelliJ, puedes seguir estos pasos:

1. Abre IntelliJ IDEA y haz clic en el botón "Create New Project".
2. En el diálogo "New Project", selecciona "Maven" como el sistema de compilación.
3. Especifica el nombre del proyecto.
4. En la sección "Project Location", especifica una ubicación donde quieres guardar tu proyecto.
5. Selecciona la casilla de verificación "Create Git repository" para inicializar el repositorio git al crear el proyecto.
6. Haz clic en el botón "Create" para crear el proyecto Maven.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo utilizo "HashMaps" en Java y cómo puedo imprimirlos en pantalla?</summary>  

 <!-- ✅ -->  

 Un `HashMap` en Java es una estructura de datos que almacena pares clave-valor. Se implementa como un mapa sin ordenar, lo que significa que el orden de los elementos puede cambiar con el tiempo.

 Aquí hay un ejemplo de cómo puedes crear y usar un `HashMap` en Java:

  ```java
  import java.util.HashMap;

  public class Main {
      public static void main(String[] args) {
          HashMap<String, Integer> map = new HashMap<>();
          map.put("Key 1", 1);
          map.put("Key 2", 2);
          map.put("Key 3", 3);

          System.out.println("Value of Key 1: " + map.get("Key 1"));
          System.out.println("Value of Key 2: " + map.get("Key 2"));
          System.out.println("Value of Key 3: " + map.get("Key 3"));
      }
  }
  ```

 En el ejemplo anterior, primero creamos un mapa `HashMap` que almacena claves String y valores Integer. Luego usamos el método `put` para agregar tres pares clave-valor al mapa. Finalmente, usamos el método `get` para recuperar e imprimir los valores asociados con cada clave.

 Para imprimir todo el `HashMap`, puedes usar un bucle `forEach`:

 ```java  
 map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));  
 ```  

 En este ejemplo, el bucle `forEach` itera sobre cada par clave-valor en el `HashMap` e imprime la clave y el valor.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el propósito de un diagrama de caso de uso en el desarrollo de software y cómo se crea?</summary>  

 <!-- ✅ -->  

`Un diagrama de caso` de uso es una representación gráfica de las interacciones entre un sistema y sus usuarios, también conocidos como actores. Se utiliza en el desarrollo de software para describir los requisitos funcionales de un sistema. El propósito de `un diagrama de caso` de uso es proporcionar una visión clara y concisa de los requisitos del sistema y ayudar a los interesados a comprender las interacciones entre el sistema y sus usuarios.

`Un diagrama de caso` de uso se crea identificando a los actores o usuarios del sistema y sus interacciones con el sistema. Las interacciones se representan como casos de uso, que son representaciones gráficas de una tarea o objetivo específico que el usuario desea lograr.

Para crear `un diagrama de caso` de uso, necesitará una herramienta de desarrollo de software que admita diagramas de `UML (Unified Modeling Language)` (Lenguaje de Modelado Unificado). También deberá definir los límites del sistema e identificar a los actores que interactúan con el sistema.

Aquí hay un ejemplo de cómo crear un diagrama de caso de uso en una herramienta de modelado UML:

1. Comienza definiendo los límites del sistema e identificando a los actores.
2. Crea casos de uso para cada interacción entre los actores y el sistema.
3. Conecta a los actores con los casos de uso utilizando líneas para representar las interacciones.
4. Etiqueta cada caso de uso con una descripción clara y concisa de la interacción.
5. Revisa el diagrama para asegurarte de que represente con precisión los requisitos del sistema y las interacciones entre los actores y el sistema.

**Nota**: Este es un ejemplo básico y los pasos para crear **un diagrama de caso** de uso pueden variar dependiendo de la herramienta que esté utilizando.

</details>   

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el propósito de un "diagrama de clases" en el desarrollo de software y cómo se crea?</summary>  

 <!-- ✅ -->  

  `Un diagrama de clases` en el desarrollo de software es una representación visual de las clases, atributos y métodos en un sistema de software. Se utiliza para mostrar las relaciones entre objetos y clases.

  En `un diagrama de clases`, las clases se representan con rectángulos y se etiquetan con sus nombres. Los atributos de la clase se representan con formas "ovaladas" con sus nombres dentro y se etiquetan con un símbolo "+" para los atributos "públicos", un símbolo "-" para los atributos "privados" o un símbolo "#" para los atributos "protegidos". Los métodos de la clase se representan con formas "ovaladas" con sus nombres dentro y se etiquetan con un símbolo "+" para los métodos "públicos", un símbolo "-" para los métodos "privados" o un símbolo "#" para los métodos "protegidos".

  `El diagrama de clases` es una herramienta útil para los desarrolladores ya que proporciona una vista clara y concisa de la estructura del sistema de software y ayuda a identificar cualquier problema potencial temprano en el proceso de desarrollo.

</details>   

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">No puedo enviar cambios a mi repositorio. ¿Qué debo hacer?</summary>

  <!-- ✅ -->

  Si no puedes enviar cambios a tu repositorio, aquí hay algunos pasos que puedes seguir:

  1. Verifica tu conexión a internet: Asegúrate de que tu conexión a internet sea estable y funcione.
  2. Verifica la URL de tu repositorio: Asegúrate de estar usando la URL correcta de tu repositorio para enviar tus cambios.
  3. Revisa tus credenciales de Git: Asegúrate de que tus credenciales de Git estén actualizadas y correctas. Puedes revisar tus credenciales usando el siguiente comando:

  ```bash
  git config --list
  ```

  4. Actualiza tu repositorio local: Antes de enviar cambios, asegúrate de que tu repositorio local esté actualizado con el repositorio remoto. Puedes actualizar tu repositorio local usando el siguiente comando:

  ```bash
  git fetch origin
  ```

  5. Revisa posibles conflictos: Si hay conflictos entre tu repositorio local y el repositorio remoto, resuélvelos antes de enviar cambios.
  6. Envía cambios: Una vez que hayas resuelto los conflictos y actualizado tu repositorio local, puedes intentar enviar cambios nuevamente usando el siguiente comando:

  ```bash
  git push origin <branch_name>
  ```

</details>