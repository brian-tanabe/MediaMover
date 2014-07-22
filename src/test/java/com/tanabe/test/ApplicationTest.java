package com.tanabe.test;

import com.tanabe.mm.application.Application;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 7/21/2014.
 */
public class ApplicationTest extends Application {

    @Test
    public void testApplicationVersion(){
        assertEquals("v0.0.1", getVersionString());
    }
}
