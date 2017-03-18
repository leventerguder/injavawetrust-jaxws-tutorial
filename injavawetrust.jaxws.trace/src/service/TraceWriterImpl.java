package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "service.TraceWriter")
public class TraceWriterImpl implements TraceWriter{

	@WebMethod
	@Override
	public String getMessage() {
		return "Trace Message!";
	}

}
