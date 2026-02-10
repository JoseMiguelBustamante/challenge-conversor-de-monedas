# Instalación de la Biblioteca Gson

Para que el proyecto funcione correctamente, necesitas descargar la biblioteca Gson.

## Opción 1: Descarga Manual

1. Visita: https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar
2. Descarga el archivo `gson-2.10.1.jar`
3. Coloca el archivo en la carpeta `lib/` del proyecto

## Opción 2: Usando wget (Linux/Mac)

```bash
mkdir -p lib
cd lib
wget https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar
cd ..
```

## Opción 3: Usando curl (Linux/Mac/Windows)

```bash
mkdir -p lib
curl -o lib/gson-2.10.1.jar https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar
```

## Verificación

Una vez descargado, verifica que el archivo esté en:
```
conversor-monedas/
└── lib/
    └── gson-2.10.1.jar
```

Ahora puedes compilar y ejecutar el proyecto siguiendo las instrucciones del README.md
