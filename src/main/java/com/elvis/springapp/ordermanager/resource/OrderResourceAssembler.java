package com.elvis.springapp.ordermanager.resource;

import com.elvis.springapp.ordermanager.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Component;

@Component
public class OrderResourceAssembler extends ResourceAssembler<Order, OrderResource>{

    @Autowired
    protected EntityLinks entityLinks;

    private static final String UPDATE_REL = "update";
    private static final String DELETE_REL = "delete";

    @Override
    public OrderResource toResource(Order domainObject) {
        OrderResource resource = new OrderResource(domainObject);
        final Link selfLink = entityLinks.linkToSingleResource(domainObject);
        resource.add(selfLink.withSelfRel());
        resource.add(selfLink.withRel(UPDATE_REL));
        resource.add(selfLink.withRel(DELETE_REL));
        return resource;
    }
}
