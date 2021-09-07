package com.javadsa;

public class StringBuilderss {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = ((char)('a' + i));
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
// Difference between string and string builder is that string is immutable and every time we are making changes
// it is creating a new object and after the end of the loop the last appended object was used as reference so memory
// is waisted because many obj was left without reference this is why we use string builder so that memory is safe and
// we can change the same string.