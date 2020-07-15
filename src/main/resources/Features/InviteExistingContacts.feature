Feature: Create New Invite for existing contact/s

  @InviteExistingContactsTests
  Scenario: Invite for existing contact due today w/o attachment
    Given Launch chrome browser to invite existing contact
    When Open Fileinvite app to invite existing contact
    When Enter login details to invite existing contact
    When Click the Create New Invite button to invite existing contact
    When Enter new invite details for existing contact due today
    When Create new request without attachment for existing contact
    Then Review and send invite for existing contact
    Then View sent invite for existing contact
    Then Logout from the Main App after existing contact invite

  @InviteExistingContactsTests
  Scenario: Invite for existing contact not due today w/o attachment
    Given Launch chrome browser to invite existing contact
    When Open Fileinvite app to invite existing contact
    When Enter login details to invite existing contact
    When Click the Create New Invite button to invite existing contact
    When Enter new invite details for existing contact not due today
    When Create new request without attachment for existing contact
    Then Review and send invite for existing contact
    Then View sent invite for existing contact
    Then Logout from the Main App after existing contact invite

  @InviteExistingContactsTests
  Scenario: Invite for existing contacts w/o attachment
    Given Launch chrome browser to invite existing contact
    When Open Fileinvite app to invite existing contact
    When Enter login details to invite existing contact
    When Click the Create New Invite button to invite existing contact
    When Enter new invite details for existing contacts
    When Create new request without attachment for existing contact
    Then Review and send invite for existing contact
    Then View sent invite for existing contact
    Then Logout from the Main App after existing contact invite

  Scenario: Invite for existing contact with attachment
    Given Launch chrome browser to invite existing contact
    When Open Fileinvite app to invite existing contact
    When Enter login details to invite existing contact
    When Click the Create New Invite button to invite existing contact
    When Enter new invite details for existing contacts
    When Create new request with attachment for existing contact
    Then Review and send invite for existing contact
    Then View sent invite for existing contact
    Then Logout from the Main App after existing contact invite