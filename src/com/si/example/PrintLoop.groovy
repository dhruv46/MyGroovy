package com.si.example

class PrintLoop {
	public static void main(def args){
		
		def list = ["Lars", "Ben", "Jack"]
		
		// using a variable assignment
		
		list.each{firstName-> println firstName }
		
		// using the it variable
		println()
		list.each{println it}
	}
}