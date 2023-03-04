package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static setup.Setup.PACKAGE_ID;

public class CalScreen {

    @FindBy(id = PACKAGE_ID + ":id/digit_0")
    WebElement btn0;
    @FindBy(id = PACKAGE_ID + ":id/digit_1")
    WebElement btn1;
    @FindBy(id = PACKAGE_ID + ":id/digit_2")
    WebElement btn2;
    @FindBy(id = PACKAGE_ID + ":id/digit_3")
    WebElement btn3;
    @FindBy(id = PACKAGE_ID + ":id/digit_4")
    WebElement btn4;
    @FindBy(id = PACKAGE_ID + ":id/digit_5")
    WebElement btn5;
    @FindBy(id = PACKAGE_ID + ":id/digit_6")
    WebElement btn6;
    @FindBy(id = PACKAGE_ID + ":id/digit_7")
    WebElement btn7;
    @FindBy(id = PACKAGE_ID + ":id/digit_8")
    WebElement btn8;
    @FindBy(id = PACKAGE_ID + ":id/digit_9")
    WebElement btn9;

    @FindBy(id = PACKAGE_ID + ":id/op_add")
    WebElement btnPlus;
    @FindBy(id = PACKAGE_ID + ":id/op_sub")
    WebElement btnMinus;
    @FindBy(id = PACKAGE_ID + ":id/op_mul")
    WebElement btnMul;
    @FindBy(id = PACKAGE_ID + ":id/op_div")
    WebElement btnDiv;

    @FindBy(id = PACKAGE_ID + ":id/result_final")
    WebElement resultFinal;
    @FindBy(id = PACKAGE_ID + ":id/eq")
    WebElement btnEql;
    @FindBy(id = PACKAGE_ID + ":id/clr")
    public WebElement btnClear;

    public CalScreen(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String doSum() {
        btn9.click();
        btnPlus.click();
        btn5.click();
        btnEql.click();
        return resultFinal.getText();
    }

    public String doSub() {
        btn8.click();
        btnMinus.click();
        btn3.click();
        btnEql.click();
        return resultFinal.getText();
    }

    public String doMul() {
        btn1.click();
        btn4.click();
        btnMul.click();
        btn5.click();
        btnEql.click();
        return resultFinal.getText();
    }

    public String doDiv() {
        btn7.click();
        btn0.click();
        btnDiv.click();
        btn1.click();
        btn0.click();
        btnEql.click();
        return resultFinal.getText();
    }

    public String solveSeries(){
        btn1.click();
        btn0.click();
        btn0.click();

        btnPlus.click();

        btn2.click();
        btn0.click();
        btn0.click();

        btnMinus.click();

        btn1.click();
        btn0.click();
        btn0.click();

        btnMul.click();

        btn2.click();

        btnDiv.click();

        btn5.click();

        btnEql.click();
        return resultFinal.getText();
    }
}
