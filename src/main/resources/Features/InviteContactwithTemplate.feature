Feature: Create New Invite for contact/s with loaded template

  Scenario: Invite existing contacts with loaded template w/o attachment
    Given Launch chrome browser for existing contact with loaded template
    When Open Fileinvite app to invite existing contact with loaded template
    When Enter login details to invite existing contact with loaded template
    When Click the Create New Invite button to invite existing contact with loaded template
    When Enter new invite details for existing contact with loaded template
    When Select a request without attachment for existing contact with loaded template
    Then Review and send invite for existing contact with loaded template
    Then View sent invite for existing contact with loaded template
    Then Logout from the Main App for existing contact with loaded template

  Scenario: Invite new contact with loaded template w/o attachment
    Given Launch chrome browser for existing contact with loaded template
    When Open Fileinvite app to invite new contact with loaded template
    When Enter login details to invite new contact with loaded template
    When Click the Create New Invite button to invite new contact with loaded template
    When Create new contact with loaded template
    When Enter new invite details for new contact with loaded template
    When Select requests without attachment for new contact with loaded template
    Then Review and send invite for new contact with loaded template
    Then View sent invite for new contact with loaded template
    Then Logout from the Main App for new contact with loaded template

  Scenario: Invite for existing and new contact with loaded template w/o attachment
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Create new contact
    When Enter new invite details with existing contact and loaded template
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite for existing and new contact with loaded template with attachments
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Create new contact
    When Enter new invite details with existing contact and loaded template
    When Edit requests and attach files
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite with loaded template and new request with attachments
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Create new contact
    When Enter new invite details with existing contact and loaded template
    When Edit requests and attach files
    When Create a request and attach files
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite with loaded template and delete requests
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Delete a request
    When Select request for group deletion
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite with loaded template and delete requests
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Delete a request
    When Select request for group deletion
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite with loaded template and change request assignment to everyone
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Select request for reassignment to everyone
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite with loaded template and change request assignment to selected contacts only
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Select request for reassignment to seleted contacts only
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite with loaded template and edit requests
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Edit selected requests
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite with loaded template and copy request
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Copy selected requests
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App

  Scenario: Invite loaded template for selected contact
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter new invite details with existing contact and loaded template
    When Select a contact for the invite
    Then Review and send invite
    Then View sent invite
    Then Logout from the Main App



