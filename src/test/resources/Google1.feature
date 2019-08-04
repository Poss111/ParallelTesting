Feature: I access Google and search for less

  Scenario Outline: I log onto Google and search for <searchItem>
    Given I navigate to 'https://google.com'
    When I type '<searchItem>' into the search box
    Then I will see '<searchItem>'

    Examples:
      | searchItem  |
      | Unicorn     |
      | Witcher   |
      | Video Games |
      | Pottery     |
      | Pasta       |
