//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package com.acepta.soap.ca4xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedioPagoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MedioPagoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="EF"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="OT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedioPagoType")
@XmlEnum
public enum MedioPagoType {


    /**
     * 
     * 							Cheque
     * 							
     * 
     */
    CH,

    /**
     * 
     * 							Letra
     * 							
     * 
     */
    LT,

    /**
     * 
     * 							Efectivo
     * 							
     * 
     */
    EF,

    /**
     * 
     * 							Pago a Cuenta Corriente
     * 							
     * 
     */
    PE,

    /**
     * 
     * 							Tarjeta de Credito
     * 							
     * 
     */
    TC,

    /**
     * 
     * 							Cheque a Fecha
     * 							
     * 
     */
    CF,

    /**
     * 
     * 							Otro
     * 							
     * 
     */
    OT;

    public String value() {
        return name();
    }

    public static MedioPagoType fromValue(String v) {
        return valueOf(v);
    }

}