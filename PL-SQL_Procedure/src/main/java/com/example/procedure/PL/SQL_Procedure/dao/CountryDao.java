package com.example.procedure.PL.SQL_Procedure.dao;

import com.example.procedure.PL.SQL_Procedure.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

/**
 * @author Javeed S
 */
public interface CountryDao extends JpaRepository<Country,Integer> {
}
