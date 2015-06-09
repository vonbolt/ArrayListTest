package UserLoginChecker;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InputController {
	public static String username;
	public static String password;
	@SuppressWarnings("unchecked")
	
	public ArrayList InputData(){
	log.debug("Please input [Username] and [password]");
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	username = sc.nextLine();
	password = sc.nextLine();
	
//	log.debug("Data received!");
	System.out.println();
	@SuppressWarnings("rawtypes")
	
	ArrayList arr = new ArrayList();
	arr.add(username);
	arr.add(password);
	
	return arr;
	}
}
