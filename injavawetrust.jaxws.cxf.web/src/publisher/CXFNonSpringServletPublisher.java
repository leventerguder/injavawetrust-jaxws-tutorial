package publisher;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

import service.HelloWorldImpl;

@WebServlet("/cxf.webservice/*")
// http://localhost:8080/injavawetrust.jaxws.cxf.web/cxf.webservice/
public class CXFNonSpringServletPublisher extends CXFNonSpringServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void loadBus(ServletConfig servletConfig) {

		System.out.println("loadBus called ...");

		super.loadBus(servletConfig);
		Bus bus = getBus();
		BusFactory.setDefaultBus(bus);
		Endpoint.publish("/hellows", new HelloWorldImpl());

		// You can also use the simple frontend API to do this
		ServerFactoryBean factory = new ServerFactoryBean();
		factory.setBus(bus);
		factory.setServiceClass(HelloWorldImpl.class);
		factory.setAddress("/hellows2");
		factory.create();
	}
}