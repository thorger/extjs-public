/*
 * Sencha GXT 2.3.0 - Sencha for GWT
 * Copyright(c) 2007-2013, Sencha, Inc.
 * licensing@sencha.com
 * 
 * http://www.sencha.com/products/gxt/license/
 */
 package com.extjs.gxt.samples.client.examples.layouts;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.layout.CardLayout;
import com.google.gwt.user.client.Element;

public class CardLayoutExample extends LayoutContainer {

  @Override
  protected void onRender(Element parent, int index) {
    super.onRender(parent, index);
    setStyleAttribute("margin", "10px");
    
    ContentPanel panel = new ContentPanel();
    panel.setSize(400, 100);
    panel.setFrame(true);
    panel.setHeadingHtml("CardLayout Example");
    panel.setButtonAlign(HorizontalAlignment.CENTER);

    final CardLayout layout = new CardLayout();
    panel.setLayout(layout);

    for (int i = 0; i < 4; i++) {
      final LayoutContainer c = new LayoutContainer();
      c.addText("This is the contents for card: " + (i + 1));
      panel.add(c);
      panel.addButton(new Button("Card " + (i + 1), new SelectionListener<ButtonEvent>() {
        @Override
        public void componentSelected(ButtonEvent ce) {
          layout.setActiveItem(c);
        }
      }));
    }
    
    layout.setActiveItem(panel.getItem(0));
    
    add(panel);
  }

}
