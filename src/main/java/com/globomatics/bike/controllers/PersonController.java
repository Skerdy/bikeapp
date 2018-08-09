package com.globomatics.bike.controllers;


import com.globomatics.bike.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("api/v1/persons")
@RestController
public class PersonController {

    @GetMapping
    public List<Person> getAll(){
        List<Person> personList =  new ArrayList<>();
        personList.add(new Person("Skerdjan", "Gurabardhi", 20));
        personList.add(new Person("Brigen" , "Tafilica" , 2));
        personList.add(new Person("Redion", "Muraj", 2));
        return personList;
    }
}
