package arrays;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		/*int sum=0;
		int arr[]=new int[] {10,20,30,40,50,60,70,80,90};
		for(int x=0;x<arr.length;x++) {
			
			if(x%2==0) {
				if(arr[x]%2==0) {
					System.out.println(arr[x]);
					sum=sum+arr[x];
				}
			}
		}
		System.out.println(sum);*/
		
		
		
		/*int a[]=new int[] {};
		int b[]=new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array");
		for(int x=0;x<b.length;x++) {
			b[x]=sc.nextInt();
			
			
		}
		System.out.println("array elements are");
		for(int y=0;y<b.length;y++) {
			System.out.println(b[y]);
			
		}*/
		
		//copy of elements from one array to another array
		
		
		/*int arr1[]=new int [] {10,20,30,40,50};
		int arr2[]=new int [arr1.length];
		int x,y;
		for(y=0,x=0;y<arr1.length;y++,x++) {
			arr2[x]=arr1[y];
			
		}
		for(int temp:arr2)
		{
			System.out.println(temp);
		}*/
		   
		//frequency of in array
		
		
		/*int arr[]=new int [] { 1,1,2,3,4,1,2,34,2,4,2,4,121};
		boolean b[]=new boolean[arr.length];
		int x,y,count=0;
		for(x=0;x<arr.length;x++) {
			count=1;
			if(b[x]==true) {
				continue;
			}
			for(y=0;y<arr.length;y++) {
				if(arr[x]==arr[y]&&x!=y) {
					b[y]=true;
					count++;
				}
				
				
			}
			if(b[x]==false) {
				if(count>1)
				System.out.println(arr[x]+" "+count);
				
			}
			
			
			
		}
		
		
		//rotations

		
		/*int a[]=new int [] {1,2,3,4,5,6};
		int check=6,count=0;
		for(int x=0;x<a.length;x++) {
			if(a[x]==check) {
				count++;
				
			}*/
		
		/*int a[]=new int[] {1,3,4,5,6,3,2,5};
		for(int x=0;x<a.length;x++) {
			int count=0;
			for(int y=0;y<a.length;y++) {
				if(a[x]==a[y]&&x!=y) {
					count++;
					
				}
			}
			if(count==0) {
				System.out.println(a[x]);
			}
			
		}*/
		
		
		int a[]=new int[] {15,13,17,19,14,11,21,10,9};
		int min=0;
		for(int x=0;x<a.length;x++) {
			min=x;
			for(int y=x+1;y<a.length;y++) {
				if(a[min]>a[y]) {
					min=y;
					
				}
				int temp=a[min];
				a[min]=a[x];
				a[x]=temp;
				
			}
			
		}
		for(int m:a) {
			System.out.println(m);
		}

	}

}
