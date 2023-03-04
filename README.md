# Appium-Calculator-Automation

---
This is a basic calculator app automation testing using Appium on an emulator device From Android Studio.


#### Scenario
1. Sum any of 2 numbers (9+5=14)
2. Subtraction any of 2 numbers (8-3=5)
3. Do multiply of Result of Sum and Subtraction (14*5=70)
4. Divide the result of multiplication with 10 (70/10=7)
5. Solve this series (100+200-100*2/5).


#### Tools & Frameworks
|                          |                              |
|--------------------------|------------------------------|
| Programming Language     | **Java**                     |
| Web Automation Tool      | **Selenium**                 |
| App Automation Framework | **Appium**                   |
| Gui Inpector             | **Appium Inspector**         |
| Testing Framework        | **TestNG**                   |
| Build Tool               | **Gradle**                   |
| IDE                      | **IntelliJ, Android Studio** |
| Reporting Framework      | **Allure**                   |

#### Setups
* Install Android Studio
* Install Appium
* Install Appium Inspector
* Install JDK 8+
* Set the below environment variables

```shell
  * JAVA_HOME
  * GRADLE_HOME
  * ALLURE_HOME
```
#### How to run the project
* Clone the repo
* Open terminal. Start the appium server using below command.
```
appium -p 4723
```
* Open android studio
* Create a new virtual device.
* Start the emulator
* In the root folder give the following command in terminal.
```
gradle clean test
```


#### How to generate allure report
1. Open cmd in the root folder
2.  Give the following commands

```
allure generate allure-results --clean -o allure-report
```
```
allure serve allure-results
```
---

### Generated Reports
![image](https://user-images.githubusercontent.com/41513761/222880768-dd6b9789-7c5c-4218-8c58-008a1f9f6c79.png)
![image](https://user-images.githubusercontent.com/41513761/222880797-2ce60a5a-1acf-4ea8-8a61-9cf424964190.png)
![image](https://user-images.githubusercontent.com/41513761/222880811-920b9297-73a9-45dc-b435-e66afc62a4a2.png)




#### Video Demonstration
https://user-images.githubusercontent.com/41513761/222881188-0eaa824a-5a58-4e15-9ef1-d1c812eb8bf5.mp4




#### Feedback
If you have any feedback, please reach out to me at md.mostafa.akash@gmail.com
