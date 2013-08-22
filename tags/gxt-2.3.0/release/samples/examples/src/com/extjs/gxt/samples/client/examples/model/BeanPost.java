/*
 * Sencha GXT 2.3.0 - Sencha for GWT
 * Copyright(c) 2007-2013, Sencha, Inc.
 * licensing@sencha.com
 * 
 * http://www.sencha.com/products/gxt/license/
 */
 package com.extjs.gxt.samples.client.examples.model;

import java.io.Serializable;
import java.util.Date;

import com.extjs.gxt.ui.client.data.BeanModelTag;

public class BeanPost implements BeanModelTag, Serializable {

  private String username;
  private String forum;
  private Date date;
  private String subject;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getForum() {
    return forum;
  }

  public void setForum(String forum) {
    this.forum = forum;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subjuct) {
    this.subject = subjuct;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

}
