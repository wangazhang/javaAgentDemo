package com.java.agent.domainClass;

/**
 * TODO
 *
 * @author qianzhang
 * @version User.java, v 0.1 2019-05-17 10:31 AM Exp $
 */
public class User {
    private String firstname;
    private String lastname;

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getName(){
        return firstname+"."+lastname;
    }
}
