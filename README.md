# Safora QA Automation

## Project Overview
This project automates the Contact Us form on the Safora website using Selenium WebDriver with Java.

## Tools and Technologies
- Java
- Selenium WebDriver
- IntelliJ IDEA
- Google Chrome

## Test Scenario
This automation script performs the following actions:

1. Opens the Safora Contact Us page
2. Enters valid test data into:
   - Name
   - Email
   - Phone Number
   - Message
3. Waits for manual reCAPTCHA completion
4. Clicks the Send Message button
5. Verifies successful form submission

## Test Data Used
Name: Chira Lava  
Email: chira.lava@test.com , chira@test.com  
Phone: 0771234567  
Message: Our company is exploring workplace safety solutions.

## Expected Result
The following success message should appear:

Success! Your message has been sent successfully.

## How to Run

1. Download the project files
2. Open the project in IntelliJ IDEA
3. Add Selenium libraries to the project
4. Open `SaforaContactTest.java`
5. Run the Java file
6. Complete the reCAPTCHA manually when prompted

## Notes
The form submits successfully after entering valid data.
