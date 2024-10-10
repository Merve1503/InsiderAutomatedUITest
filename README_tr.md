# Insider UI Test Automation

Bu depo, Insider web sitesinin kullanıcı arayüzünü otomatik test etmek için geliştirilmiş bir test otomasyon projesidir. Testler, Selenium, JUnit ve Page Object Model (POM) yapısını kullanarak gerçekleştirilmiştir. Amaç, kullanıcı deneyimini doğrulamak ve işlevselliği test etmektir.

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

Aşağıda test süreci boyunca gerçekleştirilen **test senaryoları** belirtilmiştir. Her senaryoda farklı sayfalara ve işlemlere yönelik adımlar mevcuttur.

| Test Senaryosu                   | Açıklama                                                                                          |
|----------------------------------|---------------------------------------------------------------------------------------------------|
| AcceptCookiesTest                | Kullanıcı çerezleri kabul eder.                                                                   |
| CompanyButtonTest                | Kullanıcı "Company" butonuna tıklar ve ilgili sayfaya yönlendirilir.                             |
| CareersButtonTest                | Kullanıcı "Careers" butonuna tıklar ve ilgili sayfaya yönlendirilir, sayfa başlığı kontrol edilir. |
| FindYourDreamJobButtonTest       | Kullanıcı "Find Your Dream Job" butonuna tıklar ve açık pozisyonlar sayfasına gider.              |
| FilterByLocationTest             | Kullanıcı, "Istanbul, Turkey" lokasyonunu filtreler.                                              |
| FilterByDepartmentTest           | Kullanıcı, "Quality Assurance" departmanını filtreler.                                            |
| ViewRoleTest                     | Filtrelenen pozisyonlar için "View Role" butonuna tıklar.                                         |

## 🧪 Test Case'ler

Her senaryo için detaylı **test adımları** aşağıda verilmiştir. Bu adımlar, senaryoların nasıl gerçekleştirileceğini ve beklenen sonuçları açıklar.

### AcceptCookiesTest
- **Adım 1**: Kullanıcı siteyi açar.
- **Adım 2**: Çerezleri kabul etme butonuna tıklar.
- **Beklenen Sonuç**: Çerezler kabul edilir ve site kullanıma hazır hale gelir.

### CompanyButtonTest
- **Adım 1**: Kullanıcı ana sayfada "Company" butonunu bulur.
- **Adım 2**: Butona tıklar ve Company sayfasına yönlendirilir.
- **Beklenen Sonuç**: Kullanıcı, Company sayfasına doğru şekilde yönlendirilir.

### CareersButtonTest
- **Adım 1**: Kullanıcı ana sayfada "Careers" butonunu bulur.
- **Adım 2**: Butona tıklar, sayfa başlığı doğrulanır.
- **Beklenen Sonuç**: Sayfa başlığı doğru ve kullanıcı Careers sayfasına yönlendirilir.

### FilterByLocationTest
- **Adım 1**: Kullanıcı "Istanbul, Turkey" lokasyonunu filtreleme menüsünden seçer.
- **Beklenen Sonuç**: Sadece İstanbul lokasyonundaki pozisyonlar gösterilir.

### FilterByDepartmentTest
- **Adım 1**: Kullanıcı "Quality Assurance" departmanını filtreler.
- **Beklenen Sonuç**: Quality Assurance departmanına ait pozisyonlar listelenir.

### ViewRoleTest
- **Adım 1**: Kullanıcı filtreleme sonrası bir pozisyonu seçip "View Role" butonuna tıklar.
- **Beklenen Sonuç**: Seçilen pozisyona ait detaylar görüntülenir.

## 🏃‍♂️ Testleri Çalıştırma

1. Projeyi klonlayın veya indirin.
2. Proje dizinine gidin ve terminal veya komut istemcisini açın.
3. Maven ile projeyi derleyin ve testleri çalıştırın:
   ```bash
   mvn clean test

