# Conversor de Monedas - Challenge ONE Java Back End

## Descripción
Aplicación de consola en Java que permite convertir entre diferentes monedas utilizando tasas de cambio en tiempo real desde la API de ExchangeRate-API.

## Características
✅ Conversión en tiempo real usando API externa
✅ Soporte para múltiples monedas (USD, ARS, BRL, COP)
✅ Interfaz de consola intuitiva
✅ Manejo de errores y validaciones
✅ Uso de HttpClient (Java 11+)
✅ Procesamiento de JSON con Gson

## Requisitos
- Java 11 o superior
- Conexión a internet (para consultar la API)
- Biblioteca Gson (incluida en el proyecto)

## Conversiones Disponibles
1. Dólar (USD) → Peso argentino (ARS)
2. Peso argentino (ARS) → Dólar (USD)
3. Dólar (USD) → Real brasileño (BRL)
4. Real brasileño (BRL) → Dólar (USD)
5. Dólar (USD) → Peso colombiano (COP)
6. Peso colombiano (COP) → Dólar (USD)

## Estructura del Proyecto
```
conversor-monedas/
├── src/
│   └── com/
│       └── aluracursos/
│           └── conversor/
│               ├── Principal.java          # Clase principal con menú
│               ├── ConversorMoneda.java    # Lógica de conversión
│               └── ConsultaAPI.java        # Consultas HTTP a la API
├── lib/
│   └── gson-2.10.1.jar                     # Biblioteca Gson
└── README.md
```

## Instalación y Ejecución

### 1. Descargar Gson
Descarga la biblioteca Gson desde:
https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar

Coloca el archivo `gson-2.10.1.jar` en la carpeta `lib/`

### 2. Compilar el proyecto
```bash
javac -cp "lib/gson-2.10.1.jar" -d bin src/com/aluracursos/conversor/*.java
```

### 3. Ejecutar la aplicación
#### En Windows:
```bash
java -cp "bin;lib/gson-2.10.1.jar" com.aluracursos.conversor.Principal
```

#### En Linux/Mac:
```bash
java -cp "bin:lib/gson-2.10.1.jar" com.aluracursos.conversor.Principal
```

## Uso
1. Ejecuta la aplicación
2. Selecciona una opción del menú (1-7)
3. Ingresa el valor que deseas convertir
4. El programa mostrará el resultado de la conversión
5. Selecciona opción 7 para salir

## Ejemplo de Uso
```
*****************************************************
Bienvenido al Conversor de Monedas
*****************************************************

Seleccione una opción de conversión:
1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Salir
Elija una opción válida: 1
Ingrese el valor que desea convertir: 100

El valor 100.00 [USD] corresponde al valor final de =>>> 104500.00 [ARS]
*****************************************************
```

## API Utilizada
- **ExchangeRate-API**: https://v6.exchangerate-api.com/
- Endpoint: `/v6/{API_KEY}/latest/{BASE_CURRENCY}`

## Tecnologías
- Java 11+
- HttpClient (java.net.http)
- Gson 2.10.1 (com.google.gson)

## Autor
Proyecto desarrollado para el Challenge ONE - Oracle Next Education

## Licencia
Este proyecto es de código abierto y está disponible bajo la licencia MIT.
