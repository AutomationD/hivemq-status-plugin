package com.hivemq.plugins.plugin;

import com.google.common.collect.Multimap;
import com.google.inject.Inject;
import com.hivemq.spi.message.QoS;
import com.hivemq.spi.message.Topic;
import com.hivemq.spi.services.BlockingSubscriptionStore;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * @author Christoph Schäbel
 */
@Path("/status")
@Produces("application/json")
public class StatusResource {

    private final BlockingSubscriptionStore subscriptionStore;

    @Inject
    public StatusResource(final BlockingSubscriptionStore subscriptionStore) {
        this.subscriptionStore = subscriptionStore;
    }

    @GET
    @Path("/ping")
    public Response getStatus() {

        return Response.ok("OK").build();
    }
}
