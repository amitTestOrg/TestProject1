/*package test;

public class Test2 {

	public static void main(String[] args) {

		if (driver.findElement(By.id("tblGrid")).findElements(By.tagName("tr")).size() > 1) {
            int rowSize = driver.findElement(By.id("tblGrid")).findElements(By.tagName("tr")).size();
            for (int i = 1; i <= rowSize - 1; i++) {
                            elementText = driver.findElement(By.id("tblGrid")).findElements(By.tagName("tr")).get(i).findElements(By.tagName("td")).get(11).getText();
                            size = 0;
                            if (elementText.equals("Deposited")) {

                                            element = ByID.object(String.valueOf(i)).findElements(By.tagName("select")).get(0);
                                            sel = new Select(element);
                                            sel.selectByVisibleText("Mark NSF");
                                            elementText = driver.findElement(By.id("tblGrid")).findElements(By.tagName("tr")).get(i)
                                                                            .findElements(By.tagName("td")).get(5).getText();
                                            break;
                            }
                            else 
                                            size = size+1;

            }
            if(rowSize==size)
                            Assert.fail("Failing because no row contains Deposited text.");

		}
	}

}
*/