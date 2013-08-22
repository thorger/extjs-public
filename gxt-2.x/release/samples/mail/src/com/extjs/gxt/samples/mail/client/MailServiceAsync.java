/*
 * Sencha GXT 2.3.0 - Sencha for GWT
 * Copyright(c) 2007-2013, Sencha, Inc.
 * licensing@sencha.com
 * 
 * http://www.sencha.com/products/gxt/license/
 */
 package com.extjs.gxt.samples.mail.client;

import java.util.List;

import com.extjs.gxt.samples.resources.client.model.Folder;
import com.extjs.gxt.samples.resources.client.model.MailItem;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MailServiceAsync {

  public void getMailFolders(String userId, AsyncCallback<Folder> callback);

  public void getMailItems(Folder folder, AsyncCallback<List<MailItem>> callback);
}
