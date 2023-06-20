/*
* @(#) MyClassSqlConfig.java 1.0 04/06/2013
*
* Este c�digo fuente pertenece a la Caja de Compensaci�n de Asignaci�n Familiar
* La Araucana (C.C.A.F.). Su utilizaci�n y reproducci�n es confidencial y est�
* restringido a los sistemas de informaci�n propios de la instituci�n.
* 
* 
*/
package cl.laaraucana.surakm.ibatis.config;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class MyClassSqlConfig {
	private static MyClassSqlConfig instance=null;
	private static final SqlMapClient sqlMap;
	static {
		try {
			String resource = "cl/laaraucana/surakm/ibatis/config/IbatisConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (Exception e) {
			System.out.println("Error en myclasssqlconfig :"+e.getMessage());
			throw new RuntimeException(
					"Error initializing MyAppSqlConfig class. Cause: " + e);
		}
	}

	public static SqlMapClient getSqlMapInstance() {
		if(instance == null) 
 			instance = new MyClassSqlConfig(); 
		return sqlMap;
	}
	
	private static MyClassSqlConfig instance2=null;
	private static final SqlMapClient sqlMap2;
	static {
		try {
			String resource = "cl/laaraucana/surakm/ibatis/config/IbatisConfigSql.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMap2 = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (Exception e) {
			System.out.println("Error en myclasssqlconfig :"+e.getMessage());
			throw new RuntimeException(
					"Error initializing MyAppSqlConfig class. Cause: " + e);
		}
	}

	public static SqlMapClient getSqlMapInstanceSql() {
		if(instance2 == null) 
 			instance2 = new MyClassSqlConfig(); 
		return sqlMap2;
	}
}