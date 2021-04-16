package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesafioCadastroPage extends BasePage {


    public DesafioCadastroPage(WebDriver driver) {
        super(driver);
    }

    //elementos
    @FindBy(id = "elementosForm:nome")
    private WebElement nomeTextField;

    @FindBy(id = "elementosForm:sobrenome")
    private WebElement sobrenomeTextField;

    @FindBy(xpath = "//*[@id=\"elementosForm:sexo:1\"]")
    private WebElement sexoRadioButton;

    @FindBy(id = "elementosForm:comidaFavorita:0")
    private WebElement comidaFavoritaCarne;

    @FindBy(id = "elementosForm:comidaFavorita:1")
    private WebElement comidaFavoritaFrango;

    @FindBy(id = "elementosForm:comidaFavorita:2")
    private WebElement comidaFavoritaPizza;

    @FindBy(id = "elementosForm:comidaFavorita:3")
    private WebElement comidaFavoritaVegetariano;

    @FindBy(xpath = "//*[@id=\"elementosForm:escolaridade\"]/option[7]")
    private WebElement mestrado;

    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[3]")
    private WebElement corrida;

    @FindBy(id = "elementosForm:sugestoes")
    private WebElement sugestoesTextField;

    @FindBy(id = "elementosForm:cadastrar")
    private WebElement cadastrarButton;

    //métodos
    public DesafioCadastroPage preencherNome(String nome) {
        nomeTextField.sendKeys(nome);
        return this;
    }

    public DesafioCadastroPage preencherSobrenome(String sobrenome) {
        sobrenomeTextField.sendKeys(sobrenome);
        return this;
    }

    public DesafioCadastroPage marcarSexo() {
        sexoRadioButton.click();
        return this;
    }

    public DesafioCadastroPage marcarCarne() {
        comidaFavoritaCarne.click();
        return this;
    }

    public DesafioCadastroPage marcarFrango() {
        comidaFavoritaFrango.click();
        return this;
    }

    public DesafioCadastroPage marcarPizza() {
        comidaFavoritaPizza.click();
        return this;
    }

    public DesafioCadastroPage marcarVegetariano() {
        comidaFavoritaVegetariano.click();
        return this;
    }

    public DesafioCadastroPage selecionarMestrado() {
        mestrado.click();
        return this;
    }

    public DesafioCadastroPage clicarCorrida() {
        corrida.click();
        return this;
    }

    public DesafioCadastroPage preencherSugestoes(String sugestoes) {
        sugestoesTextField.sendKeys(sugestoes);
        return this;
    }

    public DesafioCadastroPage clicarCadastrar() {
        cadastrarButton.click();
        return this;
    }

}
