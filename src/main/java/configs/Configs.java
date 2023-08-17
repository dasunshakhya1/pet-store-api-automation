package configs;

import core.model.HeaderData;

public class Configs {
    public static final String BASE_URL = System.getProperty("BASE_URL") != null ?System.getProperty("BASE_URL"):"https://petstore.swagger.io/v2";
    public static final HeaderData headerData = new HeaderData().addHeaderValues("content-type","application/json");
}
