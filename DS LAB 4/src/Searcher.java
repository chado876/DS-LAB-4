
public class Searcher {

	public int linearSearch(int arr[], int arrSize, int searchVal) {
		int i;
		
		for(i=0;i<arrSize;i++) {
			if(arr[i] == searchVal) {
				return i;
			} 
		}
		return -1;
	}
	
	public int binarySearch(int arr[], int arrSize, int searchVal) {
		Sorter sorter = new Sorter();
		sorter.bubbleSort(arr, arrSize);
		
		int start,end,mid;
		start = 0;
		end = arrSize - 1;
		
		while (start <= end){
			mid = (start + end) / 2;
			if (searchVal == arr[mid]) {
				return mid;
			}
			if (searchVal < arr[mid]) {
				end = mid - 1;
			}
			if (searchVal > arr[mid]) {
				start = mid + 1;
			}
		}
		
		return -1;
	}
}
