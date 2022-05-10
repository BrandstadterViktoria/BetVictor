# Bet Victor Tasks - QA Engineer

## Table of contents
* [Overview](#Overview)
* [Technologies](#technologies)
* [Launch](#Launch)

## Overview 
Tasks are respectively:
####  1. Test Automation task
Automate given scenarios on UI of a given webpage.
#### 2. Data  Processing Task
JSON and XML file to be loaded to memory, process data according to given parameters and retrieve modified content.
#### 3. API Automation Task
Create automated API test, according to given scenario and endpoints. 

## Technologies

- Java 1.8
- Cucumber
- Gherkin
- Selenium
- JUnit
- RestAssured


## Launch
Use Maven

Open a terminal window and run:

    mvn test

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `TaskRunner`
class tells JUnit to kick off Cucumber.
