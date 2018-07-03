package com.java.structural.templatemethod;

import org.junit.Test;

/**
 * Created by maskwang on 18-7-3.
 */
public class TemplateMethodTest {

    @Test
    public void templateMethodTest() {
        PurchaseOperation purchaseOperation = new JdPurchase();
        purchaseOperation.buy();

        purchaseOperation = new TaobaoPurchase();
        purchaseOperation.buy();

    }
}
