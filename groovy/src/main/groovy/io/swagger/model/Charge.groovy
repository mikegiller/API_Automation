package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class Charge {

  /* Unique identifier for the object. */
  String id = null

  /* The unique identifier assigned to the desired source for the charge. */
  String sourceId = null

  /* An arbitrary message related to the charge. */
  String description = null

  /* The client account this charge is under. */
  String client = null

  /* The channel this charge is under. */
  String channel = null

  /* Boolean representation of whether or not the charge has been authorized successfully. */
  Boolean authorized = null

  /* Boolean representation of whether or not the charge has been captured. */
  Boolean captured = null

  /* Error code for charge failure. */
  String failureCode = null

  /* Message explaining charge failure. */
  String failureMessage = null

  /* Set of key/value pairs to store additional information for charge */
  String metadata = null

  /* ID of order for this charge */
  String orderId = null

  /* The current status of the charge. Possible values are: * succeeded * pending * failed  */
  String status = null

  /* Time when charge was created. */
  String created = null
  

}

