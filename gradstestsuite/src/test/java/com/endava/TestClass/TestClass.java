package com.endava.TestClass;

import com.endava.MainClasses.ClassOne;
import com.endava.MainClasses.ClassTwo;
import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    @Test
public void TestGetString(){
        ClassOne classOne = new ClassOne();
        Assert.assertEquals("Hello World!", classOne.getString());
    }
    @Test
    public void TestAddNumbers(){
        ClassOne classOne = new ClassOne();
        Assert.assertEquals(6, classOne.addNumbers(1,5));
    }

    @Test
    public void TestSubstractNumbers(){
        ClassOne classOne = new ClassOne();
        Assert.assertEquals(-4, classOne.substractNumbers(1,5));
    }

    @Test
    public void TestMultiplyNumbers(){
        ClassOne classOne = new ClassOne();
        Assert.assertEquals(5, classOne.multiplyNumbers(1,5));
    }

    @Test
    public void TestFactorial(){
        ClassTwo classOne = new ClassTwo();
        Assert.assertEquals((Object)120, classOne.factorial(5));
    }

    @Test
    public void TestString(){
        ClassTwo classOne = new ClassTwo();
        Assert.assertEquals("Ramona", classOne.getString("R.m:n."));
    }
}
