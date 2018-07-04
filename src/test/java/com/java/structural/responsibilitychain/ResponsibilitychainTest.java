package com.java.structural.responsibilitychain;

import org.junit.Test;

/**
 * Created by maskwang on 18-7-4.
 */
public class ResponsibilitychainTest {

    @Test
    public void responsibilitychainTest(){

        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();

        handler1.setRequestLevel(RequestLevel.LEVEL1);
        handler2.setRequestLevel(RequestLevel.LEVEL2);

        handler1.setNextHandler(handler2);

        Request request = new Request("A REQUEST ...");
        request.setRequestLevel(RequestLevel.LEVEL1);

        handler1.handlerMessage(request);



    }
}
