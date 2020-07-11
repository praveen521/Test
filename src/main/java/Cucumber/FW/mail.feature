Feature: Log into the DOLC page

Scenario Outline: lognto the page

Given user is already on login page
When title of the page
Then provide "<username>" and "<password>"
Examples:

|username| |password|
