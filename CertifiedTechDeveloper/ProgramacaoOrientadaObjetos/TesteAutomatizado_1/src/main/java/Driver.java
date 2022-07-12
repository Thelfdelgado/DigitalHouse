import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement user = driver.findElement(By.id("user-name"));
        user.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();

        WebElement cart = driver.findElement(By.cssSelector("#shopping_cart_container > a"));
        cart.click();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        WebElement name = driver.findElement(By.id("first-name"));
        name.sendKeys("Luiz");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Delgado");

        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("123123");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

    }
}
