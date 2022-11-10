import java.util.Random;

public class QuickSorting {

	public static void main(String[] args) {
int[] arr= {10,7,3,1,9};
sorting(arr, 0, arr.length-1);
for(int a : arr) {
	System.out.print(a+" ");
}
System.out.println();
}
	
	public static void sorting(int[] arr,int firstIndex,int lastIndex ) {
		if(firstIndex>lastIndex) {
			return;
		}
		int pivot=arr[lastIndex];
		int leftpointer=firstIndex;
		int rightpointer=lastIndex;
		while(leftpointer<rightpointer) {
			while(arr[leftpointer]<=pivot && leftpointer<rightpointer) {
				leftpointer++;
			}
			while(arr[rightpointer]>=pivot && leftpointer<rightpointer) {
				rightpointer--;
			}
			swap(arr,leftpointer,rightpointer);
		
		}
		swap(arr,leftpointer,lastIndex);
	   sorting(arr,firstIndex,leftpointer-1);
	   sorting(arr,leftpointer+1,lastIndex);
	}
	public static void swap(int[] arr,int idx1,int idx2) {
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
	}

}
