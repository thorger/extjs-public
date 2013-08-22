/*
 * Sencha GXT 2.3.0 - Sencha for GWT
 * Copyright(c) 2007-2013, Sencha, Inc.
 * licensing@sencha.com
 * 
 * http://www.sencha.com/products/gxt/license/
 */
 package com.extjs.gxt.ui.client.data;

/**
 * Interface for objects that can translate a model's typed values to strings.
 */
public interface ModelStringProvider<M extends ModelData> {

  /**
   * Returns the string value for the property.
   * 
   * @param model the model instance
   * @param property the property name
   * @return the string value
   */
  public String getStringValue(M model, String property);

}
