package utils;

public class ArrayUtils {
    public static int[] ArrayExtending(int[] current, int lengthToAdd){
        int result[] = new int [current.length + lengthToAdd];
        for (int i = 0; i < current.length; i++){
            result[i] = current[i];
        }
        return result;
    }
}
