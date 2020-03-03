package com.example.novel.web;

import com.example.novel.Service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/novel")
public class NovelController {
    @Autowired
    private NovelService novelService;
}
