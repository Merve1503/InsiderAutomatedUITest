# Insider UI Test Automation

Bu depo, Insider web sitesinin kullanıcı arayüzünü otomatik test etmek için geliştirilmiş bir test otomasyon projesidir. Testler, Selenium, JUnit ve Page Object Model (POM) yapısını kullanarak gerçekleştirilmektedir. Amaç, kullanıcı deneyimini doğrulamak ve işlevselliği test etmektir.

## 📁 Proje Yapısı

- **pages/**: Sayfa nesnelerini içeren paket.
  - **BasePage.java**: Tüm sayfalar için temel sınıf.
  - **HomePage.java**: Ana sayfanın nesnesi.
  - **CareersPage.java**: Kariyer sayfasının nesnesi.
  - **OpenPositionsPage.java**: Açık pozisyonlar sayfasının nesnesi.
  
- **test/**: Test senaryolarını içeren paket.
  - **BaseTest.java**: Tüm testler için temel sınıf.
  - **UseInsiderUITest.java**: Ana test sınıfı.

- **utilities/**: Yardımcı sınıfları içeren paket.
  - **BrowserUtils.java**: Tarayıcı ile ilgili yardımcı yöntemler.
  - **ConfigurationReader.java**: Yapılandırma dosyasını okumak için.
  - **Driver.java**: WebDriver yönetimi için.
  
- **logger/**: Test sonuçlarını kaydetmek için.
  - **TestResultLogger.java**: Test sonuçlarını kaydetmek için.

## 🛠️ Test Senaryoları

Aşağıda, gerçekleştirdiğimiz test senaryoları ve her birinin durumu belirtilmiştir:

| Test Adı                         | Açıklama                                                        | Durum  | Öncelik | Şiddet  |
|----------------------------------|-----------------------------------------------------------------|--------|---------|---------|
| AcceptCookiesTest                | Kullanıcının çerezleri kabul etme işlemi.                     | Passed | Yüksek  | Kritik  |
| CompanyButtonTest                | "Company" butonuna tıklama.                                   | Passed | Orta    | Normal  |
| CareersButtonTest                | "Careers" butonuna tıklama ve sayfa başlığının kontrolü.     | Passed | Yüksek  | Kritik  |
| FindYourDreamJobButtonTest       | "Find Your Dream Job" butonuna tıklama.                       | Passed | Orta    | Normal  |
| FilterByLocationTest             | Lokasyona göre filtreleme: "Istanbul, Turkey" seçimi.         | Passed | Yüksek  | Kritik  |
| FilterByDepartmentTest           | Departmana göre filtreleme: "Quality Assurance" seçimi.       | Passed | Yüksek  | Kritik  |
| ViewRoleTest                     | Filtreleme sonrasında "View Role" butonuna tıklama.           | Passed | Orta    | Normal  |

## 🏃‍♂️ Testi Çalıştırma

1. Projeyi klonlayın veya indirin.
2. Proje dizinine gidin ve terminal veya komut istemcisini açın.
3. Maven ile projeyi derleyin ve testleri çalıştırın:
   ```bash
   mvn clean test
