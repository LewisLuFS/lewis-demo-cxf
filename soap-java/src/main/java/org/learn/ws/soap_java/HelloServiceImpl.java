package org.learn.ws.soap_java;

import javax.jws.WebService;

@WebService(
	serviceName = "HelloService",
	portName = "HelloServicePort",
	endpointInterface = "org.learn.ws.soap_java.HelloService"
)
public class HelloServiceImpl implements HelloService {

	@Override
	public String say(String name) {
		return "hello " + name;
	}

}
