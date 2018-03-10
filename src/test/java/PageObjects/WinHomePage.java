package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testframework.Basepage;

public class WinHomePage extends Basepage{
public WinHomePage()
{
	super();
}

@FindBy(id="shellmenu_1")
public WebElement WindowMenu;
@FindBy(id="shellmenu_67")
public WebElement JuegoMenu;



}
