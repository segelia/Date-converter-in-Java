package package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateAnalyser {

    static ArrayList<MyData> scanDates(ArrayList<String> lines) {
        ArrayList<String> patterns = new ArrayList<>();
        patterns.add("(?<day>\\d{2})/(?<month>\\d{1,2}+)/(?<year>\\d{4}) (?<weekday>\\w+)");
        patterns.add("(?<year>\\d{4})-(?<month>\\d{2})-(?<day>\\d{2}) (?<weekday>\\w+)");
        patterns.add("(?<weekday>\\w+) (?<day>\\d{2}).(?<month>\\d{2}).(?<year>\\d{4})");

        ArrayList<Pattern> compiledPatterns = new ArrayList<>();
        compiledPatterns.add(Pattern.compile(patterns.get(0)));
        compiledPatterns.add(Pattern.compile(patterns.get(1)));
        compiledPatterns.add(Pattern.compile(patterns.get(2)));

        ArrayList<MyData> dates = new ArrayList<>();
        HashSet<String> processedDates = new HashSet<>();

        for (String line : lines) {
            for (Pattern cp : compiledPatterns) {
                Matcher matcher = cp.matcher(line);
                if (matcher.matches()) {
                    int tmpDay = Integer.parseInt(matcher.group("day"));
                    int tmpMonth = Integer.parseInt(matcher.group("month"));
                    int tmpYear = Integer.parseInt(matcher.group("year"));
                    String tmpWeekday = matcher.group("weekday");
                    String dateKey = tmpDay + "/" + tmpMonth + "/" + tmpYear + " " + tmpWeekday;
                    if (!processedDates.contains(dateKey)) {
                        dates.add(new MyData(tmpDay, tmpMonth, tmpYear, tmpWeekday));
                        processedDates.add(dateKey);
                    }
                    break;
                }
            }
        }
        return dates;
    }

}
