# Proyecto Hash CSV - C++ y Java

## Autor

**Nombre:** ERICK RUBEN HERNANDEZ CHAVEZ  
**Carnet:** 9941-24-24182  

---

## Descripción

Este programa permite administrar estudiantes utilizando estructuras Hash para almacenar, buscar, eliminar y mostrar información de forma eficiente.

La versión en **C++** utiliza una tabla hash creada manualmente, aplicando arreglos y listas enlazadas para resolver colisiones mediante encadenamiento separado.

La versión en **Java** utiliza la estructura nativa `HashMap<Integer, Estudiante>`, la cual permite manejar los datos de una forma más sencilla y automática.

Cada estudiante almacena la siguiente información:

- ID de estudiante
- Nombre completo
- Carrera
- Semestre
- Promedio de calificaciones
- Puntuación de habilidad

---

## Funciones principales

El sistema permite realizar las siguientes acciones:

- Cargar estudiantes desde un archivo CSV
- Buscar estudiantes por `student_id`
- Eliminar estudiantes
- Mostrar estudiantes cargados
- Mostrar estadísticas básicas
- Comparar la implementación en C++ y Java

---

## Funcionamiento

El usuario debe cargar un archivo CSV desde el menú principal.

El sistema lee cada línea del archivo e inserta los estudiantes dentro de la estructura Hash.

En **C++**, los estudiantes se almacenan dentro de cubetas, utilizando listas enlazadas para resolver posibles colisiones.

En **Java**, los estudiantes se almacenan utilizando `HashMap<Integer, Estudiante>`.

El sistema también valida que no se ingresen estudiantes con `student_id` duplicado.

---

## Formato del archivo CSV

El archivo CSV debe tener la siguiente estructura:

```csv
student_id,nombre_completo,carrera,semestre,promedio_calificaciones,puntuacion_habilidad
1001,Juan Perez,Ingenieria en Sistemas,5,85.50,120
1002,Ana Lopez,Ingenieria Industrial,7,91.20,200
1003,Carlos Ruiz,Ingenieria Civil,3,78.30,95
