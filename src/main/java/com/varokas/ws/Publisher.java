package com.varokas.ws;

import javax.xml.ws.Endpoint;

public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8000/ws/echo", new EchoServiceImpl());
	}

}
