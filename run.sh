#!/bin/bash

echo "========================================"
echo " Gamified Learning Platform - Setup"
echo "========================================"
echo ""

echo "Compiling Java files..."
javac *.java

if [ $? -ne 0 ]; then
    echo ""
    echo "ERROR: Compilation failed!"
    echo "Please make sure Java JDK is installed."
    echo ""
    exit 1
fi

echo "Compilation successful!"
echo ""
echo "Starting the game..."
echo ""

java GameEngine
