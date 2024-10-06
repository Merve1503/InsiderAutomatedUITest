package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // 1- Properties nesnesini oluştur
    // 1- Create the object of Properties (tr çevir java yorumu)

    private static Properties properties = new Properties();

    static {

        try {

            // 2- Dosyayı Java belleğinde açmamız gerekiyor: FileInputStream
            // 2- We need to open the file in java memory: FileInputStream

            FileInputStream file = new FileInputStream("configuration.properties");

            // 3- FileInputStream nesnesini kullanarak properties nesnesini yükle
            // 3- Load the properties object using FileInputStream object
            properties.load(file);

            // 4- Dosyayı kapat
            // 4- close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader. ConfigurationReader'da dosya bulunamadı.");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }
}
