public class HelloWorldApp {
    public static void main(String[] args) {
        // Retrieve execution count
        int exeCount = ExecutionCounter.readExecutionCount();
        exeCount++;
        ExecutionCounter.saveExecutionCount(exeCount);

        // initialize message
        String message = "Hello World! " + exeCount;

        // Print message to the console
        System.out.println(message);

        // Create and display the UI
        new HelloWorldUI(message);
    }
}
