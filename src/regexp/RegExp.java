
package regexp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    public static void main(String[] args) {
        String password ="Adel2020";
        String pattern ="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{5,10}";
        System.out.println(password.matches(pattern));
        System.out.println("--------------------------------");
        ArrayList<String> mail =new ArrayList<String>();
        mail.add("Adelpk@gmail.com");
        mail.add("Ahmed2018@yahoo.com");
        mail.add("Gcrazy33#gmail.com");
        mail.add("RahZak@gmail.com");
        //String pattern2="^(.+)@(.+)$";
        String pattern2="^[\\W#$%&'*+/=?ّ{|}~^-]+(?:\\.[W!#$%&ّ*+/=?ّ{|}~^-]+)*@(?:[a-zA-z0-9-]+\\.)[a-zA-Z]{2,6}$";
        Pattern patt= Pattern.compile(pattern2);
        for (String string : mail) {
            Matcher matcher=patt.matcher(string);
            System.out.println("Email : "+string +" "+matcher.matches());
        }
        
    }
    
}
