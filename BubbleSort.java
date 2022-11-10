
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,4,23,60,47};
int temp;
for(int i=0;i<arr.length;i++) {
	for(int j=1;j<arr.length-i;j++) {
		if(arr[j-1]>arr[j]) {
			temp=arr[j-1];
			arr[j-1]=arr[j];
			arr[j]=temp;
		}
	}
}
for(int a : arr) {
	System.out.println(a);
}
	}

}
