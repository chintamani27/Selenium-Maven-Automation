package Test.Selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TejasProject {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://carebridgeplus.tech/login");
		
		//d.findElement(By.className("flex flex-col items-center justify-center py-3 px-1 rounded-xl border-2 transition-all gap-1.5 cursor-pointer border-transparent bg-slate-100 dark:bg-white/5 text-slate-400 hover:text-slate-700 dark:hover:text-slate-200")).click();
		d.findElement(By.xpath("//button[@class='flex flex-col items-center justify-center py-3 px-1 rounded-xl border-2 transition-all gap-1.5 cursor-pointer border-transparent bg-slate-100 dark:bg-white/5 text-slate-400 hover:text-slate-700 dark:hover:text-slate-200']")).click();
		d.findElement(By.xpath("//input[@placeholder='username123']")).sendKeys("Shinde");
		d.findElement(By.xpath("//input[@class='w-full pl-10 pr-10 py-3 rounded-xl text-xs font-semibold border outline-none transition-all normal-case input-premium bg-slate-900/60 border-slate-800 text-white placeholder-slate-500 focus:bg-slate-900/90 focus:border-brand-secondary/60 focus:ring-2 focus:ring-brand-secondary/20']")).sendKeys("shinde@098");
		
		
		List<WebElement> checkboxes = d.findElements(By.xpath("//input[@class='peer h-5 w-5 appearance-none rounded border-2 transition-all bg-slate-800 border-slate-400 checked:bg-teal-500 checked:border-teal-500 cursor-pointer']"));
		for (WebElement checkbox : checkboxes) {
		    
		    checkbox.click();
		}
		
		
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
