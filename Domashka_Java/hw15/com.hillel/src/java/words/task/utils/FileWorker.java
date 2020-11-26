package words.task.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class FileWorker {
    public String readFile(String path) {
        String result = null;
        try (FileInputStream fis = new FileInputStream(new File(path))) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            result = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void validator(String path, Map<String, Integer> map) {
        String[] sentences;
        String str = readFile(path);
        sentences = str.split("\\.");

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");

            for (String word : words) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
    }
}
