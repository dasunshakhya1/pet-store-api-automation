package controllers;

import configs.Configs;
import core.http.RequestHandlerUtil;
import core.model.HeaderData;
import core.model.ResponseData;
import core.utils.ObjectMapperUtil;
import data.enums.Status;
import data.models.PetData;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import utils.UrlGenerator;

import java.util.List;
import java.util.Map;

public class PetController {

    private static final String BASE_PATH = "pet";

    public static List<PetData> findPetByStatus(Status status) {
        String url = UrlGenerator.createURL(BASE_PATH, "findByStatus", new BasicNameValuePair("status", status.name()));
        ResponseData responseData = RequestHandlerUtil.httpGET(url, Configs.headerData);
        return ObjectMapperUtil.mapStringArrayToObjectArray(PetData.class, responseData.getData());
    }


}
