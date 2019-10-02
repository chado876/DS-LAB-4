
public class Sorter {
	
	public int bubbleSort(int arr[], int arrSize) {
		int i,temp,cnt2,SwapMade;
		SwapMade = 1;
		i = 0;
		
		while (i < arrSize && SwapMade == 1) {
			SwapMade = 0;
			cnt2 = arrSize - 1;
				while (cnt2 > i) {
					if(arr[cnt2] < arr[cnt2-1]) {
						temp = arr[cnt2-1];
						arr[cnt2 - 1] = arr[cnt2];
						arr[cnt2] = temp;
						SwapMade = 1;						
					}
					cnt2--;
				}
				i++;
		}
		
		return 0;
	}
	
	public int selectionSort(int arr[],int arrSize) {
		int i,indexsmallest,temp,cnt2;
		i = 0;
		
		while (i<arrSize) {
			indexsmallest = i;
			cnt2 = i + 1;
			while (cnt2 < arrSize) {
				if (arr[cnt2] < arr[indexsmallest]){
					indexsmallest = cnt2;
				}
				cnt2++;
			}
			temp = arr[i];
			arr[i] = arr[indexsmallest];
			arr[indexsmallest] = temp;
			i++;
		}
		
		return -1;
	}
	
	public int insertionSort(int arr[], int arrSize) {
	int i, key, j;
	
	for(i = 1; i < arrSize; i++) {
		key = arr[i];
		j = i - 1;
		
		while(j >= 0 && arr[j] > key) {
			arr[j + 1] = arr[j];
			j = j - 1;
		}
		arr[j + 1] = key;
	}
		return -1;
	}
}
