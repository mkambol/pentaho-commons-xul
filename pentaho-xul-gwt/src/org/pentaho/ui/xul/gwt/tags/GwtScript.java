/**
 * 
 */
package org.pentaho.ui.xul.gwt.tags;

import org.pentaho.ui.xul.XulComponent;
import org.pentaho.ui.xul.components.XulScript;
import org.pentaho.ui.xul.dom.Element;
import org.pentaho.ui.xul.gwt.AbstractGwtXulComponent;
import org.pentaho.ui.xul.gwt.GwtXulHandler;
import org.pentaho.ui.xul.gwt.GwtXulParser;

/**
 * @author nbaker
 *
 */
public class GwtScript extends AbstractGwtXulComponent implements XulScript {

  static final String ELEMENT_NAME = "script"; //$NON-NLS-1$
  
  public static void register() {
    GwtXulParser.registerHandler(ELEMENT_NAME, 
    new GwtXulHandler() {
      public Element newInstance() {
        return new GwtScript();
      }
    });
  }
  
  private String id;
  private String src;

  public GwtScript() {
    super(ELEMENT_NAME);
  }
  
  public void init(com.google.gwt.xml.client.Element srcEle) {
    super.init(srcEle);
    setSrc(srcEle.getAttribute("src"));
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getSrc() {
    return src;
  }
  
  public void setSrc(String className) {
    this.src = className;
  }

  public void layout(){
  }

  public void adoptAttributes(XulComponent component) {
    
    if(component.getAttributeValue("src") != null){
      setSrc(component.getAttributeValue("src"));
    }
  }
}
