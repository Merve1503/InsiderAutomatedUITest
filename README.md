# Insider UI Test Automation

This repository contains a test automation project developed to automate the user interface of the Insider website. The tests are performed using Selenium, JUnit, and the Page Object Model (POM) structure. The objective is to validate the user experience and test the functionality of the site.

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
  - **BrowserUtils.java**: Utility methods related to the browser.
  - **ConfigurationReader.java**: For reading configuration files.
  - **Driver.java**: For managing WebDriver.
  
- **logger/**: For logging test results.
  - **TestResultLogger.java**: To log test results.

## 🛠️ Test Scenarios

Below are the **test scenarios** performed throughout the process. Each scenario covers actions related to different pages and interactions.

| Test Scenario                    | Description                                                                                      |
|----------------------------------|--------------------------------------------------------------------------------------------------|
| AcceptCookiesTest                | User accepts cookies.                                                                            |
| CompanyButtonTest                | User clicks the "Company" button and is redirected to the respective page.                       |
| CareersButtonTest                | User clicks the "Careers" button and is redirected to the careers page, with the page title verified. |
| FindYourDreamJobButtonTest       | User clicks the "Find Your Dream Job" button and is redirected to the open positions page.        |
| FilterByLocationTest             | User filters by location: "Istanbul, Turkey".                                                    |
| FilterByDepartmentTest           | User filters by department: "Quality Assurance".                                                 |
| ViewRoleTest                     | User clicks the "View Role" button after filtering positions.                                    |

## 🧪 Test Cases

Here are the detailed **test steps** for each scenario, explaining how they are performed and the expected results.

### AcceptCookiesTest
- **Step 1**: The user opens the website.
- **Step 2**: The user clicks the accept cookies button.
- **Expected Result**: Cookies are accepted, and the website becomes ready for use.

### CompanyButtonTest
- **Step 1**: The user finds the "Company" button on the home page.
- **Step 2**: The user clicks the button and is redirected to the Company page.
- **Expected Result**: The user is correctly redirected to the Company page.

### CareersButtonTest
- **Step 1**: The user finds the "Careers" button on the home page.
- **Step 2**: The user clicks the button, and the page title is verified.
- **Expected Result**: The page title is correct, and the user is redirected to the Careers page.

### FilterByLocationTest
- **Step 1**: The user selects the "Istanbul, Turkey" location from the filter menu.
- **Expected Result**: Only positions in Istanbul are displayed.

### FilterByDepartmentTest
- **Step 1**: The user filters by the "Quality Assurance" department.
- **Expected Result**: Positions in the Quality Assurance department are listed.

### ViewRoleTest
- **Step 1**: After filtering, the user selects a position and clicks the "View Role" button.
- **Expected Result**: Details of the selected role are displayed.

## 🏃‍♂️ Running the Tests

1. Clone or download the project.
2. Navigate to the project directory and open a terminal or command prompt.
3. Compile and run the tests with Maven:
   ```bash
   mvn clean test

