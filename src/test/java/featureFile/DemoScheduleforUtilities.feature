Feature: Schedule a Demo for Utilities as a feature

  Scenario Outline: Schedule a Demo for Utilities and fill up the data in form
    Given User launches Chrome browser
    Then close popup
    When we explore Utilities feature
    Then check complete Utility optimization details
    Then click on Scheduled Demo
    Then Fill the data in form for Demo as "<fn>","<ln>","<Email>","<CompanyName>","<PhoneNumber>","<UnitCount>","<JobTitle>","<Iam>"
    Examples:
      | fn      | ln      | Email                      | CompanyName | PhoneNumber | UnitCount | JobTitle | Iam        |
      | Shishir | Thigale | shishirthigale95@gmail.com | ENTRATA     | 9373478714  | 1 - 10    | SDET     | a Resident |