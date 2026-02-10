#!/bin/bash

echo "Compilando Conversor de Monedas..."

mkdir -p bin
mkdir -p lib

echo ""
echo "Verificando biblioteca Gson..."
if [ ! -f "lib/gson-2.10.1.jar" ]; then
    echo "ERROR: No se encuentra gson-2.10.1.jar en la carpeta lib/"
    echo "Por favor descargue Gson desde:"
    echo "https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar"
    echo "Y colóquelo en la carpeta lib/"
    exit 1
fi

echo "Compilando archivos Java..."
javac -cp "lib/gson-2.10.1.jar" -d bin src/com/aluracursos/conversor/*.java

if [ $? -eq 0 ]; then
    echo ""
    echo "¡Compilación exitosa!"
    echo ""
    echo "Para ejecutar el programa use:"
    echo "java -cp \"bin:lib/gson-2.10.1.jar\" com.aluracursos.conversor.Principal"
    echo ""
    echo "O ejecute: ./run.sh"
else
    echo ""
    echo "Error en la compilación"
    exit 1
fi
