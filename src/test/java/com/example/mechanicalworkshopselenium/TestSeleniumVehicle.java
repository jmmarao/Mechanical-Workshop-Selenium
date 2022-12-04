package com.example.mechanicalworkshopselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSeleniumVehicle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:/home/jones/Documents/repository/ifsp-projects/tc1/Mechanical-Workshop-Selenium/MechanicalWorkshopSelenium/src/views/index.html");
        driver.manage().window().maximize();

        // Acesso ao link do github
        driver.findElement(By.linkText("João Mateus Marão Domingues")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Veículos")).click();

        // Preencher campos do formulário
        WebElement inputLettersPlate = driver.findElement(By.id("lettersPlate"));
        inputLettersPlate.sendKeys("SC");
        Thread.sleep(2000);


        WebElement inputNumbersPlate = driver.findElement(By.id("numbersPlate"));
        inputNumbersPlate.sendKeys("000");
        Thread.sleep(2000);

        WebElement inputCityPlate = driver.findElement(By.id("cityPlate"));
        inputCityPlate.sendKeys("São Carlos");
        Thread.sleep(2000);

        WebElement inputStatePlate = driver.findElement(By.id("statePlate"));
        inputStatePlate.sendKeys("SP");
        Thread.sleep(2000);

        WebElement dropdown = driver.findElement(By.name("vehicleType"));
        if (dropdown.isEnabled() && dropdown.isDisplayed()) {
            Select option = new Select(dropdown);
            option.selectByIndex(2);
        }
        Thread.sleep(2000);

        WebElement inputBrand = driver.findElement(By.id("brand"));
        inputBrand.sendKeys("Peugeot");
        Thread.sleep(2000);

        WebElement inputModel = driver.findElement(By.id("model"));
        inputModel.sendKeys("RCZ");
        Thread.sleep(2000);

        WebElement inputYear = driver.findElement(By.id("year"));
        inputYear.sendKeys("2022");
        Thread.sleep(2000);

        WebElement inputDoors = driver.findElement(By.id("doors"));
        inputDoors.sendKeys("2");
        Thread.sleep(2000);

        WebElement inputSeats = driver.findElement(By.id("seats"));
        inputSeats.sendKeys("4");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/main/section/div/form/p[10]/input[3]")).click();
        Thread.sleep(2000);

        WebElement inputColor = driver.findElement(By.id("color"));
        inputColor.sendKeys("Yellow");
        Thread.sleep(2000);

        driver.findElement(By.name("Led")).click();
        driver.findElement(By.name("Leather")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
