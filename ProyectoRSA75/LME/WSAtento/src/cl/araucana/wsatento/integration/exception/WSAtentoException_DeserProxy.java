/**
 * WSAtentoException_DeserProxy.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf290824.08 v62608133037
 */

package cl.araucana.wsatento.integration.exception;

public class WSAtentoException_DeserProxy  extends java.lang.Exception  {
    private java.lang.String codigo;
    private java.lang.String mensaje;

    public WSAtentoException_DeserProxy() {
    }

    public java.lang.String getCodigo() {
        return codigo;
    }

    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }

    public java.lang.String getMensaje() {
        return mensaje;
    }

    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    public java.lang.Object convert() {
      return new cl.araucana.wsatento.integration.exception.WSAtentoException(
        getCodigo(),
        getMensaje());
    }
}