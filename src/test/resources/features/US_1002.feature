@bjk

Feature: US1001_besiktas_team

  Scenario: Tc01 besiktas Player Search


    Given kullanici "istenilen" sayfasina gider
    And "oyuncuismi" icin arama yapar
    Then sonuclarin oyuncuismi icerdigini test eder
    Given kullanici "bjk" sayfasina gider
    And "Atiba" icin arama yapar
    Then sonuclarin Atiba icerdigini test eder
    Given kullanici "istenen" sayfasina gider
    And kartal icin arama yapar
    Then sonuclarin kartal icerdigini test eder
    And sayfayi kapatir
    And tekrar kapatilir
    Given ve tekrar