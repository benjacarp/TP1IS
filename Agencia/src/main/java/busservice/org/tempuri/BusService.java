
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BusService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://ds.dyndns.org:9000/BusService?wsdl")
public class BusService
    extends Service
{

    private final static URL BUSSERVICE_WSDL_LOCATION;
    private final static WebServiceException BUSSERVICE_EXCEPTION;
    private final static QName BUSSERVICE_QNAME = new QName("http://tempuri.org/", "BusService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ds.dyndns.org:9000/BusService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BUSSERVICE_WSDL_LOCATION = url;
        BUSSERVICE_EXCEPTION = e;
    }

    public BusService() {
        super(__getWsdlLocation(), BUSSERVICE_QNAME);
    }

    public BusService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BUSSERVICE_QNAME, features);
    }

    public BusService(URL wsdlLocation) {
        super(wsdlLocation, BUSSERVICE_QNAME);
    }

    public BusService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BUSSERVICE_QNAME, features);
    }

    public BusService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BusService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IBusService
     */
    @WebEndpoint(name = "SGEBusService")
    public IBusService getSGEBusService() {
        return super.getPort(new QName("http://tempuri.org/", "SGEBusService"), IBusService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IBusService
     */
    @WebEndpoint(name = "SGEBusService")
    public IBusService getSGEBusService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "SGEBusService"), IBusService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BUSSERVICE_EXCEPTION!= null) {
            throw BUSSERVICE_EXCEPTION;
        }
        return BUSSERVICE_WSDL_LOCATION;
    }

}
