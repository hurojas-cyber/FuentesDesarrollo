// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package cl.araucana.autoconsulta.vo;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import javax.rmi.CORBA.Stub;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.RemarshalException;
import org.omg.CORBA.portable.ServantObject;

public class _Validable_Stub extends Stub implements Validable,
Remote {
    
    private static final String[] _type_ids = {
        "RMI:cl.araucana.autoconsulta.vo.Validable:0000000000000000"
    };
    
    public String[] _ids() { 
        return _type_ids;
    }
    
    public DatosValidacionVO getDatosValidacion() throws Exception {
        if (!Util.isLocal(this)) {
            try {
                org.omg.CORBA_2_3.portable.InputStream in = null;
                try {
                    org.omg.CORBA.portable.OutputStream out = _request("getDatosValidacion", true);
                    in = (org.omg.CORBA_2_3.portable.InputStream)_invoke(out);
                    return (DatosValidacionVO) in.read_value(DatosValidacionVO.class);
                } catch (ApplicationException ex) {
                    in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
                    String id = in.read_string();
                    if (id.equals("IDL:java/lang/Ex:1.0")) {
                        throw (Exception) in.read_value(Exception.class);
                    }
                    throw new UnexpectedException(id);
                } catch (RemarshalException ex) {
                    return getDatosValidacion();
                } finally {
                    _releaseReply(in);
                }
            } catch (SystemException ex) {
                throw Util.mapSystemException(ex);
            }
        } else {
            ServantObject so = _servant_preinvoke("getDatosValidacion",cl.araucana.autoconsulta.vo.Validable.class);
            if (so == null) {
                return getDatosValidacion();
            }
            try {
                DatosValidacionVO result = ((cl.araucana.autoconsulta.vo.Validable)so.servant).getDatosValidacion();
                return (DatosValidacionVO)Util.copyObject(result,_orb());
            } catch (Throwable ex) {
                Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                if (exCopy instanceof Exception) {
                    throw (Exception)exCopy;
                }
                throw Util.wrapException(exCopy);
            } finally {
                _servant_postinvoke(so);
            }
        }
    }
}