
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {100,1000,10000,100,100,1000};
int arr2[]= {100,1000,10000};
int count=0;
for(int i=0;i<arr2.length;i++) {
	for(int j=0;j<arr1.length;j++) {
		if(arr1[i]==arr2[j]) {
			count++;
			break;
		}
	}
}
if(count==arr2.length) {
	System.out.println("arr2 is subset of arr1");
}else {
	System.out.println("arr2 is not subset of arr1");
}
	}

}
