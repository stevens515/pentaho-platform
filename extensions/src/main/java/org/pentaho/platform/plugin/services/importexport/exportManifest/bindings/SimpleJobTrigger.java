/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License, version 2 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 *
 * Copyright 2006 - 2017 Hitachi Vantara.  All rights reserved.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.25 at 11:25:28 AM EDT 
//

package org.pentaho.platform.plugin.services.importexport.exportManifest.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for simpleJobTrigger complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simpleJobTrigger">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pentaho.com/schema/}jobTrigger">
 *       &lt;sequence>
 *         &lt;element name="repeatCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="repeatInterval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "simpleJobTrigger", propOrder = { "repeatCount", "repeatInterval" } )
public class SimpleJobTrigger extends JobTrigger {

  protected int repeatCount;
  protected long repeatInterval;

  /**
   * Gets the value of the repeatCount property.
   * 
   */
  public int getRepeatCount() {
    return repeatCount;
  }

  /**
   * Sets the value of the repeatCount property.
   * 
   */
  public void setRepeatCount( int value ) {
    this.repeatCount = value;
  }

  /**
   * Gets the value of the repeatInterval property.
   * 
   */
  public long getRepeatInterval() {
    return repeatInterval;
  }

  /**
   * Sets the value of the repeatInterval property.
   * 
   */
  public void setRepeatInterval( long value ) {
    this.repeatInterval = value;
  }

}
