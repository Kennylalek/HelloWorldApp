import java.io.*;

public class ExecutionCounter {
    private static final String PATH = "count.txt";

    public static int readExecutionCount() {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            return Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            return 0; // Default to 0
        }
    }

    public static void saveExecutionCount(int count) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))) {
            writer.write(String.valueOf(count));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
