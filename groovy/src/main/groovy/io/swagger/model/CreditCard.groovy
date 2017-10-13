package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CreditCard {

  /* The card number, specified as a string with no spaces or separators. */
  String number = null

  /* One to two digits representing the expiration month. */
  Integer expirationMonth = null

  /* Four digits representing the expiration year. */
  Integer expirationYear = null

  /* The card verification code */
  String cvv = null

  /* The brand (e.g. Visa, MasterCard, Amercian Express, etc.). */
  String brand = null

  /* The last four digits of the card number. */
  String lastFourDigits = null
  

}

