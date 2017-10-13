package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class Address {

  /* The first line of the address. */
  String line1 = null

  /* The second line of the address. */
  String line2 = null

  /* The city. */
  String city = null

  /* The state or province. */
  String state = null

  /* The country. */
  String country = null

  /* The postal code. */
  String postalCode = null
  

}

