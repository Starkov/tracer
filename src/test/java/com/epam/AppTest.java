package com.epam;


import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.*;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@RunWith(JUnit4.class)
public class AppTest {

    @Test
    public void testName() throws Exception {
        String classpath = System.getProperty("java.class.path");
        String projectDir = System.getProperty("user.dir");
        ProcessBuilder testedAppBuilder = new ProcessBuilder(
                "java",
                "-cp", classpath,  // they MUST BE separated as two arguments, otherwise you get -cp is not recognised option -
                "-javaagent:" + projectDir + "\\target\\tracer-1.0.jar",
                SimpleApp.class.getName()
        );
        testedAppBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        testedAppBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
        Process p = testedAppBuilder.start();
    }
}
