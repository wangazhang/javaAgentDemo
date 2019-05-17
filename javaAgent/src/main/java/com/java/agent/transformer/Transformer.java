package com.java.agent.transformer;

import java.io.*;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import javassist.ClassPool;

/**
 * TODO
 *
 * @author qianzhang
 * @version Transformer.java, v 0.1 2019-05-16 11:47 AM Exp $
 */
public class Transformer implements ClassFileTransformer {
   String srcClassName="com.java.agent.domainClass.TransClass";
   String targetFilePath="/classes/TransClass.class";

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        className=className.replace("/",".");
        if(!className.equals(srcClassName)){
            return null;
        }
        try {
            InputStream in = this.getClass().getResourceAsStream(targetFilePath);
            return inputStreamToByte(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }
    /**
     * 输入流转字节流
     * */
    private byte[] inputStreamToByte(InputStream is) throws IOException {
        ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
        byte[] buffer=new byte[1024];
        int ch;
        while ((ch = is.read(buffer)) != -1) {
            bytestream.write(buffer,0,ch);
        }
        byte data[] = bytestream.toByteArray();
        bytestream.close();
        return data;
    }
}
