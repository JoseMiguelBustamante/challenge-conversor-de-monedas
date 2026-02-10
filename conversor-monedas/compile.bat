@echo off
echo Compilando Conversor de Monedas...

if not exist bin mkdir bin
if not exist lib mkdir lib

echo.
echo Verificando biblioteca Gson...
if not exist lib\gson-2.10.1.jar (
    echo ERROR: No se encuentra gson-2.10.1.jar en la carpeta lib/
    echo Por favor descargue Gson desde:
    echo https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar
    echo Y coloquelo en la carpeta lib/
    pause
    exit /b 1
)

echo Compilando archivos Java...
javac -cp "lib/gson-2.10.1.jar" -d bin src/com/aluracursos/conversor/*.java

if %errorlevel% equ 0 (
    echo.
    echo Compilacion exitosa!
    echo.
    echo Para ejecutar el programa use:
    echo java -cp "bin;lib/gson-2.10.1.jar" com.aluracursos.conversor.Principal
    echo.
    echo O ejecute run.bat
) else (
    echo.
    echo Error en la compilacion
)

pause
