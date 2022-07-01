package com.example.procedure.PL.SQL_Procedure.model;

import lombok.*;

import javax.persistence.*;

/**
 * @author Javeed S
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
//@NamedStoredProcedureQuery(name = Country.NamedQuery_Get_Message, procedureName = "GET_COUNTRY_MESSAGE",
//parameters = {
//        @StoredProcedureParameter(name = "COUNTRY_ID_INPUT", type = String.class, mode = ParameterMode.IN),
//        @StoredProcedureParameter(name = "COUNTRY_MESSAGE_OUTPUT", type = String.class, mode = ParameterMode.OUT)
//})
public class Country {

    public static final String NamedQuery_Get_Message = "getCountryMessage";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String country_code;
    private String country_name;
    private String country_message;
}
