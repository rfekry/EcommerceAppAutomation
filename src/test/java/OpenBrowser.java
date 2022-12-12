import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] args) throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver chDriver = new ChromeDriver();
        chDriver.navigate().to("https://demo.nopcommerce.com/");
        chDriver.manage().window().maximize();
        Thread.sleep(3000);

        //click on register menu item
        chDriver.findElement(By.className("ico-register")).click();

        // fill in registration details
        //choose gender:radioButton selection
        chDriver.findElement(By.id("FirstName")).sendKeys("Randa");
        chDriver.findElement(By.id("LastName")).sendKeys("Fekry");
        //Add DOB: Dropdown selection
        chDriver.findElement(By.id("Email")).sendKeys("randaf333@hotmail.com");
        Thread.sleep(2000);
        chDriver.findElement(By.id("Password")).sendKeys("Hello123");
        chDriver.findElement(By.id("ConfirmPassword")).sendKeys("Hello123");
        Thread.sleep(2000);
        chDriver.findElement(By.id("register-button")).click();
        chDriver.findElement(By.className("buttons")).click();





        //login
//        chDriver.findElement(By.className("ico-login")).click();
//        chDriver.findElement(By.className("email")).sendKeys("");
//        chDriver.findElement(By.id("Password")).sendKeys("");



        //search for items
        chDriver.findElement(By.id("small-searchterms")).click();
        chDriver.findElement(By.id("small-searchterms")).sendKeys("necklace");
        chDriver.findElement(By.className("button-1")).click();

        Thread.sleep(5000);

        chDriver.quit();
    }
}
