package data.models;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TagData {
    private int id;
    private String name;
}
