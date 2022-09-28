package telran.HasMap;

import java.util.HashMap;
import java.util.regex.Pattern;

public class QuickDictionary {
	public HashMap<String, String> hashMap = new HashMap<String, String>();

	public String put(String key, String value) {
		boolean keyTest = Pattern.matches("[A-Z]{1,20}", key);
		if (keyTest) {
			hashMap.put(key, value);
			return value;
		}

		String res = null;
		return res;
	}

	public String get(String key) {

		return hashMap.get(key);
	}

}
