import java.io.IOException;

/** Задание 2
 * Ваш файл `input.txt` содержит множество слов, разделенных пробелами.
 * Это слова-фрукты, овощи и другие продукты.
 * Задания:
 * 1. public static void countAllWords - подсчет всех слов
 * 2. public static void findLongestWord - самое длинное слово
 * 3. Вычислить частоту слов: Calculate word frequency
 * Напишите программу, которая анализирует, сколько раз каждое слово встречается в файле.
 * Подумайте об этом как о подсчете того, какие фрукты и овощи самые популярные на вашем пикнике!
 */

public class Program {
    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile();
//        rf.readTxtFile();
        CountWords countWords = new CountWords();
        countWords.countAllWords(rf);
    }





}