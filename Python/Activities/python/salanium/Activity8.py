# Import required modules
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

# Start the browser
with webdriver.Firefox() as driver:

    # Open the website
    driver.get("https://training-support.net/webelements/mouse-events")

    # Print page title
    print("Page Title:", driver.title)

    # Create ActionChains object
    actions = ActionChains(driver)

    # Find buttons
    cargo_lock = driver.find_element(By.XPATH, "//button[text()='Cargo.lock']")
    cargo_toml = driver.find_element(By.XPATH, "//button[text()='Cargo.toml']")

    # Left click Cargo.lock then move and click Cargo.toml
    actions.click(cargo_lock).move_to_element(cargo_toml).click().perform()

    # Print confirmation text
    confirm1 = driver.find_element(By.ID, "result")
    print("Confirmation:", confirm1.text)

    # Double click src button
    src_button = driver.find_element(By.XPATH, "//button[text()='src']")
    actions.double_click(src_button).perform()

    # Right click target button
    target_button = driver.find_element(By.XPATH, "//button[text()='target']")
    actions.context_click(target_button).perform()

    # Print confirmation text
    confirm2 = driver.find_element(By.ID, "result")
    print("Confirmation:", confirm2.text)