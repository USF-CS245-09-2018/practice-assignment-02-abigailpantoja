public class LinearSearch implements Practice2Search {

	//@Override
	public String searchName() {
		
		return "Linear Search";
	}

	//@Override
	public int search(int[] arr, int target) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==(target))
				return i;
		}
		return -1;
	}

	//@Override
	public int search() {
		// TODO Auto-generated method stub
		return 0;
	}

}