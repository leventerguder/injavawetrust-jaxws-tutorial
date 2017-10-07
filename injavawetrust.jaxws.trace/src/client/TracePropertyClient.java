package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.TraceWriter;

public class TracePropertyClient {

	// TCP/IP Monitor "local port"
	private static String WEB_SERVICE_WSDL_URL = "http://localhost:8888/injavawetrust/trace.writer?wsdl";

	public static void main(String[] args) throws MalformedURLException {

		// When you invoke the Web Service, just pass the system property
		// com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true, it
		// prints out the request and response message.

		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");

		URL url = new URL(WEB_SERVICE_WSDL_URL);
		QName qname = new QName("http://service/", "TraceWriterImplService");
		Service service = Service.create(url, qname);

		TraceWriter traceWriter = service.getPort(TraceWriter.class);

		String message = traceWriter.getMessage();
		System.out.println(message);
	}
}
