package org.uzum.iggytoto.java_dependencies;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingExample {

    private static final Logger LOG = LogManager.getLogger(LoggingExample.class);

    public static void main(String[] args){
        LOG.log(Level.INFO,"Info message");
        LOG.log(Level.WARN,"Warning message");
        LOG.log(Level.ERROR,"Error message", new Exception("Exception message"));
    }
}
