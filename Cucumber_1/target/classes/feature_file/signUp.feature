Feature: SignUp Applicatin feature 

Scenario: User SignUp scenario 


	When User is on Application Home Page 
	Then User clicks on the My_Account Button 
	Then User enters the First Name, Last Name, Mobile Number, Email, Password and Confirm Password and click SignUp button
	
	    | First Name | Last Name | Mobile Number | Email | Password | Conform Password | 
		| XYZ | LMN |9876543212 | xyz@gmail.com | xyz123 | xyz123 |
			
	
	When User navigate to UserProfile Page