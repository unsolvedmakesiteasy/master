class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
      int retval = 0;
		for (int i = 0; i < n; i++) {
			if (n == 1) {
				return i;
			} else if (i != 0 && i != n - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				retval = i;
				break;
			} else if (i == 0 && arr[i] > arr[i + 1]) {
				retval = i;
				break;
			} else if (i == n - 1 && arr[i] > arr[i - 1]) {
				retval = i;
				break;
			}
		}
		return retval;
    }
}
