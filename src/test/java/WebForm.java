import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebForm extends PageObject{

    private final String FIRST = "your_login";
    private final String SECOND = "your_password";

    @FindBy(xpath = "/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[1]/div/label/input")
    private WebElement first_name;

//    private WebElement first_name= driver.findElement(By.name("username"));

    @FindBy(xpath = "/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[2]/div/label/input")
    private WebElement last_name;

  //  private WebElement last_name= driver.findElement(By.name("password"));

    @FindBy(xpath = "/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[3]")
    private WebElement submit_button;

//    private WebElement submit_button= driver.findElement(By.xpath("//button[text()='Log In']"));


    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST);
    }

    public void enterLastName(){
        this.last_name.sendKeys(SECOND);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }


}