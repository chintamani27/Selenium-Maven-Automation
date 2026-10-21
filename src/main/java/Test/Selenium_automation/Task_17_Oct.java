package Test.Selenium_automation;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task_17_Oct {
	
			public static void main(String[] args) throws InterruptedException {
				
				ChromeDriver d = new ChromeDriver();
				d.manage().window().maximize();
				
				
				d.get("https://testautomationpractice.blogspot.com/");
				d.manage().window().maximize();
				
				
				
				d.findElement(By.xpath("//input[@id='name']")).sendKeys("Chintamani");
				
				
				
				d.findElement(By.xpath("//input[@id='email' and @placeholder='Enter EMail']")).sendKeys("abc@gmail.com");
				
				
				
				d.findElement(By.xpath("//input[@id = 'phone']")).sendKeys("8776938176");
				
				
				
				d.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Pune");
				
				
				
				d.findElement(By.xpath("//input[@id='male' and @name='gender']")).click();
				
				
				
				
//				d.findElement(By.xpath("//input[@id='sunday' or @value='sunday']")).click();
//				
//				d.findElement(By.xpath("//input[contains(@id ,'monday')]")).click();
//				
//				d.findElement(By.xpath("//input[starts-with(@id,'tuesday')]")).click();
//				
//				d.findElement(By.xpath("//input[@id='wednesday']")).click();
//				
//				d.findElement(By.xpath("//input[@id='thursday' and @value='thursday']")).click();
//				
//				d.findElement(By.xpath("//input[@id='friday' and @value='friday']")).click();
//				
//				d.findElement(By.xpath("//input[@id='saturday' and @value='saturday']")).click();
				
				List<WebElement> checkboxes = d.findElements(By.xpath("//input[@class='form-check-input']"));
				
//				for (WebElement checkbox : checkboxes) {
//				    System.out.println(checkbox.getAttribute("id"));
//				    checkbox.click();
//				}
				
				
				Iterator<WebElement> it = checkboxes.iterator();
				
				while(it.hasNext()) {
					WebElement check = it.next();
					check.click();
				}
				
				//accessing country field
				Select sel = new Select(d.findElement(By.id("country")));

				sel.selectByVisibleText("India");
				
				//accessing color field
				Select col = new Select(d.findElement(By.id("colors")));
				col.selectByVisibleText("Yellow");
				
				//accessing animal field
				Select animal = new Select(d.findElement(By.id("animals")));
				animal.selectByVisibleText("Fox");
				
				
				//accessing date1 field
				d.findElement(By.id("datepicker")).click();
				d.findElement(By.xpath("//a[@data-handler='prev']")).click();
//				d.findElement(By.xpath(
//					    "//td[@data-handler='selectDay' and @data-month='8' and @data-year='2026']//a[@data-date='15']"
//					)).click();
				d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")).click();
				
				//accessing date2 field
				d.findElement(By.id("txtDate")).click();
				d.findElement(By.xpath("//td[@data-month='9' and @data-year='2026'] //a[@data-date='8']")).click();
				
				//accessing date 3 picker field
				d.findElement(By.id("start-date")).sendKeys("10-02-2023");
				
				d.findElement(By.id("end-date")).sendKeys("10-2/2024");  // it is working for 10/02/2024 format also 
				
				//accessing submit button
				d.findElement(By.xpath("//button[text()='Submit']")).click();
				
				//accesing choose file
				d.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("C:\\Users\\chint\\OneDrive\\文件\\stqa dinesh.pdf");
				
				//click() not works for this so we have used javascriptExecutor or directly sendKeys()
//				{//using javascript executor 
//				WebElement fileInput = d.findElement(By.id("singleFileInput"));
//				JavascriptExecutor js = (JavascriptExecutor) d;
//				js.executeScript("arguments[0].click();", fileInput);
//				}
		//	
				
				d.findElement(By.id("multipleFilesInput")).sendKeys(
					    "C:\\Users\\chint\\OneDrive\\文件\\stqa dinesh.pdf\n" +
					    "C:\\Users\\chint\\OneDrive\\文件\\vishwajjet csdf.pdf"
					);
				
				//clicking upload buttons
				d.findElement(By.xpath("//button[text()='Upload Single File']")).click();
				d.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
				
				//handling alert
				d.findElement(By.xpath("//button[@id='alertBtn']")).click();
				Alert al = d.switchTo().alert();
				al.accept();
				//or this way => //d.switchTo().alert().accept();
				
				d.findElement(By.id("confirmBtn")).click();
				Alert al2 = d.switchTo().alert();
				al2.accept();
				
				d.findElement(By.id("promptBtn")).click();
				Alert al3 = d.switchTo().alert();
				al3.sendKeys("Chintamanni");
				al3.accept();
				
				
				WebElement staticTable = d.findElement(By.xpath("//table[@name='BookTable']"));
				System.out.println(staticTable.getText());
				
				//d.findElement(By.xpath("//button[text()='New Tab']")).click();
				//d.findElement(By.id("PopUp")).click();
				
				List<WebElement> brokenlinks = d.findElements(By.partialLinkText("Errorcode"));
				
//				for(WebElement l : brokenlinks) {
//					l.click();
//					//System.out.println("Error code:" +l.getText());
//					Thread.sleep(2000);
//					d.navigate().back();
//				}
				
				//Scrolling DropDown
				Actions act = new Actions(d);
				WebElement comboBox  = d.findElement(By.id("comboBox"));
				comboBox .click();
				WebElement dropdown = d.findElement(By.id("dropdown"));
				
				//scrolling page upto dropdown
				act.moveToElement(dropdown)
				   .scrollByAmount(0, 300)
				   .perform();
				
				//scrolling dropdown
				d.executeScript(
					    "arguments[0].scrollTop += 300;",
					    dropdown
					);//
				
				//selecting checkboxes
//				List <WebElement> cBoxes = d.findElements(By.xpath("//td/input"));
//				for(WebElement c : cBoxes) {
//					c.click();
//					
//				}
				
				for(int page=1;page<=4;page++) {
					
					//find checkboxes
					List <WebElement> cBoxes = d.findElements(By.xpath("//td/input"));
					
					//clicks checkboxes 
					for(WebElement c : cBoxes) {
						if(c.isDisplayed() && c.isEnabled() && !c.isSelected()) {
							c.click();
						}
						
					}
					Thread.sleep(2000);
					
					d.findElement(By.xpath("//ul[@id='pagination']//a[normalize-space()='"+page+"']")).click();
					Thread.sleep(2000);
				}
				 
				
				//input fields
				d.findElement(By.id("input1")).sendKeys("cda");
				d.findElement(By.id("btn1")).click();
				
				d.findElement(By.id("input2")).sendKeys("asdf");
				d.findElement(By.id("btn2")).click();
				
				d.findElement(By.id("input3")).sendKeys("qwert");
				d.findElement(By.id("btn3")).click();
				
				
				
				//shadow DOM
				WebElement host = d.findElement(By.id("shadow_host"));
				
				//getting element inside host
				SearchContext root = host.getShadowRoot();
				
				//clicking blog link
				WebElement blog = root.findElement(By.cssSelector("a"));
				System.out.println("Link: " + blog.getText());
				System.out.println("URL: " + blog.getAttribute("href"));
				
				((JavascriptExecutor) d)
			    .executeScript("arguments[0].click();", blog);
				
				d.navigate().back();
				
				//getting input element
				WebElement input = root.findElement(By.cssSelector("input[type='text']"));
				input.sendKeys("xyz");
				
//				//cliking checkbox
//				WebElement checkbox = root.findElement(By.cssSelector("input[type='checkbox']"));
//				checkbox.click();
				
				//choosing file
				root.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\chint\\OneDrive\\文件\\chintamani_test_case.xlsx");
				
				
				
				//clicking youtube link // it is outside shadow DOM
				d.findElement(By.linkText("Youtube")).click();
				d.navigate().back();
				
				
				//clicking hidden element link
				d.findElement(By.linkText("Hidden Elements & AJAX")).click();
				
				//entering deatila in hidden box
				d.findElement(By.id("input1")).sendKeys("testing");
				d.findElement(By.id("checkbox1")).click();
				
				//toggle input button
				d.findElement(By.id("toggleInput")).click();
				d.findElement(By.id("input2")).sendKeys("input2");
				
				//toggle checkbox
				d.findElement(By.id("toggleCheckbox")).click();
				d.findElement(By.id("checkbox2")).click();
				
				//load ajax content button
				d.findElement(By.id("loadContent")).click();
				
				//get ajax content text
				Thread.sleep(3000);
				WebElement ajax = d.findElement(By.id("ajaxContent"));
				System.out.println("Ajax Content: "+ ajax.getText());
				
				//clicking download files button
				d.findElement(By.linkText("Download Files")).click();
				//entering text to download
				d.findElement(By.id("inputText")).sendKeys("Download this content");
				d.findElement(By.id("generateTxt")).click();
				
				d.findElement(By.cssSelector("button[onclick='generatePDFFile()']")).click();
				
				//clicking pop up
				String parent = d.getWindowHandle();

				d.findElement(By.id("PopUp")).click();

				for (String handle : d.getWindowHandles()) {
				    if (!handle.equals(parent)) {
				        d.switchTo().window(handle);
				        d.close();
				        break;
				    }
				}

				d.switchTo().window(parent);
				
				//clicking new tab
				String parentTab = d.getWindowHandle();
				d.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
				System.out.println("Parent tab id:"+parentTab);
				
				for(String t : d.getWindowHandles()) {
					if(!parentTab.equals(t)) {
						d.switchTo().window(t);
						d.close();
						break;
					}
				}
				d.switchTo().window(parentTab);
						

			}

}


