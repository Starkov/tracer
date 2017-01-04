package com.epam;

import java.lang.instrument.Instrumentation;

/**
 * Created by Starkov Anatolii on 04.01.2017.
 */
public class Agent {
    public static void premain(String args, Instrumentation instrumentation){
        System.out.println("agent");
    }
}
