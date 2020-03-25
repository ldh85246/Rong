package com.bit.exam03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new FileSystemResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		MessageBean mb = (MessageBean)factory.getBean("mb");
		mb.sayHello("ȫ�浿");
	}

}
