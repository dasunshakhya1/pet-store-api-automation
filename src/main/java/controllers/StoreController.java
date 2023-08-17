package controllers;

import utils.UrlGenerator;

import java.net.URISyntaxException;
import java.util.HashMap;

public class StoreController {
    private static final String BASE_PATH = "store";

    public static void getInventories() throws URISyntaxException {
        String url = UrlGenerator.createURL(BASE_PATH, "inventory", new HashMap<>());

    }


}
