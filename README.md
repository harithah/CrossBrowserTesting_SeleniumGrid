# CrossBrowserTesting_SeleniumGrid
Implementing cross browser testing with Selenium grid

Cross browser testing is poosible using Selenium grid.

Download the Selenium-Standalone jar from
http://code.google.com/p/selenium/downloads/detail?name=selenium-server-standalone-2.39.0.jar&can=2&q=

Start the grid by running:
java -jar selenium-server-standalone-2.44.0.jar -role hub

By default it created the grid in 4444 port.
Go to localhost:4444 to view the selenium grid console

Now to register 2 nodes do the below:
java -jar selenium-server-standalone-2.44.0.jar -role webdriver  -hub http://localhost:4444/grid/register -port 5556

java -jar selenium-server-standalone-2.44.0.jar -role webdriver  -hub http://localhost:4433/grid/register -port 5555

The Selenium grid console will now show 2 nodes registered in the above mentioned ports.

There ports are used while initialising the RemoteWebDrivers in our test code.
