package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Source;
import java.util.List;
@Canonical
class SourceList {

  /* The current offset of the first elemetn in the data array from the start of the collection. */
  Integer offset = null

  /* The maximum number of source records in the response. */
  Integer limit = null

  /* An array of source records. */
  List<Source> data = new ArrayList<Source>()
  

}

