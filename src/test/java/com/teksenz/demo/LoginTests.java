package com.teksenz.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {
    @Test(priority = 1, testName ="Login test with valid user and password" )
    public void loginTest(){
        System.out.println("Login test with valid user and password");

        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(act,exp,"The words dont mtch");
    }

    @Test(priority = 2, testName ="Login test with invalid user" )
    public void loginWithInvalidUser(){
        System.out.println("Login test with invalid user");

    }

    @Test(priority = 3, testName = "This is the Homepage Test")
    public void homePageTest(){
        System.out.println("This is the Homepage Test");
    }

    @Test(priority = 4, testName = "This is a logout test")
    public void logoutTest(){
        System.out.println("This is a logout test");
    }
}
