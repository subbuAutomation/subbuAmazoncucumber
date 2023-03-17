Feature:Login
  @login
  @tag1
    Scenario Outline: Login to the jaypore
    When i click on sign in
    And i entered email as '<email>' and password as'<password>'
    And i clicked on sign in
    Then home page is displayed
    Examples:
      | email | password |
      |testabfrlrupam@gmail.com|B@rupam9|


