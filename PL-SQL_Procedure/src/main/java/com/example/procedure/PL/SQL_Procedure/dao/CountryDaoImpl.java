package com.example.procedure.PL.SQL_Procedure.dao;

import com.example.procedure.PL.SQL_Procedure.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.Map;

/**
 * @author Javeed S
 */
@Repository
public class CountryDaoImpl {

    private Country country;
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private JdbcTemplate jdbcTemplate;

  public Object getCountryMessage2(String input){

      SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
              .withProcedureName("GET_COUNTRY_MESSAGE");

      SqlParameterSource in = new MapSqlParameterSource().addValue("COUNTRY_ID_INPUT",input);

      Map<String, Object> execute = jdbcCall.execute(in);

      return execute;
  }


//    public Object getCountryMessage1(String input){
//        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("GET_COUNTRY_MESSAGE")
//                .registerStoredProcedureParameter("COUNTRY_ID_INPUT",String.class, ParameterMode.IN)
//                .registerStoredProcedureParameter("COUNTRY_MESSAGE_OUTPUT",String.class,ParameterMode.OUT)
//                .setParameter("COUNTRY_ID_INPUT",input);
//        query.execute();
//        Object country_message_output = query.getOutputParameterValue("COUNTRY_MESSAGE_OUTPUT");
//        return country_message_output;
//    }

//    public Object getCountryMessage(String input){
//        System.out.println("in DAO :" + input);
//        return entityManager.createNamedStoredProcedureQuery(country.NamedQuery_Get_Message).setParameter("COUNTRY_ID_INPUT", input).getOutputParameterValue("COUNTRY_MESSAGE_OUTPUT");
//    }



}
