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
package org.jwildfire.create.tina.swing;

import java.awt.Dimension;

import javax.swing.filechooser.FileFilter;

import org.jwildfire.base.Prefs;
import org.jwildfire.base.Tools;
import org.jwildfire.swing.DefaultFileChooser;

public class FlameFileChooser extends DefaultFileChooser {
  private final String defaultExt;
  private static final long serialVersionUID = 1L;

  @Override
  protected String getDefaultExtension() {
    return defaultExt;
  }

  public FlameFileChooser(Prefs pPrefs) {
    this(pPrefs, false);
  }

  public FlameFileChooser(Prefs pPrefs, boolean pWithChaos) {
    setPreferredSize(new Dimension(960, 600));
    FileFilter filter = new FlameFileFilter();
    addChoosableFileFilter(filter);
    defaultExt = Tools.FILEEXT_FLAME;
    if (pWithChaos) {
      addChoosableFileFilter(new ChaosFileFilter());
    }
    setFileFilter(filter);
    setAcceptAllFileFilterUsed(false);
    setAccessory(new FlameFilePreview(this, pPrefs));
  }

}
