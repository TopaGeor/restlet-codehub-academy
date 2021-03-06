package com.pfizer.restapi.router;

import com.pfizer.restapi.resource.PingServerResource;
import com.pfizer.restapi.resource.ProductListResourceImpl;
import com.pfizer.restapi.resource.ProductResourceImpl;
import org.restlet.Application;
import org.restlet.routing.Router;

public class CustomRouter {

    private Application application;

    public CustomRouter(Application application) {
        this.application = application;

    }

    public Router createApiRouter() {

        Router router = new Router(application.getContext());

        router.attach("/product/{id}", ProductResourceImpl.class);
        router.attach("/product", ProductListResourceImpl.class);
        router.attach("/product/", ProductListResourceImpl.class);


        return router;
    }


    public Router publicResources() {
        Router router = new Router();
        router.attach("/ping", PingServerResource.class);
        return router;
    }

}
