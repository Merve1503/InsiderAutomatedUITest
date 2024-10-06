package utilities.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {

    // Logger nesnesini statik olarak tanımladık
    static Logger logger = Logger.getLogger(Log.class);

    public Log() {
        DOMConfigurator.configure("log4j.xml");
    }

    public static void info(String message) {
        logger.info(message); // Loglama: Bilgi
    }

    public static void warn(String message) {
        logger.warn(message); // Loglama: Uyarı
    }

    public static void error(String message) {
        logger.error(message); // Loglama: Hata
    }
}
