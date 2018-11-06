package com.tistory.hadeslee.community.pojo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FruitPropertyTest {

    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void test() {
        List<Map> fruitData = fruitProperty.getList();

        assertThat(fruitData.get(0).get("name"), is("banana"));
        assertThat(fruitData.get(0).get("color"), is("yellow"));

        assertThat(fruitData.get(1).get("name"), is("apple"));
        assertThat(fruitData.get(1).get("color"), is("red"));

        assertThat(fruitData.get(2).get("name"), is("water melon"));
        assertThat(fruitData.get(2).get("color"), is("green"));


    }

}