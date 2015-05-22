/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/configuration.html
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

waiting {
	timeout = 2
}

environments {
	chrome {
		driver = {
            def driverInstance = new ChromeDriver()
            driverInstance.manage().window().maximize()
            driverInstance
        }
	}

    phantomJs {
        driver = {
            PhantomJSDriver driverInstance = new PhantomJSDriver()
            driverInstance.manage().window().maximize()
            driverInstance
        }
    }

}

baseUrl = System.getProperty('UI_URL')
