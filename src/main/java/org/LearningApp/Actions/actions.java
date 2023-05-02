package org.LearningApp.Actions;

import org.LearningApp.PageObjects.LandingPage;
import org.openqa.selenium.*;

public class actions {

    WebDriver driver;

    public actions(WebDriver driver) {
        this.driver = driver;
    }

    public void createCourse() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.getAddCourseBtn().click();
        Dimension size = new Dimension(1536, 960);
        driver.manage().window().setSize(size);
        landingPage.getCourseTitleInputField().enterCourseTitle();
        landingPage.getCourseDescriptionInputField().enterCourseDescription();
        landingPage.getSelectCategoryDropdown().chooseCourseCategory();
        landingPage.getQualityAssuranceModule().chooseQualityAssurance();
//        landingPage.getPremiumCheckbox().choosePremiumCategory();
        landingPage.getLocation().chooseOffline();
        landingPage.getCourseLocation().chooseChooseUrl();
        landingPage.getAddCourse().click();


    }


    public void editCourse() {

        LandingPage landingPage = new LandingPage(driver);
        driver.findElement(By.xpath("//div[@class='MuiTypography-root MuiTypography-body1 MuiTypography-gutterBottom css-1cg8cx6']"))
                        .click();
        Dimension size = new Dimension(1536, 960);
        driver.manage().window().setSize(size);
        landingPage.getUpdatedCourse().click();

        WebElement Element = driver.findElement(By.xpath("//button[normalize-space()='Update Course']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript("arguments[0].scrollIntoView();", Element);
        Element.click();



    }



    public void deleteCourse() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.getCreatedCourse().click();
        landingPage.getDeleteBtn().click();
        landingPage.getConfirmDelete().click();

    }




}