package words.task.runner;

import words.task.utils.FileWorker;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        FileWorker fileHelper = new FileWorker();
        fileHelper.validator("D:\\text.txt", map);

        System.out.println(map);
    }
}
