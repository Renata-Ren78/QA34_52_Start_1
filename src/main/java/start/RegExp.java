package start;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
//  .  -  любой символ a.b  --> asb  aAb

    public static void main(String[] args){
        String str1 = "123a!brgty";
        String str2 = "a b tryeuruj";
        String regExp = "a.b";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str1);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());

        System.out.println("=========================");

        Pattern pattern1 = Pattern.compile("^a.b");
        Matcher matcher1 = pattern1.matcher(str2);
        System.out.println(matcher1.find());

        System.out.println("=========================");

        System.out.println("isDigit -->"+ isDigit("123"));

        System.out.println("=========================");

        System.out.println("isPhoneNumber --> "
                +isPhoneNumber("+972-53-333-33-33")); // true
        System.out.println("isPhoneNumber --> "
                +isPhoneNumber("+972-53-333-333-33")); // false

        System.out.println("================================");

        System.out.println("isEmail --> "
                + isEmail("myemail@gmail.com")); // true
        System.out.println("isEmail --> "
                + isEmail("myema.il@gmail.com")); // true
        System.out.println("isEmail --> "
                + isEmail("myema..il@gmail.com")); // false

        System.out.println("================================");

        System.out.println("isFullname --> "
                + isFullName("Sveta Svetlaya")); // true
        System.out.println("isFullname --> "
                + isFullName(" Sveta Svetlaya")); // false
        System.out.println("isFullname --> "
                + isFullName("SvetA Svetlaya")); // false

    }


    static boolean isDigit(String str){
        Pattern pattern = Pattern.compile("\\d+"); // ljubie cifri
        //Pattern pattern = Pattern.compile("\\d*");
        //Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches(); // matches - polnoe sovpadenie
    }

    // +972-53-333-33-33
    static boolean isPhoneNumber(String str){
        String regExp = "^\\+\\d{3}-\\d{2}-\\d{3}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // myemail@gmail.com
    // myema.il@gmail.com
    static boolean isEmail(String str){
        String regExp = "^\\w+\\.{0,1}\\w*@\\w+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // Sveta Svetlaya
    static boolean isFullName(String str){
        String regExp = "^[A-Z]{1}[a-z]+\\s{1}[A-Z]{1}[a-z]+$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }





}
