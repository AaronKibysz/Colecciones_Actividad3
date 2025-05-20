# 🚗📚 Actividades Java: Colecciones y Enumeraciones

Este repositorio contiene ejemplos educativos en Java enfocados en el manejo de **colecciones** y el uso avanzado de **`enum`**. Aquí vas a encontrar cómo realizar búsquedas eficientes en listas, cómo clasificar elementos por enumeraciones, y cómo aprovechar al máximo las capacidades de `enum` en Java.

---

## 📌 Índice

1. 🔍 [Búsqueda en Colección (Autos)](#-1-búsqueda-en-colección-autos)
2. 🎓 [Uso básico de Enums](#-2-uso-básico-de-enums)
3. ⚙️ [Métodos útiles en Enums](#-3-métodos-útiles-en-enums)
4. 🌍 [Enums con atributos y métodos](#-4-enums-con-atributos-y-métodos)

---

## 🔍 1. **Búsqueda en Colección (Autos)**

> **Tema:** Búsqueda personalizada en una colección de objetos usando `equalsIgnoreCase` y `Iterator`.

### 🧩 Clases
- `Auto`: modelo con `patente`, `color` y `kmsRecorridos`.
- `Concesionaria`: contiene una lista de autos y permite buscarlos por patente.
- `ActividadColeccionesIII`: clase principal para probar la búsqueda.

### 🛠️ Métodos clave
```java
// Búsqueda por índice
public Auto buscarAuto(String patente) {
    ...
}

// Búsqueda con Iterator (colección genérica)
public Auto buscarAutoConIterador(String patente) {
    ...
}
```

✅ **Resultado esperado:** Buscar un auto por su patente, sin importar mayúsculas/minúsculas.

---

## 🎓 2. **Uso básico de Enums**

> **Tema:** Agrupar personas según su nivel educativo usando `enum`.

### 🧩 Clases
- `NivelEstudio`: `enum` con valores como `PRIMARIO`, `SECUNDARIO`, etc.
- `Persona`: contiene nombre, apellido y nivel de estudio.
- `Empresa`: lista de personas y filtrado por nivel.
- `Principal`: ejecuta la prueba.

### 📋 Código relevante
```java
public enum NivelEstudio {
    SIN_ESTUDIOS, PRIMARIO, SECUNDARIO, TERCIARIO, UNIVERSITARIO, POSGRADO;
}
```

✅ **Resultado esperado:** Mostrar todas las personas con un mismo nivel educativo.

---

## ⚙️ 3. **Métodos útiles en Enums**

> **Tema:** Métodos internos útiles para trabajar con enumeraciones.

### 🔎 Métodos destacados
```java
NivelEstudio[] niveles = NivelEstudio.values(); // Todos los valores
NivelEstudio.valueOf("PRIMARIO");              // Convierte String a enum
NivelEstudio.PRIMARIO.ordinal();               // Índice del enum
```

⚠️ `valueOf("primario")` lanza una excepción porque es sensible a mayúsculas.

📤 Ideal para menús interactivos donde el usuario elige su nivel.

---

## 🌍 4. **Enums con atributos y métodos**

> **Tema:** Enums avanzados con atributos personalizados y métodos propios.

### 🧩 Clases
- `Continente`: `enum` con atributos `cantHabitantes` y `superficie`, más método `densidadPoblacion()`.
- `Principal`: muestra densidades de población por continente.

### 📋 Código relevante
```java
public enum Continente {
    AMERICA(910000000, 42330000),
    ...
    
    public double densidadPoblacion() {
        return this.cantHabitantes / this.superficie;
    }
}
```

✅ **Resultado esperado:** Mostrar densidad de población de cada continente.

---

## ⚙️ Requisitos

- ☕ Java Development Kit (JDK) 8 o superior
- 🛠️ IDE recomendado: IntelliJ, Eclipse, NetBeans, VSCode

---

## ▶️ Cómo ejecutar

1. 🔽 Cloná el repositorio.
2. 📁 Abrilo en tu IDE favorito.
3. ✅ Ejecutá las clases `Principal` o `ActividadColeccionesIII`.

---

## Autor

- POR AARON KIBYSZ a razon de:Trabajo educativo realizado para la práctica de conceptos de programación en Java.

---
