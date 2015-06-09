package UserLoginChecker;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainMethod {
	public static boolean isright = false;
	@SuppressWarnings("rawtypes")
	public static ArrayList array = new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("It runs!");
		
		InputController ic = new InputController();
		array = ic.InputData();
		
		LoginHandler lh = new LoginHandler();
	    isright = lh.checkLogin(array);
		
		LoginDataChecker ldc = new LoginDataChecker();
		ldc.LoginDatachecker(isright);
	}

}
