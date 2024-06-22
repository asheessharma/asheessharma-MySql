import java.util.*;
class Solution {
    public int compress(char[] chars) {
          int n = chars.length;
        if (n == 0) return 0;

        int write = 0; // Index to write the result
        int anchor = 0; // Start of the group of characters

        for (int read = 0; read < n; read++) {
            // If we reached the end of the array or the current character is different from the next one
            if (read + 1 == n || chars[read] != chars[read + 1]) {
                chars[write++] = chars[anchor]; // Write the character

                // If the group length is more than 1, write the length
                if (read > anchor) {
                    int length = read - anchor + 1;
                    for (char c : Integer.toString(length).toCharArray()) {
                        chars[write++] = c;
                    }
                }

                // Move the anchor to the next group of characters
                anchor = read + 1;
            }
        }

        return write;
    }
}