Feature: Review invite and edit information

  Scenario: Review and edit invite information
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Review invite
    Then Edit invite information
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Review and edit attached contacts
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Review invite
    Then Edit attached contacts
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Review and edit requests
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Review invite
    Then Edit requests
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Review and edit additional options
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Review invite
    Then Edit additional options
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Review and edit all invite information
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Review invite
    Then Edit all invite information
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App