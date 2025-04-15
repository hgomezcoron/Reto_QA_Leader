
#language:en

@SampleApp
Feature: Login functionality on UITestingPlayground

  @Login
  Scenario: Successful Login
    Given the user is on the login page SampleAPP
    And the user enters username TestUser and password pwd
    When clicks the login button
    Then the message should say Welcome, TestUser

  @InvalidPassword
  Scenario: Login with Invalid Password
    Given the user is on the login page SampleAPP
    And the user enters username TestUser and password jdgfjksafjas
    When clicks the login button
    Then the message should say Invalid username/password

  @EmptyFields
  Scenario: Login with Empty Fields
    Given the user is on the login page SampleAPP
    And the user enters username - and password -
    When clicks the login button
    Then the message should say Invalid username/password

  @OnlyUsername
  Scenario: Login with Only Username
    Given the user is on the login page SampleAPP
    And the user enters username TestUser and password -
    When clicks the login button
    Then the message should say Invalid username/password

  @OnlyPassword
  Scenario: Login with Only Password
    Given the user is on the login page SampleAPP
    And the user enters username - and password pwd
    When clicks the login button
    Then the message should say Invalid username/password

  @Logout
  Scenario: Logout After Successful Login
    Given the user successfully login with username TestUser and password pwd
    When the user clicks logout button
    Then the message should say User logged out