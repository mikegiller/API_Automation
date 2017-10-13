package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class ErrorResponse {

  /* The code defining the error. */
  String errorCode = null

  /* Detailed information about the error. */
  List<String> errorMessages = new ArrayList<String>()
  

}

