package steps;

import com.talentslms.UI.helpers.Helper;
import com.talentslms.UI.pages.AdminHomePage;
import com.talentslms.UI.pages.LoginPage;

public abstract class BaseTest {
    protected LoginPage loginPage = new LoginPage();
    protected Helper helper = new Helper();
    protected AdminHomePage adminHomePage = new AdminHomePage();
}
