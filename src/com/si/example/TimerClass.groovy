package com.si.example

class TimerClass {
	static main(args){
		boolean flag = false
		Timer timer = new Timer()
		timer.schedule(new TimerTask(){
			void run(){
				flag = true
			}
		},0)
		sleep 100
		assert flag
	}
}
