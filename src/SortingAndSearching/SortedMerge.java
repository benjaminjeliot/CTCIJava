package SortingAndSearching;

public class SortedMerge
{
	public static Integer[] Merge(Integer[] list1, Integer[] list2) {
		Integer[] merged = new Integer[list1.length + list2.length];
		int left = 0;
		int right = 0;
		int index = 0;
		while ((left < list1.length) && (right < list2.length)) {
			if (list1[left] < list2[right]) {
				merged[index] = list1[left];
				++left;
			} else {
				merged[index] = list2[right];
				++right;
			}
			++index;
		}
		System.arraycopy(list1, left, merged, index, list1.length - left);
		System.arraycopy(list2, right, merged, index, list2.length - right);
		return merged;
	}
}
