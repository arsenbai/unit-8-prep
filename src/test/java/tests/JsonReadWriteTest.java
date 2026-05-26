package tests;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import pckg.Person;

import java.util.List;

import static utils.JsonUtils.readJsonSimpleDemo;
import static utils.JsonUtils.writeJsonSimpleDemo;

public class JsonReadWriteTest {
    @Test
    public void jsonSimpleTest() throws Exception {
        writeJsonSimpleDemo("src/test/resources/example2.json");
        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("src/test/resources/example2.json");
        System.out.println(jsonObject);
        System.out.println(jsonObject.get("age"));
    }

    @Test
    public void jsonDeserializationTest() throws Exception {
        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("src/test/resources/example.json");

        JSONArray jsonArrayOfKids = (JSONArray) jsonObject.get("kids");

        Person billy = new Person(
                (String) ((JSONObject) jsonArrayOfKids.get(0)).get("name"),
                Integer.parseInt(
                        ((JSONObject) jsonArrayOfKids.get(0)).get("age").toString()
                )
        );

        Person milly = new Person(
                (String) ((JSONObject) jsonArrayOfKids.get(1)).get("name"),
                Integer.parseInt(
                        ((JSONObject) jsonArrayOfKids.get(1)).get("age").toString()
                )
        );

        Person ben = new Person(
                (String) jsonObject.get("name"),
                Integer.valueOf(jsonObject.get("age").toString()),
                (Boolean) jsonObject.get("isMarried"),
                (List<String>) jsonObject.get("hobbies"),
                List.of(billy, milly)
        );

        System.out.println(ben);
    }
}
