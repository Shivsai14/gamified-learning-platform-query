@echo off
echo ========================================
echo  Gamified Learning Platform - Setup
echo ========================================
echo.

echo Compiling Java files...
javac *.java

if errorlevel 1 (
    echo.
    echo ERROR: Compilation failed!
    echo Please make sure Java JDK is installed.
    echo.
    pause
    exit /b 1
)

echo Compilation successful!
echo.
echo Starting the game...
echo.

java GameEngine

pause
