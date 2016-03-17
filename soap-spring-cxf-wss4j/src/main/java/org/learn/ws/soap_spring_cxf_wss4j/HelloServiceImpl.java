package org.learn.ws.soap_spring_cxf_wss4j;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

@WebService
@Component
public class HelloServiceImpl implements HelloService {

	@Override
	public String say(String name) {
		return "hello " + name;
	}

}
