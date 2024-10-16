#!/bin/bash

# Change to the directory containing this script
cd "$(dirname "$0")"

# Navigate to the folder with Java files
cd src

# Compile all Java files
echo "Compiling Java files..."
javac *.java

# Check if compilation was successful
if [ $? -ne 0 ]; then
    echo "Compilation failed. Check your code for errors."
    exit 1
fi

# Run the main class
echo "Running the application..."
java HelloWorldApp

# Keep the terminal open if needed
read -p "Press Enter to exit..."
