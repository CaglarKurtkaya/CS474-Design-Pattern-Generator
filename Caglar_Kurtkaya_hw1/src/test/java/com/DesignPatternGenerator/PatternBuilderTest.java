package com.DesignPatternGenerator;

import com.DesignPatternGenerator.DPG.PatternBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PatternBuilderTest {
    PatternBuilder p;



    @Before
    public void init(){
        p = new PatternBuilder.pBuilder("AFDP", "MyFactory").withPackName("FACTORY")
                .withProductName("Bank")
                .withProductType("Chase")
                .build();
    }

    @Test
    public void verifyPatternName(){
        Assert.assertEquals("patternName is not correct ","AFDP",p.getPatternName());
    }

    @Test
    public void verifyClassName(){
        Assert.assertEquals("className is not correct ","MyFactory",p.getClassName());
    }

    @Test
    public void verifyPackName(){
        Assert.assertEquals("packName is not correct ","FACTORY",p.getPackName());
    }

    @Test
    public void verifyProductName(){
        Assert.assertEquals("productName is not correct ","Bank",p.getProductName());
    }


    @Test
    public void verifyProductType(){
        Assert.assertEquals("productType is not correct ","Chase",p.getProductType());
    }

}
