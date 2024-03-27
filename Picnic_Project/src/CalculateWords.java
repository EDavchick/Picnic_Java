import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *  3. Вычислить частоту слов: Calculate word frequency
 *  * Напишите программу, которая анализирует, сколько раз каждое слово встречается в файле.
 */
public class CalculateWords extends ReadFile {
    protected Map<String, Integer> calculateWordsFrequency(ReadFile file) throws IOException {
        HashMap<Integer, String> hashMap = file.readTxtFile();
        ArrayList<String> values = new ArrayList<>(hashMap.values());
        return values.stream().collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum));
    }
}
