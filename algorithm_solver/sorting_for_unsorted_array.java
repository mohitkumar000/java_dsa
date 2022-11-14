package algorithm_solver;

public class sorting_for_unsorted_array {
	
	public int unsorted_array(int [] arr ,int key)
	{
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
	}

}
