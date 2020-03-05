#!/usr/bin/python3.8

# pull problem Description based on the problem name provided
# python pullDescription.py [problemName] [description path]

import argparse
import sys
from selenium.common.exceptions import NoSuchElementException
from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as wait

import time

def parseArgs():
    parser = argparse.ArgumentParser()
    parser.add_argument('--name', '-n',
                        help="""
                            Description: Name of the problem to scrap. Make sure encapsulating with "" or use _ spacing
                            Input: Any problem name in LeetCode
                            """)
    parser.add_argument('--path', '-p',
                            help="""
                                Description: path to Description
                                Input: path to Description for the problem provided
                                """)
    try:
        args = parser.parse_args()
        return args
    except SystemExit as err:
        if err.code == 2:
            parser.print_help()
            sys.exit(0)
        else:
            sys.exit(0)

# description path
descriptionPath = parseArgs().path

# generate url
baseURL = "https://leetcode.com/problems/" + parseArgs().name.replace(" ", "-").replace("_", "-").lower()
print("destination:\n" + baseURL)

# open the web and search description
driver = webdriver.Chrome("/Users/marshall/Desktop/LeetCode/chromedriver")
try:
    driver.get(baseURL)
    # xpath is not preferred, but it doesn't have id selector :(
    description = WebDriverWait(driver, 30).until(wait.visibility_of_element_located((By.XPATH, "//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/div[2]/div/div[2]/div")))
except NoSuchElementException as err:
    print("description not found!")
    driver.close()
    exit

with open(descriptionPath, "r+") as dest:
    dest.truncate(0)
    counter = 0
    line = "" # limit to 80 char per each line
    for each in description.text:
        counter += 1
        if counter > 80:
            line = line + "\n"
            counter = 0
        if each == "\n":
            counter = 0
        line = line + each
    dest.write(line)

driver.close()
