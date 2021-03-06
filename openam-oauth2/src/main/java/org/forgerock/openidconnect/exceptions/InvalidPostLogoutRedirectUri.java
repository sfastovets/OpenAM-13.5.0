/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2015 ForgeRock AS.
 */
package org.forgerock.openidconnect.exceptions;

import org.forgerock.oauth2.core.exceptions.OAuth2Exception;

/**
 * Thrown when a client's post logout redirect uri is invalid.
 *
 * @since 13.0.0
 */
public class InvalidPostLogoutRedirectUri extends OAuth2Exception {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidPostLogoutRedirectUri exception with the default message.
     */
    public InvalidPostLogoutRedirectUri() {
        super(400, "invalid_post_logout_redirect_uris", "One or more post_logout_redirect_uri values are invalid.");
    }
}
