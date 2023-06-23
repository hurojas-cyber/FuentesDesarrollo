package cse.database.dao;

import java.sql.SQLException;
import java.util.List;

import cse.database.dao.exception.DAOException;
import cse.database.objects.Estadocivil;

public interface EstadocivilDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MotorCreditScoring.dbo.EstadoCivil
     *
     * @ibatorgenerated Wed Apr 25 16:42:26 ADT 2012
     */
    int deleteByPrimaryKey(Integer idestadocivil) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MotorCreditScoring.dbo.EstadoCivil
     *
     * @ibatorgenerated Wed Apr 25 16:42:26 ADT 2012
     */
    void insert(Estadocivil record) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MotorCreditScoring.dbo.EstadoCivil
     *
     * @ibatorgenerated Wed Apr 25 16:42:26 ADT 2012
     */
    Estadocivil selectByPrimaryKey(Integer idestadocivil) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MotorCreditScoring.dbo.EstadoCivil
     *
     * @ibatorgenerated Wed Apr 25 16:42:26 ADT 2012
     */
    int updateByPrimaryKey(Estadocivil record) throws SQLException;

	List selectByNombre(String estadoCivil)throws SQLException, DAOException;
}