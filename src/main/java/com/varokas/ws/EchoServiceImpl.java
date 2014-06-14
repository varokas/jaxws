package com.varokas.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.varokas.ws.EchoService")
public class EchoServiceImpl implements EchoService {

	@Override
	public String echo(String message) {
		return "echo: " + message;
	}

}
