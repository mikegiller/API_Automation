package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class Money {

  /* The monetary amount. */
  BigDecimal value = null

  /* The three-character ISO currency code. */
  String currency = null
  

}

