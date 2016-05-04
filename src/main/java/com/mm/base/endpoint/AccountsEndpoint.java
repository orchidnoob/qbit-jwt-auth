package com.mm.base.endpoint;

import io.advantageous.qbit.annotation.PathVariable;
import io.advantageous.qbit.annotation.RequestMapping;
import io.advantageous.qbit.annotation.RequestMethod;
import io.advantageous.qbit.annotation.RequestParam;

@RequestMapping("/accounts")
public class AccountsEndpoint {
    @RequestMapping(value = "/{id}", method = RequestMethod.POST, description="Create account")
    public String create(@PathVariable("id") Integer id) {
        System.out.println("create " + id);
        return "Created using id : " + id;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, description="Delete account")
    public void remove() {
        System.out.println("remove");
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, description="Update account")
    public void update() {
        System.out.println("update");
    }


    @RequestMapping(value = "/{id}/block", method = RequestMethod.GET, description="Block account")
    public void getBlock() {
        System.out.println("get block");
    }

    @RequestMapping(value = "/{id}/block", method = RequestMethod.POST, description="Block account till ttl")
    public void block(@RequestParam("till") Long till) {
        System.out.println("create block");
    }


    @RequestMapping(value = "/{id}/block", method = RequestMethod.DELETE, description="Unblock account")
    public void unblock() {
        System.out.println("block");
    }


}
