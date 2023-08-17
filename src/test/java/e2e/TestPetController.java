package e2e;

import controllers.PetController;
import core.utils.JsonReader;
import data.enums.Status;
import data.models.PetData;
import data.models.TagData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestPetController {


    @Test()
    public void testFindByStatus() {
        List<PetData> petData = PetController.findPetByStatus(Status.available);
        Assert.assertTrue(petData.size() > 0);
    }

    @Test()
    public void createPet(){
        TagData tagData = JsonReader.getObject(TagData.class,1);
        PetData petData = JsonReader.getObject(PetData.class,225855296);
        System.out.println(tagData);
        System.out.println(petData);
    }
}