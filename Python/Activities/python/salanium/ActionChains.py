# Import webdriver from selenium
from selenium import webdriver

# Import By
from selenium.webdriver.common.by import By

# Import ActionChains
from selenium.webdriver.common.action_chains import ActionChains

# Start the driver
with webdriver.Firefox() as driver:

    # Open the webpage
    driver.get("https://training-support.net/webelements/drag-drop")

    # Find the element
    element = driver.find_element(By.ID, "draggable")

    # Create ActionChains object
    actions = ActionChains(driver)

    # Perform click and hold action
    actions.click_and_hold(element).move_to_element(element).perform()