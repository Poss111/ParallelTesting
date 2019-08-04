Feature: I access Google and search for more

  Scenario Outline: I log onto Google and search for <searchItem>
    Given I navigate to 'https://google.com'
    When I type '<searchItem>' into the search box
    Then I will see '<searchItem>'

    Examples:
      | searchItem  |
      | Plumbing     |
      | Groceries   |
      | Video Games |
      | Pottery     |
      | Pasta       |
