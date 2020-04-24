package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LargeAndDeepDomPage
{
    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void scrollToTable()
    {
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }

    public WebElement getRowFromTable(String value)
    {
        WebElement htmlTable = driver.findElement(table);
        List<WebElement> tableRows = htmlTable.findElements(By.tagName("tr"));
        WebElement selectedRow = null;

        for (WebElement row : tableRows)
        {
            if (row.getText().contains(value))
            {
                selectedRow = row;
                break;
            }
        }
        return selectedRow;
    }

    public List<String> getColumnValuesFromTable(String columnName)
    {
        WebElement htmlTable = driver.findElement(table);
        List<WebElement> columnHeaders = htmlTable.findElements(By.tagName("th"));
        List<String> values = new ArrayList<>();
        int columnIndex = getColumnIndex(columnHeaders, columnName);

        WebElement tableBody = htmlTable.findElement(By.tagName("tbody"));
        List<WebElement> tableRows = tableBody.findElements(By.tagName("tr"));

        for (WebElement row : tableRows)
        {
            List<WebElement> cellValues = row.findElements(By.tagName("td"));
            values.add(cellValues.get(columnIndex).getText());
        }

        return values;
    }

    private int getColumnIndex(List<WebElement> headers, String headerName)
    {
        int numColumns = headers.size();
        for (int i = 1; i <= numColumns; i++)
        {
            if (headers.get(i).getText().equals(headerName))
            {
                return i;
            }
        }
        return 0;
    }
}
