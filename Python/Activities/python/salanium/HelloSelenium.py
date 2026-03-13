# Import webdriver from selenium
from selenium import webdriver

# Start the Driver
with webdriver.Firefox() as driver:
  
  # Open the browser to the URL
  driver.get("https://training-support.net")
  
 
  driver.quit()