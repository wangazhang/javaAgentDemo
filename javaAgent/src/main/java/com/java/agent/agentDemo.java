package com.java.agent;

import com.java.agent.transformer.FirstAgent;
import com.java.agent.transformer.Transformer;

import java.lang.instrument.Instrumentation;

/**
 * TODO
 *
 * @author qianzhang
 * @version agentDemo.java, v 0.1 2019-05-16 11:18 AM Exp $
 */
public class agentDemo {
    public static void premain(String agentArgs, Instrumentation inst) {
        inst.addTransformer(new Transformer());
//        inst.addTransformer(new FirstAgent());
        System.out.println("=========premain方法执行1========");
        System.out.println(agentArgs);

    }

    /**
     * @param agentArgs
     */
    public static void premain(String agentArgs) {
        System.out.println("=========premain方法执行2========");
        System.out.println(agentArgs);
    }
}
