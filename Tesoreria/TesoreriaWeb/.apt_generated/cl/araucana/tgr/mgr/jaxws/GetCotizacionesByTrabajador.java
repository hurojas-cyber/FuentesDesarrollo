//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package cl.araucana.tgr.mgr.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCotizacionesByTrabajador", namespace = "http://servicios.laaraucana.cl/bonificaTGR")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCotizacionesByTrabajador", namespace = "http://servicios.laaraucana.cl/bonificaTGR", propOrder = {
    "token",
    "request"
})
public class GetCotizacionesByTrabajador {

    @XmlElement(name = "token", namespace = "", required = true)
    private String token;
    @XmlElement(name = "request", namespace = "", required = true)
    private cl.araucana.tgr.vo.RequestWSTGR request;

    /**
     * 
     * @return
     *     returns String
     */
    public String getToken() {
        return this.token;
    }

    /**
     * 
     * @param token
     *     the value for the token property
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 
     * @return
     *     returns RequestWSTGR
     */
    public cl.araucana.tgr.vo.RequestWSTGR getRequest() {
        return this.request;
    }

    /**
     * 
     * @param request
     *     the value for the request property
     */
    public void setRequest(cl.araucana.tgr.vo.RequestWSTGR request) {
        this.request = request;
    }

}