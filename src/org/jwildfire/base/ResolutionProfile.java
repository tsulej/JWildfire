/*
  JWildfire - an image and animation processor written in Java 
  Copyright (C) 1995-2011 Andreas Maschke

  This is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser 
  General Public License as published by the Free Software Foundation; either version 2.1 of the 
  License, or (at your option) any later version.
 
  This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License along with this software; 
  if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/
package org.jwildfire.base;

public class ResolutionProfile implements Cloneable {
  private int width;
  private int height;
  private boolean defaultProfile;

  public ResolutionProfile() {

  }

  public ResolutionProfile(boolean pDefaultProfile, int pWidth, int pHeight) {
    width = pWidth;
    height = pHeight;
    defaultProfile = pDefaultProfile;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return width + "x" + height;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public boolean isDefaultProfile() {
    return defaultProfile;
  }

  public void setDefaultProfile(boolean defaultProfile) {
    this.defaultProfile = defaultProfile;
  }

}
