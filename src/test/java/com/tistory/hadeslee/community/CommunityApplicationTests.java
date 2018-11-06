package com.tistory.hadeslee.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(value = "value=test", properties = {"property.value=propertyTest"},
        classes = {CommunityApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CommunityApplicationTests {

    @Value("${value")
    private String value;

    @Value("${property.value")
    private String propertyValue;

    @Test
    public void contextLoads() {
        //assertThat(value, is("test"));
        //assertThat(propertyValue, is("propertyTest"));
    }

}
