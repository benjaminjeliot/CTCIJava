package DummyUnit;

public class DummyUnit
{
	public static void assertEquals(String baseline, String test) {
		if (baseline.equals(test)) {
			System.out.println("TEST PASSED!");
		} else {
			System.out.println("TEST FAILED!");
			System.out.println(baseline + " does not equal " + test);
		}
	}

	public static <T> void assertEquals(T baseline, T test) {
		if (baseline.equals(test)) {
			System.out.println("TEST PASSED!");
		} else {
			System.out.println("TEST FAILED!");
			System.out.println(baseline + " does not equal " + test);
		}
	}
	
	public static <T> void assertArrayEquals(T[] expecteds, T[] actuals) {
		if (expecteds.length != actuals.length) {
			System.out.println("TEST FAILED!");
			System.out.println("Arrays are not the same length");
		}
		for(int i = 0; i < expecteds.length; ++i) {
			if (!expecteds[i].equals(actuals[i])) {
				System.out.println("TEST FAILED!");
				System.out.println("expecteds[i] does not equal actuals[i]");
				System.out.println("expecteds[" + i + "] = " + expecteds[i]);
				System.out.println("actuals[" + i + "] = " + actuals[i]);
				return;
			}
		}
		System.out.println("TEST PASSED!");
	}
}
