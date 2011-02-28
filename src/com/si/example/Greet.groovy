package com.si.example

class Greet {
	def name
	Greet(who){
		name = who[0].toUpperCase()+who[1..-1]
	}
	def status(){
		println "Hello $name!!"
	}
	static main(args) {
		Greet g = new Greet("dhruv")
		g.status()		
	}

}
