Feature: Testig Selenium

Scenario: 1.I want to test get request
Given race circuit application is running
When I hit request to get response
Then I validate circuit "MRData.limit" value as "30" present
Then I validate the circuit "MRData.total" value as "20" present
Then I validate circuit "MRData.CircuitTable.Circuits[0].circuitId" value as "albert_park' present
Then I validate total value

