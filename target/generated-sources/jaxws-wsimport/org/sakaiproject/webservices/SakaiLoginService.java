
package org.sakaiproject.webservices;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SakaiLoginService", targetNamespace = "http://webservices.sakaiproject.org/", wsdlLocation = "https://qa12-mysql.nightly.sakaiproject.org/sakai-ws/soap/login?wsdl")
public class SakaiLoginService
    extends Service
{

    private final static URL SAKAILOGINSERVICE_WSDL_LOCATION;
    private final static WebServiceException SAKAILOGINSERVICE_EXCEPTION;
    private final static QName SAKAILOGINSERVICE_QNAME = new QName("http://webservices.sakaiproject.org/", "SakaiLoginService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://qa12-mysql.nightly.sakaiproject.org/sakai-ws/soap/login?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAKAILOGINSERVICE_WSDL_LOCATION = url;
        SAKAILOGINSERVICE_EXCEPTION = e;
    }

    public SakaiLoginService() {
        super(__getWsdlLocation(), SAKAILOGINSERVICE_QNAME);
    }

    public SakaiLoginService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAKAILOGINSERVICE_QNAME, features);
    }

    public SakaiLoginService(URL wsdlLocation) {
        super(wsdlLocation, SAKAILOGINSERVICE_QNAME);
    }

    public SakaiLoginService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAKAILOGINSERVICE_QNAME, features);
    }

    public SakaiLoginService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SakaiLoginService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SakaiLogin
     */
    @WebEndpoint(name = "SakaiLoginPort")
    public SakaiLogin getSakaiLoginPort() {
        return super.getPort(new QName("http://webservices.sakaiproject.org/", "SakaiLoginPort"), SakaiLogin.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SakaiLogin
     */
    @WebEndpoint(name = "SakaiLoginPort")
    public SakaiLogin getSakaiLoginPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.sakaiproject.org/", "SakaiLoginPort"), SakaiLogin.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAKAILOGINSERVICE_EXCEPTION!= null) {
            throw SAKAILOGINSERVICE_EXCEPTION;
        }
        return SAKAILOGINSERVICE_WSDL_LOCATION;
    }

}
