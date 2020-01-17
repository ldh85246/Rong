package com.bit.exam09;

public class ProducerAndConsumer {

	public static void main(String[] args) {
		Product p = new Product();
		Producer producer = new Producer(p);
		Consumer consumer = new Consumer(p);
		producer.start();
		consumer.start();
	}
}
