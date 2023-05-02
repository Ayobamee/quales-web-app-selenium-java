package org.LearningApp.PageComponents;

import org.LearningApp.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class updatedCourse extends AbstractComponent {
    WebDriver driver;
     By updatedCourse = By.xpath("//button[normalize-space()='Edit']");

    public updatedCourse(WebDriver driver, By updatedCourse) {
        super(driver, updatedCourse);
    }

    public void click() {
        findElement(updatedCourse).click();
    }

}

