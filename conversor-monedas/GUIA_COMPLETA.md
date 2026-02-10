# Guía Completa - Conversor de Monedas

## 📋 Pasos para Ejecutar el Proyecto

### Paso 1: Descargar Gson
Antes de compilar, descarga la biblioteca Gson:

**Enlace directo:** https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar

Guarda el archivo en la carpeta `lib/` del proyecto.

### Paso 2: Compilar

**En Windows:**
```bash
compile.bat
```

**En Linux/Mac:**
```bash
chmod +x compile.sh
./compile.sh
```

**Manual:**
```bash
# Windows
javac -cp "lib/gson-2.10.1.jar" -d bin src/com/aluracursos/conversor/*.java

# Linux/Mac
javac -cp "lib/gson-2.10.1.jar" -d bin src/com/aluracursos/conversor/*.java
```

### Paso 3: Ejecutar

**En Windows:**
```bash
run.bat
```

**En Linux/Mac:**
```bash
chmod +x run.sh
./run.sh
```

**Manual:**
```bash
# Windows
java -cp "bin;lib/gson-2.10.1.jar" com.aluracursos.conversor.Principal

# Linux/Mac
java -cp "bin:lib/gson-2.10.1.jar" com.aluracursos.conversor.Principal
```

## 🎯 Funcionalidades Implementadas

✅ **Conversión en tiempo real** usando ExchangeRate-API
✅ **6 opciones de conversión** entre USD, ARS, BRL y COP
✅ **Interfaz intuitiva** de consola con menú numérico
✅ **Validación de datos** de entrada
✅ **Manejo de errores** robusto
✅ **Uso de API externa** con HttpClient
✅ **Formato de salida** claro y profesional

## 💡 Características Técnicas

- **Java 11+**: Uso de HttpClient moderno
- **Gson**: Procesamiento eficiente de JSON
- **POO**: Separación de responsabilidades en clases
- **Clean Code**: Código legible y mantenible
- **Sin dependencias pesadas**: Solo Gson como externa

## 🔄 Flujo de la Aplicación

1. Usuario selecciona tipo de conversión (1-6)
2. Usuario ingresa cantidad a convertir
3. Aplicación consulta API para tasas actuales
4. Aplicación calcula y muestra resultado
5. Usuario puede realizar otra conversión o salir

## 📊 Ejemplo de Ejecución

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
Elija una opción válida: 3
Ingrese el valor que desea convertir: 50

El valor 50.00 [USD] corresponde al valor final de =>>> 290.50 [BRL]
*****************************************************
```

## 🛠️ Solución de Problemas

### Error: "No se encuentra gson"
- Verifica que `gson-2.10.1.jar` esté en la carpeta `lib/`
- Descarga desde el enlace proporcionado

### Error: "No se pudo conectar a la API"
- Verifica tu conexión a internet
- La API podría estar temporalmente no disponible

### Error de compilación
- Verifica que tienes Java 11 o superior: `java -version`
- Asegúrate de estar en el directorio raíz del proyecto

## 📝 Estructura de Clases

```
Principal.java
├── Muestra menú interactivo
├── Captura entrada del usuario
└── Coordina conversiones

ConversorMoneda.java
├── Construye URL de la API
├── Coordina obtención de tasas
└── Realiza cálculo de conversión

ConsultaAPI.java
├── Realiza petición HTTP
├── Maneja respuesta de la API
└── Retorna datos en formato JSON
```

## 🌐 API Utilizada

**ExchangeRate-API**
- Base URL: `https://v6.exchangerate-api.com/v6/`
- Endpoint: `/latest/{CURRENCY}`
- Tasas actualizadas diariamente
- Respuesta en formato JSON

## 📦 Archivos del Proyecto

```
conversor-monedas/
├── src/com/aluracursos/conversor/
│   ├── Principal.java           # Clase principal
│   ├── ConversorMoneda.java     # Lógica de conversión
│   └── ConsultaAPI.java         # Consulta HTTP
├── lib/
│   └── gson-2.10.1.jar          # Biblioteca (descargar)
├── compile.bat / compile.sh     # Scripts de compilación
├── run.bat / run.sh             # Scripts de ejecución
├── README.md                    # Documentación principal
├── INSTALACION_GSON.md          # Guía de instalación
└── GUIA_COMPLETA.md            # Este archivo
```

## ✨ Cumplimiento de Requisitos

✅ Conversor de monedas funcional
✅ Uso de API externa (ExchangeRate-API)
✅ Interacción por consola
✅ Múltiples opciones de conversión
✅ Código organizado en paquetes
✅ Manejo de excepciones
✅ README con instrucciones claras
✅ Scripts de compilación y ejecución

---

**¡Proyecto listo para el Challenge ONE - Oracle Next Education!**
