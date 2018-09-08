public class BinaryIterativeSearch implements Practice2Search {

	
	public String searchName() {
		
		return "Binary Iterative" ;
	}

	
	public int search(int[] arr, int target) {
		int min = 0;
		int max = arr.length-1;
		int mid;
		while(min <= max) {
			mid=(min+max)/2;
			if(arr[mid]==target)
				return mid;
			if(arr[mid]>target)
				max=mid-1;
			else
				min =mid+1;
			
		}
		return -1;
	}

	
	public int search() {
		// TODO Auto-generated method stub
		return 0;
	}

}