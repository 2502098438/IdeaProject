package transaction.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2 {
    private static final Logger log = LoggerFactory.getLogger(Log4j2.class);

    public static void main(String[] args) {
        log.info("hello log4j2!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        log.warn("hello log4j2!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
