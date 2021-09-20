
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;
import java.net.MalformedURLException;

public class TestCase extends BasePage {
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    MobileElement btn5;
    @FindBy(id="com.google.android.calculator:id/op_add")
    MobileElement btnPlus;
    @FindBy(id="com.google.android.calculator:id/digit_7")
    MobileElement btn7;
    @FindBy(id = "com.google.android.calculator:id/result_final")
    MobileElement btnResult;
    @FindBy(id = "com.google.android.calculator:id/digit_9")
    MobileElement btn9;
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    MobileElement btn1;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    MobileElement btnMinus;
    @FindBy(id = "com.google.android.calculator:id/eq")
    MobileElement btnEqual;
    @FindBy(id = "com.google.android.calculator:id/clr")
    MobileElement btnClear;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    MobileElement btnMulti;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    MobileElement btnDiv;
    @FindBy(id = "com.google.android.calculator:id/digit_8")
    MobileElement btn8;
    @FindBy(id = "com.google.android.calculator:id/digit_2")
    MobileElement btn2;

            public TestCase() throws IOException, InterruptedException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doSum() throws InterruptedException, MalformedURLException {
        btnClear.click();
        btn5.click();
        btnPlus.click();
        btn7.click();
        btnEqual.click();
        return  btnResult.getText();

    }
    public String doSubtraction(){
       btn9.click();
       btnMinus.click();
       btn1.click();
       btnEqual.click();
       return btnResult.getText();
    }
    public String doMultiplication(){
        btnClear.click();
        btn9.click();
        btnMulti.click();
        btn1.click();
        btnEqual.click();
        return btnResult.getText();
    }
    public String doDivision(){
        btnClear.click();
        btn8.click();
        btnDiv.click();
        btn2.click();
        btnEqual.click();
        return btnResult.getText();
    }

}