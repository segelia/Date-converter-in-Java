package package1;

import java.io.IOException;
import java.util.ArrayList;

public class FinalDateConverter {

    public static int convertDate(String inputFile, String outputFile) throws IOException {
        ArrayList<String> dates = FileHandler.readFromFile(inputFile);
        ArrayList<MyData> convertedDates = DateAnalyser.scanDates(dates);
        FileHandler.writeToFile(convertedDates, outputFile);
        return convertedDates.size();
    }
    
}
