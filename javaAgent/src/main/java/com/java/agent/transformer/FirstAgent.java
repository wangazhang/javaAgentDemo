package com.java.agent.transformer;


import com.java.agent.domainClass.TransClass;
import javassist.ClassPool;
import javassist.CtClass;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Constructor;
import java.security.ProtectionDomain;

/**
 * TODO
 *
 * @author qianzhang
 * @version FirstAgent.java, v 0.1 2019-05-16 7:21 PM Exp $
 */


public class FirstAgent implements ClassFileTransformer {
    public final String injectedClassName = "com.java.agent.domainClass.TransClass";
//    public final String injectedClassName = "com.java.agent.AgentTest";
    public final String methodName = "hello";

    public FirstAgent() {
        try {
            final ClassLoader agentClassLoader = this.getClass().getClassLoader();
            System.out.println(agentClassLoader);
        } catch (Exception e) {
            throw new IllegalStateException("LambdaFactoryClassAdaptor initialize fail Caused by:" + e.getMessage(), e);
        }
    }

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        className = className.replace("/", ".");
        ClassLoader classLoader = this.getClass().getClassLoader();
        ClassLoader classLoader1 = ClassPool.getDefault().getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader1);

        if(className.equals(injectedClassName)){
            try {
                TransClass transClass = (TransClass) classLoader.loadClass("com.java.agent.domainClass.TransClass").newInstance();
                System.out.println("!:"+transClass.getNumber());

                CtClass ctClass = ClassPool.getDefault().get(TransClass.class.getName());
//                ctClass.setName("com.java.agent.domainClass.TransClass");
                return ctClass.toBytecode();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
////        System.out.println(className);
//        if (className.equals(injectedClassName)) {
//            CtClass ctclass = null;
//            try {
//                ctclass = ClassPool.getDefault().get(className);// 使用全称,用于取得字节码类<使用javassist>
//                CtMethod ctmethod = ctclass.getDeclaredMethod(methodName);// 得到这方法实例
//                ctmethod.insertBefore("System.out.println(11111111);");
//                ctmethod.insertAfter("System.out.println(22222222);");
//                return ctclass.toBytecode();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                e.printStackTrace();
//            }
//        }

        return null;
    }
}