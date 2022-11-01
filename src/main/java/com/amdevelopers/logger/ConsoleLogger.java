package com.amdevelopers.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.Configurator;

import java.io.File;

/**
 * This class is responsible for logging
 *
 * @author Moieen Abbas
 */
public class ConsoleLogger {

    private Logger LOGGER;

    /**
     * Create a new instace of {@link ConsoleLogger} of provided qualified class name
     *
     * @param str_className
     */
    public ConsoleLogger(String str_className) {
        LOGGER = LogManager.getLogger(str_className);
    }

    /**
     * Create a new logger instance of provided class
     *
     * @param c_class
     */
    public ConsoleLogger(Class c_class) {
        LOGGER = LogManager.getLogger(c_class);
    }

    /**
     * Log message at debug level
     *
     * @param str_message
     */
    public void logDebug(String str_message) {
        LOGGER.debug(str_message);
    }

    /**
     * Log message at info level
     *
     * @param str_message
     */
    public void logInfo(String str_message) {
        LOGGER.info(str_message);
    }

    /**
     * Log error
     *
     * @param str_message
     */
    public void logError(String str_message) {
        LOGGER.error(str_message);
    }

    /**
     * Log Exception with a provided message
     *
     * @param str_message
     * @param ex
     */
    public void logExecption(String str_message, Exception ex) {
        LOGGER.error(str_message, ex);
    }

    /**
     * Log Fatal
     *
     * @param str_message
     */
    public void logFatal(String str_message) {
        LOGGER.fatal(str_message);
    }

    /**
     * Return the {@link Logger} object
     *
     * @return
     */
    public Logger getLogger() {
        return LOGGER;
    }

    /**
     * Initialize the Logger with provided configuration
     *
     * @param str_path
     */
    public static void loadConfiguration(String str_path) {
        Configurator.initialize(null, str_path.replace("/", File.separator));
    }

    /**
     * Initialize the Logger with {@link Configuration}
     */
    public static void loadConfiguration(Configuration a_configuration) {
        Configurator.initialize(a_configuration);
    }
}
