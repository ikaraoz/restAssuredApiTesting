Feature: Cyclos login

  Scenario Outline: Demo can login to their account
    Given demo uses "<userName>" and "<password>"
    When demo makes a get request to "https://demo.cyclos.org/api/demo/addresses"
    Then the status code is <statusCode>

    Examples:
      | userName | password | statusCode |
      | demo     | 1234     | 200        |
      | demo     | 12345    | 401        |
      | demoo    | 1234     | 401        |
