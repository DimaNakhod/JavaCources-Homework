package ArrayUtils;

import java.util.Arrays;

public class ArrayUtils {
    public static <T> T[] extendArrayWithNewItem(T itemToAdd, T[] existingItemsArray) {
        int previousArrayLength = existingItemsArray.length;
        T[] extendedItemsArray = Arrays.copyOf(existingItemsArray, existingItemsArray.length + 1);
        extendedItemsArray[previousArrayLength] = itemToAdd;
        return extendedItemsArray;
    }
}
