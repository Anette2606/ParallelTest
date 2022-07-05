package com.test.junitdemo;
 

import org.junit.*;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;




public class AppTest {
 
 
    
    @Test
    public void runAllTests() {
        Class<?>[] classes = { ParallelTest1.class, ParallelTest2.class };

        // ParallelComputer(true,true) will run all classes and methods 
        // in parallel.  (First arg for classes, second arg for methods)
        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
    }
    
 
}

