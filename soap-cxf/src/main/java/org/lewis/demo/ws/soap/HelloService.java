package org.lewis.demo.ws.soap;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String say(String name);

}
