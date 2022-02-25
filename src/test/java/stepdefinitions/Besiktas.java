package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class Besiktas {
    @Given("kullanici besiktas sayfasina gider")
    public void kullanici_besiktas_sayfasina_gider() {

    }
    @Given("oyuncuismi icin arama yapar")
    public void oyuncuismi_icin_arama_yapar() {

    }
    @Then("sonuclarin oyuncuismi icerdigini test eder")
    public void sonuclarin_oyuncuismi_icerdigini_test_eder() {

    }
    @Given("Atiba icin arama yapar")
    public void atiba_icin_arama_yapar() {

    }
    @Then("sonuclarin Atiba icerdigini test eder")
    public void sonuclarin_atiba_icerdigini_test_eder() {

    }
    @Given("kullanici besitas sayfasina gider")
    public void kullanici_besitas_sayfasina_gider() {

    }
    @Given("kartal icin arama yapar")
    public void kartal_icin_arama_yapar() {

    }
    @Then("sonuclarin kartal icerdigini test eder")
    public void sonuclarin_kartal_icerdigini_test_eder() {

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String istenenVeri) {

    }
}
