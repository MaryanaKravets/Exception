package main.java.outofmemoryexc;

public class OutOfMemEx {
    public static void main(String[] args) {
        Integer[] arrays = new Integer[Integer.MAX_VALUE];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i;
            System.out.println(arrays[i]);
        }
    }
}
