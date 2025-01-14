package cl.laaraucana.pagoenexceso.restservice;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import cl.laaraucana.pagoenexceso.manager.PagoEnExcesoMGR;
import cl.laaraucana.pagoenexceso.persistencia.vo.ConsultaPagoEnExcesoOut;

//@Path("/getPagosEnExesos/{rut}")
@Path("/getPagosEnExesos")
public class ConsultaPagoEnExesoREST {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ConsultaPagoEnExcesoOut consultarPagoEnExceso(@Context HttpHeaders headers, String rut) throws Exception {

		List<String> userAgents = headers.getRequestHeader("user_app");
		List<String> passAgents = headers.getRequestHeader("pass_app");
		String userAgent = userAgents.get(0);
		String passAgent = passAgents.get(0);

		ConsultaPagoEnExcesoOut salida= new ConsultaPagoEnExcesoOut();
		
		Properties propiedades = new Properties();
		InputStream entrada = null;

		try {
			entrada = this.getClass().getClassLoader().getResourceAsStream("mainConfig.properties");

			// Cargar las propiedades desde el archivo
			propiedades.load(entrada);
			String user_properties = propiedades.getProperty("user_app").toString();
			String pass_properties = propiedades.getProperty("pass_app").toString();
			
			// Consultar Si rut tiene salgo a favor
			System.out.println("usuario head : " + userAgent);
			System.out.println("pass head : " + passAgent);
			
			System.out.println("usuario properties : " + user_properties);
			System.out.println("pass properties : " + pass_properties);
						
			//if (userAgents.equals(user_properties) && passAgent.equals(pass_properties)) {
			if (userAgents.containsAll(Collections.singletonList(user_properties)) && 
				passAgents.containsAll(Collections.singletonList(pass_properties))) {				
								
				PagoEnExcesoMGR mgr = new PagoEnExcesoMGR();
				salida = mgr.consultarPagoEnExceso(rut);
				
			} else {
			    // Lanzar una excepci�n si los valores no coinciden
				throw new Exception("Usuario Y/O son incorrectos");
			}		
			} catch (IOException ex) {
				throw new ServletException("Ha ocurrido un error al realizar la operacion");
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					//e.printStackTrace();
				}
			}
		}	
		return salida;
	}
}
