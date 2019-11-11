package com.tpf.提高篇.对象拷贝;

import java.io.*;

/**
 * <p> </p>
 *
 * @version :  CloneUtils.java,v 1.0, 2018/9/17-18:31 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class CloneUtils {
    public static <T extends Serializable> T clone(T obj) {
        T cloneObj = null;
        try {
            //写入字节流
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(out);
            obs.writeObject(obj);
            obs.close();

            //分配内存，写入原始对象，生成新对象
            ByteArrayInputStream ios = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(ios);
            //返回生成的新对象
            cloneObj = (T) ois.readObject();
            ois.close();

        } catch (Exception e) {
            new CloneException("对象拷贝异常", e);
        }
        return cloneObj;
    }

    public static class CloneException extends RuntimeException {
        private static final long serialVersionUID = -4255389783724899754L;

        public CloneException(String message, Throwable cause) {
            super(message, cause);
        }
    }

}


