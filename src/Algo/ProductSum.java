package Algo;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {

    public static int productSum(List<Object> array) {

        return productHelper(array, 1);
    }

    private static int productHelper(List<Object> array, int depth) {
        int sum = 0;
        for (Object element : array) {
            if (element instanceof ArrayList) {
                @SuppressWarnings("unchecked")
                ArrayList<Object> list = (ArrayList<Object>) element;
                sum += productHelper(list, depth + 1);
            } else {
                sum += (int) element;
            }
        }
        return sum * depth;
    }
}