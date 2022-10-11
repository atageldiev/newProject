Feature: Create new user functionality
  Background: Land to Home page
    Given Go to login page
    Given Enter "alibek" in userName or Email input field
    And Enter "jantay1207" in password input field
    When user click on login button
    Then user should successfully logged in

    Scenario: Positive: Create new user

      Given user should click Add user button in admin Home page
      Then user should be in add user page
#      And verify following field names are displayed
#        | First Name | Last Name | Email Address | User Name | Password | Bio | User type | Time zone | Language |
#      And enter following data to create new user
#        | firstName | lastName | emailAddress | userName | password |
#      | Elon      | Musk     | musk@gmail.com | eloan  | veryhappy |
#      | Leo       | Dicaprio | leo@gmail.com  | leo    | qwerty    |

      Then user should see input fields
      And user create new user with mock data



