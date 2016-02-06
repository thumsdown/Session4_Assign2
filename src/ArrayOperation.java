import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayOperation {
public static void main(String[] args) {
	int pos = 0;
	int num = 0;
	Scanner sc = new Scanner(System.in);
	Integer []arr = new Integer[5];
	
	for(int i = 0; i < 5; i++)
	{
		System.out.println("Enter"+(i+1)+ " integer");
		arr[i] = sc.nextInt();
	}
	
	for(Integer i : arr)
		System.out.println(i);
	Arrays.sort(arr);
	for(Integer i : arr)
		System.out.println(i);
	
	ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
	
	System.out.println("Enter position to insert");
	pos = sc.nextInt();
	System.out.println("Enter Number to insert");
	num = sc.nextInt();
	if ( pos > 0 && pos <= arr.length )
		arrList.add(pos, num);
	else
		System.out.println("Invalid entry");
	
	for(Integer i : arrList)
	{
		System.out.println(i);
	}
	
}

}
