cd "$(dirname "$0")"

cd src

echo "Compiling Java files..."
javac *.java

if [ $? -ne 0 ]; then
    echo "Compilation failed. Check your code for errors."
    exit 1
fi

echo "Running the application..."
java HelloWorldApp

read -p "Press Enter to exit..."
