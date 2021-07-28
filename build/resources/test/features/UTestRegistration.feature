# Autor: John Mario Cabrera Solarte

@stories
Feature: UTest Register page
  As a user, I want to register my new account at Utest page, so I can enter the content of the page

  @scenario1
  Scenario Outline: personal data form
    Given than John wants to create a new account at utest page with a registration form
    When he completes the registration form
      | firstName      | lastName      | email      | monthBirth      | dayBirth      | yearBirth      | language      | city      | postalCode      | country      | computerOS      | computerVersion        | computerLanguage      | mobileBrand      | mobileModel      | mobileOs      | password      |
      | <strFirstName> | <strLastName> | <strEmail> | <strMonthBirth> | <strDayBirth> | <strYearBirth> | <strLanguage> | <strCity> | <strPostalCode> | <strCountry> | <strComputerOS> | <strComputerOSVersion> | <strComputerLanguage> | <strMobileBrand> | <strMobileModel> | <strMobileOS> | <strPassword> |
    Then he sees the checkout label
      | validateLabel      |
      | <strValidateLabel> |

    Examples:
      | strFirstName | strLastName | strEmail                    | strMonthBirth | strDayBirth | strYearBirth | strLanguage | strCity  | strPostalCode | strCountry | strComputerOS | strComputerOSVersion | strComputerLanguage | strMobileBrand | strMobileModel | strMobileOS | strPassword   | strValidateLabel |
      | John Mario   | Cabrera     | jcabrera123jo4@yopmail.com  | December      | 6           | 1964         | Spanish     | Medellín | 540928        | Israel     | Windows       | 10                   | English             | Huawei         | Mercury        | Android 4.0 | Choucair2021* | The last step    |