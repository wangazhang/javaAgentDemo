package com.java.agent;

import com.java.agent.domainClass.TransClass;

/**
 * TODO
 *
 * @author qianzhang
 * @version AgentTest.java, v 0.1 2019-05-16 11:23 AM Exp $
 */
public class AgentTest {
    public static void main(String[] args) {
        System.out.println(new TransClass().getNumber());
        hello();
    }

    public static void hello() {
        System.out.println("hello");
    }
}
