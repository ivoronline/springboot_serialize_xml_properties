package com.ivoronline.springboot_serialize_xml_properties.controllers;

import com.ivoronline.springboot_serialize_xml_properties.dto.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/GetPerson")
  public PersonDTO getPerson() {

    //CREATE INSTANCE
    PersonDTO personDTO      = new PersonDTO();
              personDTO.id   = 1;
              personDTO.name = "John";
              personDTO.age  = 20;

    //RETURN INSTANCE AS JSON
    return personDTO;

  }

}
