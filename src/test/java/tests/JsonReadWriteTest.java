package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

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
}
