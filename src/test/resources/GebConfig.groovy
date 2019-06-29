import org.openqa.selenium.firefox.FirefoxDriver

waiting {
	timeout = 2
}

environments {
	firefox {
		atCheckWaiting = 1

		driver = { new FirefoxDriver() }
	}

}

baseUrl = "http://localhost:8090"
