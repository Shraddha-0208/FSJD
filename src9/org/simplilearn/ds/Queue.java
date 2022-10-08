package org.simplilearn.ds;

import java.util.Scanner;
public class Queue {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the queue");
int size=sc.nextInt();
int q[]=new int[size];
int front=-1,rear=-1;
System.out.println("Q operations");
while(true) {
System.out.println("enter ur choice 1. enqueue 2. dequeue 3. display 4.exit");
int ch=sc.nextInt();
switch(ch) {
case 1://overflow
if(rear==size-1) {
System.out.println("Q is full no more insertion...");
}
else {
System.out.println("enter the element");
int key=sc.nextInt();
rear++;
q[rear]=key;
front=0;
}
break;
//underflow
case 2:if((front==-1&&rear==-1)||(front>rear)) {
System.out.println("queue is empty");
}
else {
front=front+1;
}
break;
case 3:if((front==-1&&rear==-1)||(front>rear)) {
System.out.println("queue is empty");
}
else {
for(int i=front;i<=rear;i++) {
System.out.println(q[i]);
}
}
break;
case 4 :System.exit(0);
break;
default:System.out.println("check ur choice");
break;
}
}
}
}