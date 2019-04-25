/*
 * Copyright 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wildfly.elytron.web.undertow.server;

import org.wildfly.elytron.web.undertow.common.BearerTokenAuthenticationBase;
import org.wildfly.elytron.web.undertow.common.UndertowServer;

/**
 * Test case to {@link org.wildfly.security.http.impl.BearerTokenAuthenticationMechanism}.
 *
 * @author <a href="mailto:darran.lofthouse@jboss.com">Darran Lofthouse</a>
 */
public class BearerTokenAuthenticationTest extends BearerTokenAuthenticationBase {

    public BearerTokenAuthenticationTest() throws Exception {
        super();
    }

    @Override
    protected UndertowServer createUndertowServer() throws Exception {
        return UndertowCoreServer.builder()
                .setSecurityDomain(getSecurityDomain())
                .setMechanismFactoryFunction(this::getHttpServerAuthenticationMechanismFactory)
                .build();
    }

}
