package Regex;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sk.itsovy.data.DataIP;
import sk.itsovy.data.PersonalID;
import sk.itsovy.data.Date;
import sk.itsovy.data.MacAddress;


public class Main {
    public static void findIPAdress(){

            DataIP input = new DataIP();
            List a = input.get();
            System.out.println(a);
            Pattern pattern = Pattern.compile("(25[0][0-5]|2[0-4][0-9]|[1][0-9][0-9]|[1-9][0-9]|[0-9])\\.(25[0][-5]|2[0-4][0-9]|[1][0-9][0-9]|[1-9][0-9]|[0-9])\\.(25[0][-5]|2[0-4][0-9]|[1][0-9][0-9]|[1-9][0-9]|[0-9])\\.(25[0][-5]|2[0-4][0-9]|[1][0-9][0-9]|[1-9][0-9]|[0-9])");
           // Matcher matcher = pattern.matcher("112.89.54.21, 10.0.0.255, 78.14.257.13, 25.-89.154.21, 1.1.1.1, 5.5.89, 7777, 14.2.5.8., 25,78,98,64, 1.87.784.12, autobus, 2.5.50 10, 255.0.127.254, 100.200.249.251, 10.100.1000.1, null, , <.%.£.@,     ,  . . . , 172.246.3.47,   14.25.65.8m,  02.21.003.70, 46.255.255.214   , x5.8.7.9x, 99.67.200.199]");

           for(int i = 0; i< a.size();i++) {
               if (a.get(i) != null) {
                   Matcher matcher = pattern.matcher((CharSequence) a.get(i));
                   while (matcher.find()) {
                       System.out.println("Found: " + matcher.group());

                   }
               }
           }
        System.out.println();

    }
    public static void findBirthID(){
        PersonalID input = new PersonalID();
        List a = input.get();
        System.out.println(a);
        Pattern pattern = Pattern.compile("^[0-9]{2}[0156][0-9]{3}([/\\\\])?[0-9]{4}$");
        //Matcher matcher2 = pattern.matcher("005927/4568, 0868415, 6548/88, 14568,/5456,061936\\8945,999999/0000");

        for(int i = 0; i< a.size();i++) {
            if(a.get(i)!= null) {
                Matcher matcher2 = pattern.matcher((CharSequence) a.get(i));
                while (matcher2.find()) {
                    System.out.println("Found: " + matcher2.group());

                }
            }
        }
        System.out.println();

    }
    public static void findDate(){
        Date input = new Date();
        List a = input.get();
        System.out.println(a);
        Pattern pattern = Pattern.compile("^(([1-9]|[12][0-9]|3[01]\\.(1|3|5|7|8|10|12)\\.)|(([1-9]|[12][0-9]|30)\\.4|6|9|11))|(([1-9]|[12][0-9]\\.2))\\.(20|19)[0-9]{2}$");
        //Matcher matcher2 = pattern.matcher("005927/4568, 0868415, 6548/88, 14568,/5456,061936\\8945,999999/0000");

        for(int i = 0; i< a.size();i++) {
            if(a.get(i)!= null) {
                Matcher matcher2 = pattern.matcher((CharSequence) a.get(i));
                while (matcher2.find()) {
                    System.out.println("Found: " + matcher2.group());

                }
            }
        }
        System.out.println();

    }

    public static void findMacAddress(){
        MacAddress input = new MacAddress();
        List a = input.get();
        System.out.println(a);
        Pattern pattern = Pattern.compile("^[0-9A-F]{2}[:][0-9A-F]{2}[:][0-9A-F]{2}[:][0-9A-F]{2}[:][0-9A-F]{2}[:][0-9A-F]{2}$");
        //Matcher matcher2 = pattern.matcher("005927/4568, 0868415, 6548/88, 14568,/5456,061936\\8945,999999/0000");

        for(int i = 0; i< a.size();i++) {
            if(a.get(i)!= null) {
                Matcher matcher2 = pattern.matcher((CharSequence) a.get(i));
                while (matcher2.find()) {
                    System.out.println("Found: " + matcher2.group());

                }
            }
        }

    }


    public static void main(String[] args) {
        Main.findIPAdress();
        Main.findBirthID();
        Main.findDate();
        Main.findMacAddress();
    }
}
