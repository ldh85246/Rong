package com.bit.exam06;

public class Executor {
	private Worker worker;

	public Executor(Worker worker) {
		super();
		this.worker = worker;
		System.out.println("생성자1 동작함");
		this.worker.pro();
	}
	
	public Executor(String run) {
		System.out.println("생성자2 동작함");
	}
}
