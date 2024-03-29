package com.cdmu.controller;

import com.cdmu.service.IArticleService;
import com.cdmu.utils.ResultInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 新闻动态
 *
 * @Author: BenOnSHI
 * @Date: 2020/4/21 16:49
 **/
@RequestMapping("/news")
@Controller
public class NewsController {


    @Autowired
    private IArticleService articleService;

    @Autowired
    private ResultInfoUtil resultInfoUtil;


    /**
     * @param page restful
     * @return
     */
    @RequestMapping(value = "{page}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String page) {
        ModelAndView modelAndView = new ModelAndView();
        switch (page) {
            case "list":
                modelAndView.setViewName("news-information/news-list");
                break;
            default:
                break;
        }
        return modelAndView;
    }



}
