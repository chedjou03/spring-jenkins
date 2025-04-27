Feature: Credit Score Grade Scenario with DataTable

  Scenario: Generate credit score grade
    Given We have five clients with their credit limit and usage
      | id | firstName   | lastName   | email   | creditLimit | creditUsage |
      | 11 | firstName11 | lastName11 | email11 | 100000      | 140000      |
      | 12 | firstName12 | lastName12 | email12 | 40000       | 50000       |
      | 13 | firstName13 | lastName13 | email13 | 70000       | 40000       |
      | 14 | firstName14 | lastName14 | email14 | 10000       | 22000       |
      | 15 | firstName15 | lastName15 | email15 | 20000       | 22000       |
    When calculate their credit score grade
    Then we should have these grade
      | id | creditGrade |
      | 11 | D           |
      | 12 | D           |
      | 13 | A           |
      | 14 | F           |
      | 15 | D           |

