package data.models;


import core.annotations.JsonId;
import data.enums.Status;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PetData {

    @JsonId
    private int id;
    private String name;
    private List<String> photoUrls;
    private CategoryData category;
    private List<TagData> tags;
    private String status;

}
