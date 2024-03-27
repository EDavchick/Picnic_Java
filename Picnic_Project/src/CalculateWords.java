import java.io.IOException;
import java.util.HashMap;

/**
 *  3. Вычислить частоту слов: Calculate word frequency
 *  * Напишите программу, которая анализирует, сколько раз каждое слово встречается в файле.
 *  * Подумайте об этом как о подсчете того, какие фрукты и овощи самые популярные на вашем пикнике!
 */
public class CalculateWords extends ReadFile {
    protected void calculateWordsFrequency(ReadFile file) throws IOException {
        HashMap<Integer, String> hashMap = file.readTxtFile();
    }
}
