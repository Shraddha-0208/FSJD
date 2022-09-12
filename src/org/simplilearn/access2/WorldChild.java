package org.simplilearn.access2;

import org.simplilearn.access1.MyClass;

public class WorldChild extends MyClass{
	//WorldChild is child class
	//MyClass is parent (parent name comes after a child)
	
		public static void main(String[] args) {
			WorldChild obj = new WorldChild();
			System.out.println("Public: " + obj.numPublic);
			System.out.println("Default: " + obj.numDefault);
			System.out.println("Protected: " + obj.numProtected);
			System.out.println("Private: " + obj.numPrivate);
		}
	}


