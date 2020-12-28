# Explaining the example


- The credentials are set in the configuration file (configHeader.xml). If the credentials are expired, create a new user for trello and follow [the guide](https://developers.trello.com/reference/#introduction) to generate new credentials


- A POJO is implemented to represent the json object of a Trello Board


- A Test class is implemented inheriting from BaseTest, to test the request and validation of user boards using the Trello Api


- A Helper class is implemented, inheriting from HelperBase, with the method that request boards from a user


- A suite is created to run the test (suiteTests.xml)