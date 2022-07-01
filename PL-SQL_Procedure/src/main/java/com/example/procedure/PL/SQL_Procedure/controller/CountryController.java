package com.example.procedure.PL.SQL_Procedure.controller;

import com.example.procedure.PL.SQL_Procedure.dao.CountryDao;
import com.example.procedure.PL.SQL_Procedure.dao.CountryDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Javeed S
 */
@RestController
@RequestMapping("/getMessage")
public class CountryController {

    @Autowired
    private CountryDaoImpl dao;

//    @GetMapping
//    public ResponseEntity<?> getCountryMessages(@RequestHeader(value = "Accept-Language",required = true) String lang){
//        System.out.println("Language :" + lang);
//        return new ResponseEntity<>(dao.getCountryMessage(lang), HttpStatus.OK);
//    }

    @GetMapping
    public ResponseEntity<?> getCountryMessages(@RequestHeader(value = "Accept-Language",required = true) String lang){
        System.out.println("Language :" + lang);
        return new ResponseEntity<>(dao.getCountryMessage2(lang), HttpStatus.OK);
    }
}
