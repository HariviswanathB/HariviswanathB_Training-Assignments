package Assignment45;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidation {

	public static void main(String[] args) {
		String phone1 = "001-765-989-3421";
        String phone2 = "+1-456-765-9345";

        String regex = "^(001|\\+1)-\\d{3}-\\d{3}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);


        Matcher m1 = pattern.matcher(phone1);
        if (m1.matches())
            System.out.println(phone1 + " -> Valid Phone Number");
        else
            System.out.println(phone1 + " -> Invalid Phone Number");


        Matcher m2 = pattern.matcher(phone2);
        if (m2.matches())
            System.out.println(phone2 + " -> Valid Phone Number");
        else
            System.out.println(phone2 + " -> Invalid Phone Number");

	}

}
