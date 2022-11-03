package packageone;
import java.util.regex.*;
import java.util.regex.Pattern;

public class PasswordValidator {
	public static boolean isValidPassword(String password) {
		String regex="^(?=.*[0-9])" + "(?=.*[a-z]) (?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		Pattern p=Pattern.compile(regex);
		if(password==null) {
			return false;
		}
		Matcher m=p.matcher(password);
		return m.matches();
	}
	public static void main(String args[]) {
		String username="Alexa coded123";
		System.out.println(isValidPassword(username));
		
	}

}
