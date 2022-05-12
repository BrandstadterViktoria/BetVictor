package org.betvictor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartClientWebPage {

    WebDriver driver = new ChromeDriver();

    public void userNavigatesWebpage() {
        System.setProperty("webdriver.chrome.driver","/home/bviki/Selenium/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://facebook.com");
    }
}
