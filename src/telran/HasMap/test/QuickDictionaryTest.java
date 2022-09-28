package telran.HasMap.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.HasMap.QuickDictionary;

class QuickDictionaryTest {
	QuickDictionary quickDic = new QuickDictionary();

	@BeforeEach
	void setUp() throws Exception {
		quickDic.put("ABC", "abc1");
		quickDic.put("ADDF", "abc2");
		quickDic.put("AAAAAAAAAAAAAAAAAAAAA", "abc4");

	}

	@Test
	void testPut() {
		assertEquals(quickDic.put("AAAAAAAAAAAAAAAAAAAA", "abc3"), "abc3");
		assertEquals(quickDic.put("AAAAAAAAAAAAAAAAAAAAA", "abc4"), null);
		assertEquals(quickDic.put("AA2", "abc4"), null);
		assertEquals(quickDic.put("dfhj", "abc3"), null);

	}

	@Test
	void testGet() {

		assertEquals(quickDic.get("ADDF"), "abc2");
		assertEquals(quickDic.put("AAAAAAAAAAAAAAAAAAAAA", "abc4"), null);
		assertEquals(quickDic.get("AAAAAAAAAAAAAAAAAAAAA"), null);
	}

}
