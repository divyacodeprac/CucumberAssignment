
Feature: Elements validation
  I want to use this template for my feature file

  
  Scenario: Verify the count of values
    Given Page is launched "Selenium Easy Demo - Simple Form to Automate using Selenium"
    Then Labels on right side of textboxes 2
    And TextBoxes has values 
    		|$122,365.24|
   		 |$599.00|
    And Total has sum of values in textbox 122964
   
   
    
    


 
