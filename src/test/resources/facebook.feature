

			Feature: 						User must validate the Facebook login portal
 		  Scenario Outline: 	To Validate the login page with valid credentails
 	    Given 							To login the facebook url
    	When 								To validate the "<username>" and "<password>"
   	  And 								To login the webpage
    	Then 								To validate the webpage with report
  
Examples:
|username|password|
|Jasan|12345|

  