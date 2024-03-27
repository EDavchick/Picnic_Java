import java.io.IOException;

/** Ваш файл `input.txt` содержит множество слов, разделенных пробелами. Это слова-фрукты, овощи и другие продукты.
 * Задания:
 * 1. protected void void countAllWords - подсчет всех слов
 * 2. protected void void findLongestWord - самое длинное слово
 * 3. protected void calculateWordsFrequency(ReadFile file)
 */

public class Program {
    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile();

        CountWords countWords = new CountWords();
        countWords.countAllWords(rf);

        LongestWord longestWord = new LongestWord();
        longestWord.findLongestWord(rf);

        CalculateWords calculateWords = new CalculateWords();
        System.out.println(calculateWords.calculateWordsFrequency(rf));
    }





}