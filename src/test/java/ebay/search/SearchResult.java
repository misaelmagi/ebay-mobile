package ebay.search;

import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.stream.Collectors;

public class SearchResult extends UIInteractionSteps {
    public Integer amountOfResults() {
        return findAll(SearchResultList.RESULTS)
                .stream()
                .collect(Collectors.toList()).size();
    }
}
