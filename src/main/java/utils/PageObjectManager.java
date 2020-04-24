package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager
{
    private WebDriver driver;
    private AlertsPage alertsPage;
    private ContextMenuPage contextMenuPage;
    private DropdownPage dropdownPage;
    private DynamicLoadingExample1Page dynamicLoadingExample1Page;
    private DynamicLoadingExample2Page dynamicLoadingExample2Page;
    private DynamicLoadingPage dynamicLoadingPage;
    private EmailSentPage emailSentPage;
    private FileUploadPage fileUploadPage;
    private ForgotPasswordPage forgotPasswordPage;
    private FramesPage framesPage;
    private HomePage homePage;
    private HorizontalSliderPage horizontalSliderPage;
    private HoversPage hoversPage;
    private InfiniteScrollPage infiniteScrollPage;
    private KeyPressesPage keyPressesPage;
    private LargeAndDeepDomPage largeAndDeepDomPage;
    private LoginPage loginPage;
    private MultipleWindowsPage multipleWindowsPage;
    private NestedFramePage nestedFramePage;
    private SecureAreaPage secureAreaPage;
    private WysiwygEditorPage wysiwygEditorPage;

    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public AlertsPage getAlertsPage()
    {
        return (alertsPage == null) ? alertsPage = new AlertsPage(driver) : alertsPage;
    }

    public ContextMenuPage getContextMenuPage()
    {
        return (contextMenuPage == null) ? contextMenuPage = new ContextMenuPage(driver) : contextMenuPage;
    }

    public DropdownPage getDropdownPage()
    {
        return (dropdownPage == null) ? dropdownPage = new DropdownPage(driver) : dropdownPage;
    }

    public DynamicLoadingExample1Page getDynamicLoadingExample1Page()
    {
        return (dynamicLoadingExample1Page == null) ? dynamicLoadingExample1Page =
                new DynamicLoadingExample1Page(driver) : dynamicLoadingExample1Page;
    }

    public DynamicLoadingExample2Page getDynamicLoadingExample2Page()
    {
        return (dynamicLoadingExample2Page == null) ? dynamicLoadingExample2Page =
                new DynamicLoadingExample2Page(driver) : dynamicLoadingExample2Page;
    }

    public DynamicLoadingPage getDynamicLoadingPage()
    {
        return (dynamicLoadingPage == null) ? dynamicLoadingPage = new DynamicLoadingPage(driver) : dynamicLoadingPage;
    }

    public EmailSentPage getEmailSentPage()
    {
        return (emailSentPage == null) ? emailSentPage = new EmailSentPage(driver) : emailSentPage;
    }

    public FileUploadPage getFileUploadPage()
    {
        return (fileUploadPage == null) ? fileUploadPage = new FileUploadPage(driver) : fileUploadPage;
    }

    public ForgotPasswordPage getForgotPasswordPage()
    {
        return (forgotPasswordPage == null) ? forgotPasswordPage = new ForgotPasswordPage(driver) : forgotPasswordPage;
    }

    public FramesPage getFramesPage()
    {
        return (framesPage == null) ? framesPage = new FramesPage(driver) : framesPage;
    }

    public HomePage getHomePage()
    {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public HorizontalSliderPage getHorizontalSliderPage()
    {
        return (horizontalSliderPage == null) ? horizontalSliderPage =
                new HorizontalSliderPage(driver) : horizontalSliderPage;
    }

    public HoversPage getHoversPage()
    {
        return (hoversPage == null) ? hoversPage = new HoversPage(driver) : hoversPage;
    }

    public InfiniteScrollPage getInfiniteScrollPage()
    {
        return (infiniteScrollPage == null) ? infiniteScrollPage = new InfiniteScrollPage(driver) : infiniteScrollPage;
    }

    public KeyPressesPage getKeyPressesPage()
    {
        return (keyPressesPage == null) ? keyPressesPage = new KeyPressesPage(driver) : keyPressesPage;
    }

    public LargeAndDeepDomPage getLargeAndDeepDomPage()
    {
        return (largeAndDeepDomPage == null) ? largeAndDeepDomPage = new LargeAndDeepDomPage(driver) : largeAndDeepDomPage;
    }

    public LoginPage getLoginPage()
    {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public MultipleWindowsPage getMultipleWindowsPage()
    {
        return (multipleWindowsPage == null) ? multipleWindowsPage = new MultipleWindowsPage(driver) : multipleWindowsPage;
    }

    public NestedFramePage getNestedFramePage()
    {
        return (nestedFramePage == null) ? nestedFramePage = new NestedFramePage(driver) : nestedFramePage;
    }

    public SecureAreaPage getSecureAreaPage()
    {
        return (secureAreaPage == null) ? secureAreaPage = new SecureAreaPage(driver) : secureAreaPage;
    }

    public WysiwygEditorPage getWysiwygEditorPage()
    {
        return (wysiwygEditorPage == null) ? wysiwygEditorPage = new WysiwygEditorPage(driver) : wysiwygEditorPage;
    }
}
