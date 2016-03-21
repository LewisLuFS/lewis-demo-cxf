package org.learn.ws.skyweb;

import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;

public class DynamicClient {

	public static void main(String[] args) {
		getDownLinkReformatResult();
	}

	/**
	 * 获取下行报文
	 */
	public static void getDownLinkReformatResult() {
		DynamicClientFactory factory = DynamicClientFactory.newInstance();
		Client client = factory
				.createClient("http://acars.sf-express.com/SkyWebservice/services/AcarsDataDownService?wsdl");

		try {
			String userName = ApacheBase64.encode("ghs");
			String password = ApacheBase64.encode("Ghs_123456");
			String maxId = ApacheBase64.encode("30605069");
			String number = ApacheBase64.encode("10");
			String version = ApacheBase64.encode("2.0");

			QName opName = new QName("http://service.webservice.adcc.com/", "getDownLinkReformatResult");
			Object[] results = client.invoke(opName, userName, password, maxId, number, version);
			String res = (String) results[0];
			System.out.println(ApacheBase64.decode(res));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
