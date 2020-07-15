Feature: Display errors for negative testing for Create Invite

  Scenario: Review invite w/o request details
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter complete invite details
    Then Review invite unsuccessfully with error message

  Scenario: Review invite w/o request details and missing invite subject
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter invite details with missing invite subject
    Then Review invite unsuccessfully with error message

  Scenario: Review invite w/o request details and missing due
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter invite details with missing invite subject
    Then Review invite unsuccessfully with error message

  Scenario: Create request w/o request title
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter complete invite details
    Then Create request unsuccessfully with error message

  Scenario: Review invite with loaded template and create new request w/o request title
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details
    When Click the Create New Invite button
    When Enter complete invite details with loaded template
    Then Create request unsuccessfully with error message