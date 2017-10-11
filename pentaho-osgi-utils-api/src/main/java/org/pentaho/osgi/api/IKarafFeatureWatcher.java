/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright 2015 - 2017 Hitachi Vantara. All rights reserved.
 */

package org.pentaho.osgi.api;

/**
 * Interface defining a class which serves one purpose, block until all features defined in the Karaf featuresBoot are
 * installed.
 * <p/>
 * Created by nbaker on 2/19/15.
 */
public interface IKarafFeatureWatcher {
  void waitForFeatures() throws FeatureWatcherException;


  class FeatureWatcherException extends Exception {
    public FeatureWatcherException( String message ) {
      super( message );
    }

    public FeatureWatcherException( String message, Throwable cause ) {
      super( message, cause );
    }
  }
}
