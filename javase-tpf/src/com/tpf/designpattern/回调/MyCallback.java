package com.tpf.designpattern.回调;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  MyCallback.java,v 1.0, 2020/8/13-15:19 Exp $
 */
public class MyCallback implements CallbackHandler {
    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        
    }
}
