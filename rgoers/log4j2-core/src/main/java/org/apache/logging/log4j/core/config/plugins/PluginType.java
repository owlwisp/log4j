/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.core.config.plugins;


/**
 *
 */
public class PluginType {

    private Class pluginClass;
    private String elementName;
    private boolean printObject = false;

    public PluginType(Class clazz, String name, boolean printObj) {
        this.pluginClass = clazz;
        this.elementName = name;
        this.printObject = printObj;
    }

    public Class getPluginClass() {
        return this.pluginClass;
    }

    public String getElementName() {
        return this.elementName;
    }

    public boolean isObjectPrintable() {
        return this.printObject;
    }

}