package com.javadsa;

public class StringComparition {
    public static void main(String[] args) {
        // String are created in a pool on heap memory

        String aa = "Deepak";
        String bb = "Deepak";
        System.out.println(aa == bb);

        // String are created outside the pool in the heap memory
        String a = new String("Deepak");
        String b = new String("Deepak");
        System.out.println(a == b);

        //using comparision methods , it only compares the value doesnt compare the Refrece
        String aaaa = new String("Deepak");
        String bbbb = new String("Deepak");
        System.out.println(aaaa.equals(bbbb));

        //Here we just added some blank space and it will give us  false
        //(using comparision methods , it only compares the value doesnt compare the Refrece)
        String name = new String("Deepak");
        String name2 = new String("Deepak    ");
        System.out.println(name.equals(name2));

    }
}
