package com.mm.base.endpoint;

import com.mm.base.MessagePrinter;
import com.mm.base.annotation.Secured;
import io.advantageous.qbit.annotation.RequestMapping;
import io.advantageous.qbit.annotation.RequestMethod;

@RequestMapping("/auth")
public class AuthEndpoint {
    private final MessagePrinter messagePrinter;

    public AuthEndpoint(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    @Secured(permission = "p1", role = "r1")
    @RequestMapping(value = "token", method = RequestMethod.GET)//POST)
    public void token() {
        System.out.println("login");
    }

    @RequestMapping(value = "refresh", method = RequestMethod.GET)
    public void refresh() {
        System.out.println("refresh");
    }

    @Secured(permission = "p1", role = "r1")
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public void logout() {
        System.out.println("logout");
    }
}
