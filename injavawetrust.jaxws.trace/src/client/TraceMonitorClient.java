package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.TraceWriter;

public class TraceMonitorClient {

	// private static String WEB_SERVICE_WSDL_URL =
	// "http://localhost:8888/injavawetrust/trace.writer?wsdl";

	// TCP/IP Monitor "local port"
	private static String WEB_SERVICE_WSDL_URL = "http://localhost:8082/injavawetrust/trace.writer?wsdl";

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL(WEB_SERVICE_WSDL_URL);
		QName qname = new QName("http://service/", "TraceWriterImplService");
		Service service = Service.create(url, qname);

		TraceWriter traceWriter = service.getPort(TraceWriter.class);

		String message = traceWriter.getMessage();
		System.out.println(message);
	}
}
