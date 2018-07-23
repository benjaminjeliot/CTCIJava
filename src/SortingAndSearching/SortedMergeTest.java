package SortingAndSearching;
import DummyUnit.*;

public class SortedMergeTest {

	public static void MergeEmptyLists() {
		Integer[] list1 = new Integer[] {};
		Integer[] list2 = new Integer[] {};
		Integer[] expecteds = new Integer[] {};
		Integer[] merged = SortedMerge.Merge(list1, list2);
		DummyUnit.assertArrayEquals(expecteds, merged);
	}	

	public static void MergeSingleElementLists() {
		Integer[] list1 = new Integer[] {8};
		Integer[] list2 = new Integer[] {5};
		Integer[] expecteds = new Integer[] {5, 8};
		Integer[] merged = SortedMerge.Merge(list1, list2);
		DummyUnit.assertArrayEquals(expecteds, merged);
	}
	
	public static void MergeIdenticalLists() {
		Integer[] list1 = new Integer[] {1, 2, 3, 4, 5};
		Integer[] list2 = new Integer[] {1, 2, 3, 4, 5};
		Integer[] expecteds = new Integer[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		Integer[] merged = SortedMerge.Merge(list1, list2);
		DummyUnit.assertArrayEquals(expecteds, merged);
	}
	
	public static void MergeInterleavedLists() {
		Integer[] list1 = new Integer[] {1, 3, 5, 7, 9};
		Integer[] list2 = new Integer[] {0, 2, 4, 6, 8};
		Integer[] expecteds = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] merged = SortedMerge.Merge(list1, list2);
		DummyUnit.assertArrayEquals(expecteds, merged);
	}
	
	public static void MergeNegativeNumberLists() {
		Integer[] list1 = new Integer[] {-5, -4, -3, -2, -1, 2, 3};
		Integer[] list2 = new Integer[] {-2, -1, 2, 3, 5, 9};
		Integer[] expecteds = new Integer[] {-5, -4, -3, -2, -2, -1, -1, 2, 2, 3, 3, 5, 9};
		Integer[] merged = SortedMerge.Merge(list1, list2);
		DummyUnit.assertArrayEquals(expecteds, merged);
	}

	public static void SortedMergeTests() {
		System.out.println("RouteBetweenNodesTest");
		MergeEmptyLists();
		MergeSingleElementLists();
		MergeIdenticalLists();
		MergeInterleavedLists();
		MergeNegativeNumberLists();
	}
}

