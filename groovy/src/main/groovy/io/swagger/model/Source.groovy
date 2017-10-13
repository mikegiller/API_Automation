package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class Source {

  /* A unique identifier for this source. */
  String id = null

  /* The payment type of the source. The payment type will correspond to another element in the source response that contains detailed information specific to the type. For example, a type of `creditCard` indicates that there is an object in the response named `creditCard` that will contain card-specific data. Possible values are: * creditCard * wireTransfer  */
  String type = null

  /* The usage type of the source. Depending on the value, the source can be used only once, or it can be reused multiple times. Possible values are: * single * multiple  */
  String usage = "single"

  /* The current status of the source. Only a source with a `chargeable` status can be used to create a charge. Possible values are: * chargeable * pending * cancelled * failed  */
  String status = null
  

}

