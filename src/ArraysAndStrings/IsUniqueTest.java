package ArraysAndStrings;

public class IsUniqueTest
{
	public static void IsUniqueSortTest() {
		DummyUnit.DummyUnit.assertEquals(false, IsUnique.IsUniqueSort("aaaa"));
		DummyUnit.DummyUnit.assertEquals(false, IsUnique.IsUniqueSort("aaab"));
		DummyUnit.DummyUnit.assertEquals(false, IsUnique.IsUniqueSort("abcc"));
		DummyUnit.DummyUnit.assertEquals(true, IsUnique.IsUniqueSort("a"));
		DummyUnit.DummyUnit.assertEquals(true, IsUnique.IsUniqueSort("a"));
		DummyUnit.DummyUnit.assertEquals(true, IsUnique.IsUniqueSort("ab"));
		DummyUnit.DummyUnit.assertEquals(false, IsUnique.IsUniqueSort("abca"));
	}

	public static void IsUniqueHashMapTest() {
		DummyUnit.DummyUnit.assertEquals(false, IsUnique.IsUniqueHashMap("aaaa"));
		DummyUnit.DummyUnit.assertEquals(false, IsUnique.IsUniqueHashMap("aaab"));
		DummyUnit.DummyUnit.assertEquals(false, IsUnique.IsUniqueHashMap("abcc"));
		DummyUnit.DummyUnit.assertEquals(true, IsUnique.IsUniqueHashMap("a"));
		DummyUnit.DummyUnit.assertEquals(true, IsUnique.IsUniqueHashMap("a"));
		DummyUnit.DummyUnit.assertEquals(true, IsUnique.IsUniqueHashMap("ab"));
		DummyUnit.DummyUnit.assertEquals(false, IsUnique.IsUniqueHashMap("abca"));
	}

	public static void IsUniqueTests() {
		System.out.println("IsUniqueTest");
		IsUniqueSortTest();
		IsUniqueHashMapTest();
	}
}
