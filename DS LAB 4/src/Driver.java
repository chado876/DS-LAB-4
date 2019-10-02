import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		
		//prompt for array input
		int i;
		int array[];
		array = new int[5];
		
		for(i=0;i<5;i++) {
		int [] arrays;
		arrays = new int[5];
		
		String n = JOptionPane.showInputDialog("Enter a number: ");
		int num = Integer.parseInt(n);
		arrays[i] = num;
		
		array[i] = arrays[i];
		}
		
		//print array to screen
		for(i=0;i<5;i++) {
			System.out.println(array[i]);
		}
		
		
		int res,res2;
		do {
			
			String ques = JOptionPane.showInputDialog("Which type of operation would you like to perform?: (1) Linear Search "
					+ "(2) Binary Search (3) Bubble Sort (4) Selection Sort (5) Insertion Sort");
			 res = Integer.parseInt(ques);
			
			//Linear search
			if(res == 1) {
				Searcher searcher = new Searcher();
				String sv = JOptionPane.showInputDialog("Enter a search value: ");
				int searchval = Integer.parseInt(sv);
				
				int value = searcher.linearSearch(array, array.length,searchval);
				System.out.println("Value was found at array position: " + value);			
			}
			
			//Binary Search
			if(res == 2) {
				Searcher searcher = new Searcher();
				String sv = JOptionPane.showInputDialog("Enter a search value: ");
				int searchval = Integer.parseInt(sv);
				
				int value = searcher.binarySearch(array, array.length, searchval);
				System.out.println("Value was found at array position: " + value);		
			}
			
			//Bubble sort
			if(res == 3) {
				Sorter sorter = new Sorter();
				sorter.bubbleSort(array, array.length);
				
				for(i=0;i<5;i++) {
					System.out.println(array[i]);
				}
				
			}
			
			//Selection sort
			if(res== 4) {
				Sorter sorter = new Sorter();
				sorter.selectionSort(array, array.length);
				
				for(i=0;i<5;i++) {
					System.out.println(array[i]);
				}
			}
			
			//Insertion sort
			if(res == 5) {
				Sorter sorter = new Sorter();
				sorter.insertionSort(array, array.length);
				
				for(i=0;i<5;i++) {
					System.out.println(array[i]);
				}
			}
			
			//Big O
			if (res == 6) {
				
				
				System.out.println("The Big O of the operation is: 15 n + 30 = n (linear time) ");
			}
			
			String ques2 = JOptionPane.showInputDialog("Would you like to perform another operation? 1 for yes, 2 for no: ");
			  res2 = Integer.parseInt(ques2);
			
			
		} while (res > 0 && res <7 && res2 == 1);

	}

}
