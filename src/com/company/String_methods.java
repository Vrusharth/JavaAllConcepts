package com.company;

public class String_methods {
    public static void main(String[] args) {
        String name="Vrusharth";
        int value=name.length();
        System.out.println(value);
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString="        Pratik  is happy     ";
        String trim=nonTrimmedString.trim();//trims the starting and ending spaces
        System.out.println(nonTrimmedString);
        System.out.println(trim);


        String Sentence="Hello my name is Vrusharth and I am 21 Years old";
        String newString=Sentence.substring(0,9);
        System.out.println(newString);
        String greet = "Hello";
        String newgreet=greet.substring(1,4);//includes starting index excludes ending
        System.out.println(newgreet);
        System.out.println(greet.endsWith("lo"));
        System.out.println(greet.indexOf("l",3));

        //Convert to lower case
        String homework="Maths,  English, Science";
        System.out.println(homework.toLowerCase());
        System.out.println(homework.replace(" ","_"));

        System.out.println(homework.indexOf("  "));

    }
}
