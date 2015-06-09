package UserLoginChecker;

import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;
@Slf4j

public class LoginHandler {
	
	@SuppressWarnings({ "rawtypes", "unchecked"})
	
	public boolean checkLogin(ArrayList array){		
		String[] arr = (String[]) array.toArray(new String[0]);
		
//		log.debug("inputed number is {}",arr[0]);
//		log.debug("inputed number is {}",arr[1]);	
		
		if (arr[0].equals("vonbolt") && arr[1].equals("19900912"))
			return true;	
		else
			return false;
	}
}
