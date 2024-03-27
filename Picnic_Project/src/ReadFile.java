import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ReadFile {

    // how to create hashmap???

    public HashMap<Integer, String> readTxtFile() throws IOException {
        // get access in txt file
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("input.txt")));
        HashMap<Integer, String> hashMap = new HashMap<>();
        String line = null;
        String[] arr;
        // read txt file from bufferedReader and create string
        while ((line = bufferedReader.readLine()) != null){
            // create array from our string
            arr = line.split(" ");
            // put in our hashmap each word (value), key start in 1 (i + 1)
            for (int i = 0; i < arr.length; i++) {
                hashMap.put(i+1, arr[i]);
            }
//            System.out.println(hashMap);
        }
        bufferedReader.close();
        return hashMap;
    }
}

//"C:\\Users\\Елена\\Documents\\001_GB_Dev\\001_Test_work_on_the_block\\Picnic_Java\\input.txt";
