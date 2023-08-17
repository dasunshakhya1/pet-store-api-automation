package utils;

import configs.Configs;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.net.URIBuilder;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UrlGenerator {

    public static String createURL(String basePath, String uri, Map<String, String> queryParams) {
        List<NameValuePair> nameValuePairs = new ArrayList<>();
        String url;
        String baseURL = Configs.BASE_URL + "/" + basePath + "/" + uri;
        if (queryParams.size() > 0) {
            queryParams.keySet().forEach(k -> nameValuePairs.add(new BasicNameValuePair(k, queryParams.get(k))));
        }
        try {
            url = new URIBuilder(baseURL).addParameters(nameValuePairs).build().toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return url;
    }

    public static String createURL(String basePath, String uri, NameValuePair nameValuePair) {
        String url;
        String baseURL = Configs.BASE_URL + "/" + basePath + "/" + uri;
        try {
            url = new URIBuilder(baseURL).addParameter(nameValuePair).build().toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return url;
    }
}
