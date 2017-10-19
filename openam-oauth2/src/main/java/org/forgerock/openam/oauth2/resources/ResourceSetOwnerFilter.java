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
 * Copyright 2015-2016 ForgeRock AS.
 */

package org.forgerock.openam.oauth2.resources;

import java.util.HashSet;
import java.util.Set;

import org.forgerock.oauth2.core.ResourceSetFilter;
import org.forgerock.openam.oauth2.ResourceSetDescription;

/**
 * Filters the ResourceSets based on whether they are owned by the specified user.
 *
 * @since 13.0.0
 */
public class ResourceSetOwnerFilter implements ResourceSetFilter {

    private final String userId;

    /**
     * Constructor for this filter.
     * @param userId The id of the user to check ownership against.
     */
    public ResourceSetOwnerFilter(String userId) {
        this.userId = userId;
    }

    @Override
    public Set<ResourceSetDescription> filter(Set<ResourceSetDescription> values) {
        Set<ResourceSetDescription> results = new HashSet<>();
        for(ResourceSetDescription resourceSetDescription: values) {
            if(userId.equals(resourceSetDescription.getResourceOwnerId())) {
               results.add(resourceSetDescription);
            }
        }
        return results;
    }
}
