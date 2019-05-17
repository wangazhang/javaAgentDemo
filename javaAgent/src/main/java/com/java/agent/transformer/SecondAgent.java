package com.java.agent.transformer;


import com.java.agent.domainClass.TransClass;
import javassist.ClassPool;
import javassist.CtClass;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * TODO
 *
 * @author qianzhang
 * @version FirstAgent.java, v 0.1 2019-05-16 7:21 PM Exp $
 */


public class SecondAgent implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {

        return new byte[0];
    }
}