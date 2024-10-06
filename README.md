# Insider UI Test Automation

This repository is a test automation project developed to test the user interface of the Insider website. The tests are conducted using Selenium, JUnit, and the Page Object Model (POM) structure. The goal is to verify the user experience and functionality.

## 📁 Project Structure

- **pages/**: Package containing page objects.
  - **BasePage.java**: Base class for all pages.
  - **HomePage.java**: Object for the home page.
  - **CareersPage.java**: Object for the careers page.
  - **OpenPositionsPage.java**: Object for the open positions page.
  
- **test/**: Package containing test scenarios.
  - **BaseTest.java**: Base class for all tests.
  - **UseInsiderUITest.java**: Main test class.

- **utilities/**: Package containing utility classes.
  - **BrowserUtils.java**: Helper methods related to the browser.
  - **ConfigurationReader.java**: For reading the configuration file.
  - **Driver.java**: For WebDriver management.
  
- **logger/**: For logging test results.
  - **TestResultLogger.java**: For logging test results.

## 🛠️ Test Scenarios

Below are the test scenarios we have conducted along with their statuses:

| Test Name                      | Description                                                    | Status  | Priority | Severity  |
|--------------------------------|---------------------------------------------------------------|---------|----------|-----------|
| AcceptCookiesTest              | Accepting cookies by the user.                               | Passed  | High     | Critical  |
| CompanyButtonTest              | Clicking the "Company" button.                               | Passed  | Medium   | Normal    |
| CareersButtonTest              | Clicking the "Careers" button and verifying the page title. | Passed  | High     | Critical  |
| FindYourDreamJobButtonTest     | Clicking the "Find Your Dream Job" button.                   | Passed  | Medium   | Normal    |
| FilterByLocationTest           | Filtering by location: selecting "Istanbul, Turkey."         | Passed  | High     | Critical  |
| FilterByDepartmentTest         | Filtering by department: selecting "Quality Assurance."       | Passed  | High     | Critical  |
| ViewRoleTest                   | Clicking the "View Role" button after filtering.             | Passed  | Medium   | Normal    |

## 🏃‍♂️ Running the Tests

1. Clone or download the project.
2. Navigate to the project directory and open a terminal or command prompt.
3. Build the project and run the tests with Maven:
   ```bash
   mvn clean test
