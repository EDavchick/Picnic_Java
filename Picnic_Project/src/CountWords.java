import java.io.IOException;
import java.util.HashMap;

/**
 * * 1. Осуществить подсчет слов:
 *  * Напишите программу, которая подсчитывает количество слов в файле `input.txt`.
 */

public class CountWords extends ReadFile {
    protected void countAllWords(ReadFile file) throws IOException {
        HashMap<Integer, String> hashMap = file.readTxtFile();
        System.out.println("Number of words: " + hashMap.size());
    }
}
