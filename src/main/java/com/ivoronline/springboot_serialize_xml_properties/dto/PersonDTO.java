package com.ivoronline.springboot_serialize_xml_properties.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonDTO {

  //PROPERTIES
  public Integer id;
  public String  name;
  public Integer age;

}
