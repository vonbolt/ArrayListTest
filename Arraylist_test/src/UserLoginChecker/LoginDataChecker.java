package UserLoginChecker;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginDataChecker {
	public void LoginDatachecker(boolean ir){
		if(ir == true)
			log.debug("Login Success!");
		else 
			log.debug("Login Failed!");
	}
}
