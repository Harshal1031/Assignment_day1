package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {0,0,1,0,0,1,1,0};
        System.out.println(Arrays.toString(arr));
      int mid=  arr.length/2;
//        for(int i=0;i<arr.length/2;i++) {
//        	int temp=arr[i];
//        	arr[i]=arr[i+mid];
//        	arr[i+mid]=temp;
//        }
//        System.out.println(Arrays.toString(arr));
        List<Integer>li=new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++) {
        	li.add(arr[i]);
        }
        System.out.println(li);
        for(int i=0;i<li.size()/2;i++) {
        	Integer temp1 = li.get(i);
            li.set(i, li.get(mid+i));

            li.set(i+mid, temp1);
            
        }
        System.out.println(li);
	}

}
