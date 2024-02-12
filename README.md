# entrata-assignment

## Description
In this project I have automated the two test cases for a website called Entrata.com. For automating that test cases I have used the selenium-webdriver tool/api. Also I have taken the help of maven and testng framework. To write the code I have prepared the java language.


## Technology used to automate the test cases
### selenium-webriver  -> version 4.17.0
      To perform different actions on webpage like clicking buttons, invoking browser, closing browser and finding the webelements i have       used different methods provided by the selenium. 
      
### WebDriverManager jar -> version 5.6.3
    To dowload required browser driver and append it into the project automatically I have used WEbDriverManager jar and the setup()          method in my project. If we have to invoke the different browser without webdriver manager then we have to download th edrivers           manually ans update it to the projecet also we need the update that whenever new version relesed by the browser. WebDriver manager       reduces this efforts of tester. 
    
### testng -> version 7.8.0
    Testng is the framework which provide the different @annotation to execute the methods, classes, suit ets. In this projecet I have        used  @BeforeClass, @AfterClass, @Parameters, @Test annotations apart from this Testng also provides @dataprovider, @BeforeMethod         @aftermethod etc annotations and few keyword that makes the executaion flexible that keywords are priority, invocationCount, enable=     true/false. 
    Apart from this testng pprovides two assertion classes for verify whether test case is passed of failed, that are HardAsser and           softAsser. I have used softassert in one of the test case.
    
### log4j -> version 1.2.17
    This library helps to write our customised logs which will help us to debug the issue.

### Maven
      Maven provide as a pom.xml file. That file help us to store all the required dependencies for th eproject. We ca update thet             dependecines without downloading and attaching that manually. 
      
### java -> version 1.7

### IDE -> Eclips

## Installation
1. open repository using link https://github.com/Sidhnath96/entrata-assignment.git
2. create a new file on your machine and open it
3. open gitbash to run follong git command
4. git init
5. git clone https://github.com/Sidhnath96/entrata-assignment.git
6. git pull origin main
7. after pulling complete code open the eclips ide
8. right click on project and import the existing project
9. run the project using testng.xml file 


## Test Cases
  ### Test Case 1: Validate that the links present on the homepage of entrata.com are broken
                As we can observe the wesite contains many links that all has a perticular target page. I decided to test all the links                   present on homepage whether each link has its target page. I have captured the links into the pom class. Then I have made                 an object of pom class and access the links and iterate it using for each loop. Before that I have created a baseclass to                 store the common methods which will required for all the test cases.To automate this case I take help of HttpConnection                   class and openconnection() method to make the successful connection with server and capture the response code frome the                   server. capturing response code I have used a conditional statement (if statement) to verify the successful output. Then                 I have printed the broken links into consol.
                
                
  ### Test Case 2: Validate few buttons whether they are navigate to the right page
                The website contains several buttons so I decided to test the navigation of that buttons. I have selected four butttons                   on the webpage and performed the click() action through selenium and get the title of the respective page and verify that                 whether it is navigated to correcet page. For verifying it i have used the conditional if statement along with assert                     methods. I have used softAssert in this test case so that even one of the button navigates wrong page, my test case                       should not be stop. I have used javaScript interface to scroll the webpage and click to the button. 



## Contact
For questions or support, please contact sidhpakhare96@gmail.com.
