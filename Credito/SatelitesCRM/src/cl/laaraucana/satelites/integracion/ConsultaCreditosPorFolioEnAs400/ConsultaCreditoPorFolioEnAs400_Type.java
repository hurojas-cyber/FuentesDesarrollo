//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package cl.laaraucana.satelites.integracion.ConsultaCreditosPorFolioEnAs400;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaCreditoPorFolioEnAs400 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaCreditoPorFolioEnAs400">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://delegate.toAS.legados.integracion.laaraucana.cl/}consultaCreditoPorFolioEntradaVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaCreditoPorFolioEnAs400", propOrder = {
    "arg0"
})
public class ConsultaCreditoPorFolioEnAs400_Type {

    protected ConsultaCreditoPorFolioEntradaVO arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaCreditoPorFolioEntradaVO }
     *     
     */
    public ConsultaCreditoPorFolioEntradaVO getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaCreditoPorFolioEntradaVO }
     *     
     */
    public void setArg0(ConsultaCreditoPorFolioEntradaVO value) {
        this.arg0 = value;
    }

}