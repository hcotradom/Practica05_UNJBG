import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
publicclass First_Class {

publicstaticvoid main(String[] args) {

System.setProperty("webdriver.gecko.driver","C:\\Users\\Erick Vilchez\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
String appTitle=driver.getTitle();
String expTitle="Google";
if (appTitle.equals (expTitle)){
System.out.println("Verification Successfull");
}
else{
System.out.println("Verification Failed");

}
driver.close();
System.exit(0);
}
}