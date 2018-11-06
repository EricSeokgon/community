package com.tistory.hadeslee.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;


@RestController
public class BookRestController {

    @Autowired
    private BookRestService bookRestService;

    @GetMapping(path = "/rest/test",produces = PageAttributes.MediaType.APPLICATION_JSON_VALUE)
    public Book getTestBooks() {
        return bookRestService.getRestBook();
    }
}
