package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {

    public static ArrayList<String> readFromFile(String inputFile) throws IOException {
        ArrayList<String> dates = new ArrayList<String>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        String date = bufferedReader.readLine();

        while (date != null) {
            dates.add(date);
            date = bufferedReader.readLine();
        }
        bufferedReader.close();
        return dates;
    }

    public static void writeToFile(ArrayList<MyData> data, String output) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        for (MyData item : data) {
            writer.write(item.toString());
            writer.newLine();
        }
        writer.close();
        System.out.println("Data written to " + output);
    }

}
