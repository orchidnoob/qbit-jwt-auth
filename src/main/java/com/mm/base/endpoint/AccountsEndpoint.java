package com.mm.base.endpoint;

import io.advantageous.qbit.annotation.PathVariable;
import io.advantageous.qbit.annotation.RequestMapping;
import io.advantageous.qbit.annotation.RequestMethod;
import io.advantageous.qbit.annotation.RequestParam;

@RequestMapping("/accounts")
public class AccountsEndpoint {
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public void create(@PathVariable("id") Integer id) {
        System.out.println("create " + id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void remove() {
        System.out.println("remove");
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update() {
        System.out.println("update");
    }


    @RequestMapping(value = "/{id}/block", method = RequestMethod.GET)
    public void getBlock() {
        System.out.println("get block");
    }

    @RequestMapping(value = "/{id}/block", method = RequestMethod.POST)
    public void block(@RequestParam("till") Long till) {
        System.out.println("create block");
    }


    @RequestMapping(value = "/{id}/block", method = RequestMethod.DELETE)
    public void unblock() {
        System.out.println("block");
    }


}
