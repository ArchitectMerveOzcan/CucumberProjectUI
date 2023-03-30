package pages;

import Utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import stepDefinitions.Hooks;
@Slf4j
public abstract class BasePage extends Hooks {
    public BasePage() {
        PageFactory.initElements(Driver.get(env), this);
    }


    public void clickWithWait(WebElement element){
        long start = System.currentTimeMillis();
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        log.info("Clicked in {}ms", System.currentTimeMillis() - start);
    }


    public void sleep(int millisec) throws InterruptedException {
        Thread.sleep(millisec);
    }

    public void sendKey(WebElement element, String input){
        long start = System.currentTimeMillis();
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(input);
        log.info("Clicked in {}ms", System.currentTimeMillis() - start);
    }

    public boolean isDisplayed(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
}
