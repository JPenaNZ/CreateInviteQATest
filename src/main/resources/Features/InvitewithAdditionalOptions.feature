Feature: Invite Contacts with additional options

  Scenario: Invite contact with Dropbox cloud storage sync
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup Dropbox synchronization
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with Google Drive cloud storage sync
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup Google Drive synchronization
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with Box cloud storage sync
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup Box synchronization
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with OneDrive cloud storage sync
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup OneDrive synchronization
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with OneDrive Business cloud storage sync
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup OneDrive Business synchronization
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with 1 day before due reminder
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup 1 day before due reminder
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with 3 days before due reminder
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup 3 days before due reminder
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with 1 week before due reminder
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup 1 week before due reminder
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact without a due reminder
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup without a due reminder
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with every 2 days overdue reminder
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup every 2 days overdue reminder
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with every 4 days overdue reminder
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup every 4 days overdue reminder
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with every 7 days overdue reminder
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup every 7 days overdue reminder
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact without an overdue reminder
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup without an overdue reminder
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact that is password protected
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup password protected invite
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite contact with Reference ID
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details for existing contact
    When Setup Reference ID
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App