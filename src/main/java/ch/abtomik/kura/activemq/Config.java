/*******************************************************************************
 * Copyright (c) 2017 Red Hat Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Inc - initial API and implementation
 *******************************************************************************/
package ch.abtomik.kura.activemq;

import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.AttributeDefinition;

/**
 * Meta type information for {@link CamelExampleConfigurableComponent}
 * <p>
 * <strong>Note: </strong> The id must be the full qualified name of the assigned component.
 * </p>
 */
@ObjectClassDefinition(id="ch.abtomik.kura.activemq.CamelExampleConfigurableComponent", name="Flume Example", description="This is the Flume/Camel example #1 component")
@interface Config {
    @AttributeDefinition(name = "Host", description = "The name or IP address of the database host. This value may use environment variables by using the syntax \"${VAR}\"")
    public String host() default "localhost";

    @AttributeDefinition(name = "Port")
    public int port() default 3306;

    @AttributeDefinition(name = "User name")
    public String user() default "camel";
}
