#AbhibusBDD


Selenium:

Selenium interview Questions.

1. Difference between webdriver get and navigate methods:

Get method will wait till the all the components of the page are loaded. Then only resumes / unlock the scripts and next line will execute.
Navigate method will not check whether page loaded or not after execution. The control goes to the next line. back, forward, and refresh methods we have along with navigate methods.
	
2. Difference between quit and close:

close only browser that is under focus.
quit will close all the browsers. 

3. what is the implicit wait
		
Begining of the test we set default wait time. 
scripts resumes once the element is displayed with in the specified time.
If element not found within the specified time, it will throw elementnotfound exception.
Applicable for all the elements.
dirver.manage().TimeOut().implicitWait(TimeUnit.seconds,5)
	

4. What is the explicit Wait

It targes only specific element set by the user. Assume that we have element which takes to much time to load. example WebTable. In explicit wait we specify a explict condition of target element, if that condition is true in the given time, then only it goes to remaining logic. conditions : visibilityOfElementLocated, elementToBeClickable, elementToBeSelected
Then default time (implicit wait will applicable) for remaining elements.

5. dirver.switchTo(id) <- id, name, frame element.

6  How you handle 3rd child window

		 webdriver by defaults on first window even we open 2 to 3 browsers using selenium.
	
	 	Set<String> windows = driver.getWindowHandles();
	 	Iterator i = windows.iterator();
	 	while(i.hasnext())
	 	dirver.switchTo().window(i.next());
	 
7. How To hanlde https certifications ?
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		cap.setCapability(Capabilities.ACCEPT_SSL_CERTS,true);
	
8. List down Locators:
		id, name, className, tagName, linkText, paritalLinkText, xpath, cssselectors

9. 	Regular Expression XPath
		//tagName[contains(@class,'uo')]
		//tagName[contains(text(),'SAP')]
		//tagName[text()='Hero']
	
10.	regular expression in the CSS
		tagname[class*='uo']
	
11.  identifing the parent and following sibling.
		//xpath/following-sibling::tagName
		//xpath/parent::tagName or xpath
		//xpath/ancestor::tagName or xpath
	
12. Dropdown Selection
		Select country = new Select(driver.findElement(By.id("country")))
		
		selectByVisibleText()   //text match at ui
		delsectByVisibleText()
		
		
		selectByValue()			//value attribute
		deselectByValue()
		
		selectByIndex()
		delselectByIndex()    // based on index. if 0 it will select 1st one.
		
		isMultiple() 		// return true if it allow multi selection element
		
		deselectAll()		//clear all the selected Elements. No Parameters needed
		
		
13. how to check Checkbox selected in the page
	
		driver.findElement(locator).isSelected()
		
14. how to check whether element is hidden or visible

		driver.findElement(locator).isDisplayed()
		
15 Importanace of desired capabilities?
		
		to set the testconfiguration with key value pair 	

		We set properties and behaviour in desired capabilities ?
		how browser react ? 
	    we also set operating systems. when we are working in grid

			WebDriver driver;
			String baseUrl , nodeUrl;
			baseUrl = "https://www.facebook.com";
			nodeUrl = "http://192.168.10.21:5568/wd/hub";

			DesiredCapabilities capability = DesiredCapabilities.firefox();
			capability.setBrowserName("firefox");
			capability.setPlatform(Platform.WIN8_1);

			driver = new RemoteWebDriver(new URL(nodeUrl),capability);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
			----------

			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
  
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
			capabilities.setCapability(InternetExplorerDriver.
  		  	INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

		  	---------

			// Created object of DesiredCapabilities class.
			DesiredCapabilities capabilities = new DesiredCapabilities();

			// Set android deviceName desired capability. Set your device name.
			capabilities.setCapability("deviceName", "your Device Name");

			// Set BROWSER_NAME desired capability.
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

			// Set android VERSION desired capability. Set your mobile device's OS version.
			capabilities.setCapability(CapabilityType.VERSION, "5.1");

			// Set android platformName desired capability. It's Android in our case here.
			capabilities.setCapability("platformName", "Android");

			// Set android appPackage desired capability.		


16 Discribe mouse handling in the Selenium ?

		//right click
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id("ID"));
		actions.contextClick(elementLocator).perform();  
		//double click
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id("ID"));
		actions.doubleClick(elementLocator).perform();

		or

       	new Actions(driver).click(driver.findElement(By.xpath("locator"))).build().perform();
       	new Actions(driver).doubleClick(driver.findElement(By.xpath("locator"))).build().perform();
       	new Actions(driver).contextClick(driver.findElement(By.xpath("locator"))).build().perform();
       	new Actions(driver).dragAndDrop("source WebElement", "destination WebElement").build().perform();
		
17.How to handle Alert ?

		Alert alert = driver.switchTo().alert();
			or
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().getText();			
		driver.switchTo().alert().sendKeys("Text");

18. How to handle calender ?
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+ journeyDate + "'", driver.findElement(travelingDate));
		
19. from which version we need gecko driver ? 43

20. How to scroll to Element?
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElements(findATravler).get(0));

21. How to scroll to bottom of the page?
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

22. How to take page screenshot.

     	TakesScreenshot scrShot =((TakesScreenshot)driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("fileWithPath");
        FileUtils.copyFile(srcFile, DestFile);
		
		or 
		
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("fileWithPath"));

23. How to set drivers
		System.setProperty("webdriver.chrome.driver", "/Users/kumkiyan/Documents/drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/kumkiyan/Documents/drivers/geckodriver");
		System.setProperty("webdriver.ie.driver", "/Users/kumkiyan/Documents/drivers/iedriver.exe");

24. How to Embed screenshot in scenario:
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
 		scenario.embed(screenshot, "image/png");
