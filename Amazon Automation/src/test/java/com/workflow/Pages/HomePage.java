package com.workflow.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.workflow.Pages.Navigate;

public class HomePage {
    WebDriver driver;

    // Locators for different elements on the home page
    By searchBox = By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']");
    By searchButton = By.xpath("//input[@value='Go']");

    public void searchForProduct(String productName) {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.clear();
        searchInput.sendKeys(productName);
        driver.findElement(searchButton).click();
    }
}
