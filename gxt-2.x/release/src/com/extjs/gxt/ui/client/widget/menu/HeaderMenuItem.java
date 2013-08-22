/*
 * Sencha GXT 2.3.0 - Sencha for GWT
 * Copyright(c) 2007-2013, Sencha, Inc.
 * licensing@sencha.com
 * 
 * http://www.sencha.com/products/gxt/license/
 */
 package com.extjs.gxt.ui.client.widget.menu;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.util.Util;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;

/**
 * A menu item for headings.
 */
public class HeaderMenuItem extends Item {
  private String itemStyle = "x-menu-text";
  private String html;

  /**
   * Creates a new header menu item.
   */
  public HeaderMenuItem() {
    super();
    setHideOnClick(false);
  }

  /**
   * Creates a new header menu item.
   * 
   * @param html the header text as HTML
   */
  public HeaderMenuItem(String html) {
    this();
    this.html = html;
  }

  /**
   * Returns the item's text.
   * 
   * @return the item text
   */
  public String getHtml() {
    return html;
  }

  /**
   * Sets the item's text.
   * 
   * @param text the item's text
   */
  public void setText(String text) {
    setHtml(El.toSafeHTML(text));
  }

  /**
   * Sets the item's text as HTML.
   * 
   * @param html html the text as HTML
   */
  public void setHtml(String html) {
    this.html = html;
    if (rendered) {
      el().update(Util.isEmptyString(html) ? "&#160;" : html);
    }

  }

  @Override
  protected void onRender(Element target, int index) {
    Element span = DOM.createSpan();
    span.setClassName(itemStyle);
    setElement(span, target, index);
    super.onRender(target, index);
    setHtml(html);
  }

}
