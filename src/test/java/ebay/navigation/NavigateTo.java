package ebay.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    EbayHomePage ebayHomePage;

    @Step("Open the Ebay home page")
    public void theEbayHomePage() {
        ebayHomePage.open();
    }
}
