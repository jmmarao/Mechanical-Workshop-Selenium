package com.example.mechanicalworkshopselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSeleniumMechanical {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:/home/jones/Documents/repository/ifsp-projects/tc1/Mechanical-Workshop-Selenium/MechanicalWorkshopSelenium/src/views/index.html");
        driver.manage().window().maximize();

        // Acesso ao link do github
        driver.findElement(By.linkText("Charles Fernandes de Souza")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Mecânicos")).click();

        // Preencher campos do formulário
        WebElement inputFirstNameMechanical = driver.findElement(By.id("firstNameMechanical"));
        inputFirstNameMechanical.sendKeys("Epaminondas");
        Thread.sleep(2000);

        WebElement inputLastNameMechanical = driver.findElement(By.id("lastNameMechanical"));
        inputLastNameMechanical.sendKeys("Crispim");
        Thread.sleep(2000);

        WebElement inputBirthDateMechanical = driver.findElement(By.id("birthDateMechanical"));
        inputBirthDateMechanical.sendKeys("30/10/1990");
        Thread.sleep(2000);

        driver.findElement(By.name("Woman")).click();
        driver.findElement(By.name("Nonbinary")).click();
        Thread.sleep(3000);

        WebElement inputEmailMechanical = driver.findElement(By.id("emailMechanical"));
        inputEmailMechanical.sendKeys("epaminondas@email.com; epacrispim@email.com");
        Thread.sleep(2000);

        WebElement inputTelephoneMechanical = driver.findElement(By.id("telephoneMechanical"));
        inputTelephoneMechanical.sendKeys("(99)99999-9999");
        Thread.sleep(2000);

        WebElement dropdown = driver.findElement(By.name("specialtyType"));
        if (dropdown.isEnabled() && dropdown.isDisplayed()) {
            Select option = new Select(dropdown);
            option.selectByIndex(4);
        }
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/main/section/div/form/p[6]/input[1]")).click();
        Thread.sleep(2000);

        WebElement inputSalaryMechanical = driver.findElement(By.id("salaryMechanical"));
        inputSalaryMechanical.sendKeys("R$ 3.719,02");
        Thread.sleep(2000);

        driver.quit();
    }
}
