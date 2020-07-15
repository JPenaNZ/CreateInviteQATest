Feature: Create New Invite for new contact

  Scenario: Invite for new contact due today w/o attachment
    Given Launch chrome browser to invite a new contact
    When Open Fileinvite app to invite a new contact
    When Enter login details to invite new contact
    When Click the Create New Invite button for new contact
    When Enter new invite details due today for new contact
    When Create new contact
    When Create new request without attachment for new contact
    Then Review and send invite for new contact
    Then View sent invite for new contact
    Then Logout from the Main App after new contact invite

  Scenario: Invite for new contact not due today w/o attachment
    Given Launch chrome browser to invite a new contact
    When Open Fileinvite app to invite a new contact
    When Enter login details to invite new contact
    When Click the Create New Invite button for new contact
    When Enter new invite details not due today for new contact
    When Create new contact
    When Create new request without attachment for new contact
    Then Review and send invite for new contact
    Then View sent invite for new contact
    Then Logout from the Main App after new contact invite

  Scenario: Invite for new contact with attachment
    Given Launch chrome browser to invite a new contact
    When Open Fileinvite app to invite a new contact
    When Enter login details to invite new contact
    When Click the Create New Invite button for new contact
    When Enter new invite details not due today for new contact
    When Create new contact
    When Create new request with attachment for new contact
    Then Review and send invite for new contact
    Then View sent invite for new contact
    Then Logout from the Main App after new contact invite

  Scenario: Invite for new contacts with attachment
    Given Launch chrome browser to invite a new contact
    When Open Fileinvite app to invite a new contact
    When Enter login details to invite new contact
    When Click the Create New Invite button for new contact
    When Enter new invite details not due today for new contact
    When Create new contacts
    When Create new request with attachment for new contact
    Then Review and send invite for new contact
    Then View sent invite for new contact
    Then Logout from the Main App after new contact invite