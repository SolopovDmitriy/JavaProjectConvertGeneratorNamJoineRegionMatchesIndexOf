package regExp;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = "The String class represents character strings. "
                + "All string literals in Java programs, such as \"abc\", "
                + "are implemented as instances of this class. "+
                "HTTPS://DOCS.ORACLE.COM/JAVASE/8/DOCS/API/JAVA/LANG/STRING.HTML          "
                + "Read more about class String at the Oracle website... "
                + "HTTPS://DOCS.ORACLE.COM/EN/JAVA/INDEX.HTML" +
                " zdfgzdrg xdfgdg   HTTPS://DOCS.HTML   dzrgrdz g ";



//        int start = 0;
//        int end = 0;
//        while(true) {
//            start = str.indexOf("HTTP",end);
//            if(start==-1){
//                break;
//            }
//            end = str.indexOf("HTML", start);
//            if(end==-1){
//                break;
//            }
//            System.out.println(start + " - " + end);
//            String site1 = str.substring(start, end+4);
//            System.out.println(site1.toLowerCase(Locale.ROOT));
//        }

        // ================================================


            String substr = "String";
            final boolean ignoreCase = false; // точное совпадение, true - игнорирует разные регистры символов
            int substrLength = substr.length(); // 6
            int strLength = str.length();
            for(int i = 0; i < strLength - substrLength + 1; i++) {
                if(str.regionMatches(ignoreCase, i, substr, 0, substrLength))  {
                    System.out.println(i);
                }
            }


        //                 01234567890123
//            String text = "table hello world";
//        System.out.println(text.regionMatches(true, 6, "sun hello ok", 4, 5));





    }
}
