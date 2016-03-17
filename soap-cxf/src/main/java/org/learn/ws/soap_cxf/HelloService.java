package org.learn.ws.soap_cxf;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String say(String name);

}
