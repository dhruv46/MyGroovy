package com.si.example

import org.codehaus.groovy.ast.ASTNode;
import org.codehaus.groovy.ast.builder.AstBuilder;


class HelloWorld {
	boolean value
	boolean asBoolean(){ value }
	static main(args) {
		def name="dhurv"
		println "Hello $name!"
		def fullstring = ""
		def orderParts = ["Buy", 200,"Hot Dogs", "1"]
		orderParts.each {
			fullstring += it + " " 
		}
		println fullstring
		def myfilename = "c:\\temp.txt"
		def myFile = new File(myfilename)
		def printFileLine = {println "File Line: "+ it}
		myFile.eachLine { printFileLine }
	}	
}