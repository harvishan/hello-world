Feature:  Search Text "CingleVue"
  As a user I should be able get more than 10 search results for keyword "CingleVue"

  @HomePageSearch
  Scenario: As a user I should be able get more than 10 search results for keyword "CingleVue"
    Given I am in CingleVue Homepage
    When I enter "CingleVue" as the keyword and submit
    Then I should see more than ten results