//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package cl.laaraucana.continuidad.delegate.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "continuidad", namespace = "http://delegate.continuidad.laaraucana.cl/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "continuidad", namespace = "http://delegate.continuidad.laaraucana.cl/")
public class Continuidad {

    @XmlElement(name = "entrada", namespace = "")
    private cl.laaraucana.continuidad.service.vo.EntradaContRentas entrada;

    /**
     * 
     * @return
     *     returns EntradaContRentas
     */
    public cl.laaraucana.continuidad.service.vo.EntradaContRentas getEntrada() {
        return this.entrada;
    }

    /**
     * 
     * @param entrada
     *     the value for the entrada property
     */
    public void setEntrada(cl.laaraucana.continuidad.service.vo.EntradaContRentas entrada) {
        this.entrada = entrada;
    }

}