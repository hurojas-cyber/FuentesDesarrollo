//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package cl.laaraucana.satelites.integracion.ConsultaCreditosCanceladosPorRutCRC438;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "ConsultaCreditosCanceladosPorRutCRC438As400", targetNamespace = "http://delegate.toAS.legados.integracion.laaraucana.cl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConsultaCreditosCanceladosPorRutCRC438As400 {


    /**
     * 
     * @param arg0
     * @return
     *     returns cl.laaraucana.satelites.integracion.ConsultaCreditosCanceladosPorRutCRC438.ConsultaCreditosCanceladosPorRutCRC438As400ListaSalidaVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaCreditosCanceladosPorRutCRC438As400", targetNamespace = "http://delegate.toAS.legados.integracion.laaraucana.cl/", className = "cl.laaraucana.satelites.integracion.ConsultaCreditosCanceladosPorRutCRC438.ConsultaCreditosCanceladosPorRutCRC438As400_Type")
    @ResponseWrapper(localName = "consultaCreditosCanceladosPorRutCRC438As400Response", targetNamespace = "http://delegate.toAS.legados.integracion.laaraucana.cl/", className = "cl.laaraucana.satelites.integracion.ConsultaCreditosCanceladosPorRutCRC438.ConsultaCreditosCanceladosPorRutCRC438As400Response")
    @Action(input = "http://delegate.toAS.legados.integracion.laaraucana.cl/ConsultaCreditosCanceladosPorRutCRC438As400/consultaCreditosCanceladosPorRutCRC438As400Request", output = "http://delegate.toAS.legados.integracion.laaraucana.cl/ConsultaCreditosCanceladosPorRutCRC438As400/consultaCreditosCanceladosPorRutCRC438As400Response")
    public ConsultaCreditosCanceladosPorRutCRC438As400ListaSalidaVO consultaCreditosCanceladosPorRutCRC438As400(
        @WebParam(name = "arg0", targetNamespace = "")
        ConsultaCreditosCanceladosPorRutCRC438As400EntradaVO arg0);

}