package OfficeHours.Practice_03_18_2020;

public class UnaryOperators_Practice {

    public static void main(String[] args) {
        // post: first passes the current value, then increases it by 1
        int a = 20;
        System.out.println(a++); // 20
        System.out.println(a); // 21

        int b = 30;
        int c = b--; // c = 30, b = 29;
        System.out.println(b); // 29
        System.out.println(c); // 30

        int d = 40;
        int e = d++; // e = 40, d = 41
        System.out.println(d);
        System.out.println(c);

        // pre: changes the value immediately
        int x = 200;
        System.out.println(--x);

        int z = 100;
        z = z++ + --z - z-- + ++z;
     // z = 101 + 100 - 99  + 100
     // z = 100 + 100 - 100 + 100
        System.out.println(z);

        int u = 900;
        int r = - ++u + ++u + u++;
        //  r = -901 + 902 + -902
        //  r = 1 + -902
        //  r = 1 - 902 ==> -901
        System.out.println(r);
        System.out.println(u);


    }

}
