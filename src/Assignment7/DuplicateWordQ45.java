package Assignment7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DuplicateWordQ45 {

    public static void main(String[] args) {

        List<String> duplicates = duplicateWords("test.txt");
        System.out.println(duplicates);
    }

    private static List<String> duplicateWords(String filename){
        List<String> duplicate = new ArrayList<>();
        File file = new File(filename);
        List<String> word = new ArrayList<>();

        try(
                FileReader reader = new FileReader(file);
                BufferedReader bufferreader = new BufferedReader(reader)
                ) {

            String line;
            while ((line = bufferreader.readLine()) != null){
                String[] words = line.strip().split(" ");
                for (String w: words){
                    if(!word.contains(w)) {
                        word.add(w);
                    }
                    else {
                        duplicate.add(w);
                    }
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return duplicate;
    }
}
