package org.simplilearn.ds;

import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a[]= {2,3,4,1,9,14,6};
Arrays.sort(a);
System.out.println("elements in the array ");
for(int value:a ) {
System.out.println(value);
}
System.out.println("enter key value");
int key=sc.nextInt();
/*1. find mid=(low+high)/2;
* 2.if a[mid]==key value return the location
* 3.if a[mid]>key =>high=mid-1
* 4.if a[mid]<key =>low=mid+1
* */
int low=0;
int high=a.length-1;
int mid=0;
int flag=0;
while(low<=high) {
mid=(low+high)/2;
if(a[mid]==key) {
flag=1;
break;
}
else if(a[mid]<key) {
low=mid+1;
}
else {
high=mid-1;
}
}
if(flag==1) {
System.out.println("element is found at location "+ mid);
}
else {
System.out.println("element is not found");
}
}
}

