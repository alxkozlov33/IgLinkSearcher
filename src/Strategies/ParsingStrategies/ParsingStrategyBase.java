package Strategies.ParsingStrategies;

import Engines.WebUrlEngine;
import Models.CsvItemModel;
import Models.RequestData;
import Models.SearchResultItem;
import Servcies.DIResolver;
import Utils.UrlUtils;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.List;

public abstract class ParsingStrategyBase {
    private final DIResolver diResolver;
    private Elements elements;

    ParsingStrategyBase(DIResolver diResolver) {
        this.diResolver = diResolver;
    }

    public abstract List<SearchResultItem> getSocialMediaResults(CsvItemModel csvItemModel);

    void getSocialMediaDataFromResults(CsvItemModel csvItemModel) {
        WebUrlEngine webUrlEngine = new WebUrlEngine(diResolver);
        RequestData requestData = new RequestData(UrlUtils.createURLForIgSearch(csvItemModel));
        Element body = webUrlEngine.getWebSourceData(requestData);

        elements = body != null ? body.select("#res").select("div.g") : null;
    }

    Elements getElements() {
        return elements;
    }
}