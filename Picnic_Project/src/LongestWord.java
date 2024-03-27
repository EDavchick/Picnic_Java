import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * * 2. Найти самое длинное слово:
 *  * Создайте программу, которая находит самое длинное слово в файле.
 */
public class LongestWord extends ReadFile {
    protected void findLongestWord(ReadFile file) throws IOException {
        HashMap<Integer, String> hashMap = file.readTxtFile();
        ArrayList<String> values = new ArrayList<>(hashMap.values());

        // sort our arraylist from big to small
        Collections.sort(values, (s1, s2) -> (s2.length() - s1.length()));
        // max - first value
        int max = values.get(0).length();
        for(String value : values){
            // check if length our value == max print in terminal
            if(max == value.length()) {
                System.out.println("Here the longest word in list: " + value);
            }
            else break;
        }
    }
}
