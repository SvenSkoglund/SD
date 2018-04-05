package problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutation {

	public static void main(String[] args) {
		StringPermutation sp = new StringPermutation();
		System.out.println(sp.checkForPermutation("Sven", "Sven"));
	}

	public boolean checkForPermutation(String s1, String s2) {
		boolean result = false;
		if (s1 == null || s2 == null) {
			return result;
		}
		if (s1.length() != s2.length()) {
			return result;
		}

		List <Character> l1 = new ArrayList<>();
		List <Character>l2 = new ArrayList<>();
		for ( int j = 0 ; j < s1.length() ; j++) {
			l1.add(s1.toCharArray()[j]);
			l2.add(s2.toCharArray()[j]);
		}
		l1.sort(null);
		l2.sort(null);
		
		for ( int i = 0 ; i < l1.size() ; i++) {
			if (l1.get(i).equals(l2.get(i)) ) {
				result = true;
			}else {
				result = false;
				break;
			}
		}
		
		return result;

	}
}
