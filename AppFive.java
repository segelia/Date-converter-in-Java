import java.io.IOException;

import package1.FinalDateConverter;

public class AppFive {
    
    public static void main(String[] args) {
        String inputFile = "/Users/juliasiger/Desktop/task_5_dates/InputData.txt";
        String outputFile = "/Users/juliasiger/Desktop/task_5_dates/MyData.txt";
        try{
            int convertedDates = FinalDateConverter.convertDate(inputFile, outputFile);
            System.out.println("Number of written dates: " + convertedDates);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
