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
}
