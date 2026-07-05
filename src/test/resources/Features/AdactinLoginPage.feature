Feature: Validating the Adactin Login Web Application

  Background: 
    Given user on the login page

  Scenario: Validating the login page with valid creaditials
    When user enter the valid username and valid password
    And user click the login
    Then user verify the search hotel page displayed

  Scenario: Validating the login page with invalid creaditials
    When user enter the valid username and invalid password
    And user click the login
    Then user verify the error message displayed or not

  Scenario Outline: Validating the login page with invalid creaditials
    When user enter the invalid "<username>" and invalid "<password>"
    And user click the login
    Then user verify the error message displayed or not

    Examples: 
      | username            | password   |
      | greensomr@gmail.com | greens@omr |
      | omrgreens@gmail.com | omr@greens |
      | greens123@gmail.com | greens@123 |

  @searchhotel
  Scenario: Validation of search Hotel madatory fields
    When user enter the valid username and valid password
    And user click the login
    Then user verify the search hotel page displayed
    When user enter location and noOfRooms and checkInDate and checkOutDate and adultsperRoom and click the search button
      | location | noOfRooms | checkInDate | checkOutDate | adultsperRoom |
      | New York |         1 | 24/05/2025  | 25/05/2025   |             2 |
      | London   |         1 | 25/05/2025  | 26/05/2025   |             2 |
      | Paris    |         1 | 27/05/2025  | 28/05/2025   |             2 |
