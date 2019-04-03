package com.java.webservice.jaxws.service;

import java.net.BindException;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {

	public static void main(String[] args) throws BindException {
		 System.out.println("Publishing EndPoint ....");
		Endpoint.publish("http://localhost:8881/ws/person", new PersonServiceImpl());	

}


}