package ru.job4j.array;

/**
 * Wrapper class for String.
 */
public class ArrayChar {
    private char[] data;

    /**
     * Javadoc comment.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Check if the string starts with the prefix
     * @param prefix - the prefix to check for
     * @return true if the string starts with the prefix, false in the other case
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();

        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != this.data[i]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
