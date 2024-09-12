For UI Web Browser Automation, we can efficiently use the SELENIUM-CUCUMBER (Maven) framework using PageObject Model Approach. In this project we have covered how we can automate the application with different feature files writing method.
We can structure the project in a format like below:

1. Maven (pom.xml): Please find the sample of POM.xml file with dependencies for Selenium, cucumber and reporting
   ![image](https://github.com/user-attachments/assets/d19121ad-a620-4e02-ad9f-51a93adf994a)

2. Feature Files: These are the structured way of writing the test steps and executing in the same flow. In this project we have included different way of writing test scenarios as below:
   a. Basic Scenario:
   ![image](https://github.com/user-attachments/assets/a95803eb-94dd-43c3-b339-c99792a4eca1)
   b. Scenarios using Background:
   ![image](https://github.com/user-attachments/assets/e7f9d8c8-8010-482f-aafa-f79e8daa923d)
   c. Scenario Outline
   ![image](https://github.com/user-attachments/assets/c0806030-047f-4700-b253-01bc06525ace)

3. PageObjects: These defines the webElement details defining each page or functionality. These webElements are specified using different WebElement Locators such as ByID, ByName, ByXpath, ByCssSelector,etc used etensively.Page Objects can also define the method specifying the details.
   ![image](https://github.com/user-attachments/assets/113202c3-9946-4503-8c9e-7c6f28f4c0c7)

4. StepDefinitions: These java classes are used to bind the WebElements with Featurefiles by calling multiple methods to action according to test steps and functionality.
   ![image](https://github.com/user-attachments/assets/32a13afe-899b-4090-950d-1177e6680e27)

5. Utilities: These involves the other frequently required methods and elements over all the project. Methods such as Click(), SendKeys(),Explicit wait, Dropdowndata selections are predefined and we can call these methods withing any stepdefinition file by Extending the Base Class.
   ![image](https://github.com/user-attachments/assets/ebc546e7-9245-4ba3-960f-c7f72eaaff54)

6. TestRunner: TestRunner.java helps running all the feature files at once binding the Stepdefinition with feature files and report generation format can be provided.

7. Running tests and generating report
  Maven will execute the Cucumber tests, and Cucumber will generate the reports. You can find the generated Cucumber report in the target/jsonReports/cucumber.json directory.
  ![image](https://github.com/user-attachments/assets/22411a0c-9ea5-4c47-af77-dd6ac907dd82)
  ![image](https://github.com/user-attachments/assets/02601c44-e36f-44a5-acdf-88a71cbf2534)






   

   
