package org.learn.ws.soap_java;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String say(String name);

}
