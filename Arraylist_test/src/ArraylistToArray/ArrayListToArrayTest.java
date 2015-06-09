package ArraylistToArray;

import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArrayListToArrayTest {
	
	public static void main(String[] args) {
		ArrayList<Integer> arraylistOne = new ArrayList<Integer>();
		arraylistOne.add(1);
		arraylistOne.add(2);
		arraylistOne.add(3);
		Integer[] array = arraylistOne.toArray(new Integer[0]);
		log.debug("inputed number is {}",array[0]);
		log.debug("inputed number is {}",array[1]);
		}
}
