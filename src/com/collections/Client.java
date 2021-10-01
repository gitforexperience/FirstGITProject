package com.collections;

import java.awt.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Client {


	public static void main(String[] args) {
		
		BeanFactory cntxt=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		CollectionsInSpring l=cntxt.getBean("lst",CollectionsInSpring.class);
		CollectionsInSpring l1=cntxt.getBean("lstbySetter",CollectionsInSpring.class);
		System.out.println(l.getFruits());
		System.out.println(l.getCricketers());
		System.out.println(l.getCountriesCaptials());
		System.out.println(l1.getFruits());
		System.out.println(l1.getCricketers());
		System.out.println(l1.getCountriesCaptials());
	}
}
