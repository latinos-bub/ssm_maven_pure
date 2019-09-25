package com.latin.controller.admin;

import com.latin.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;

import java.util.Map;
import java.util.List;

/**
 * @author: util.you.com@gmail.com
 * @date: 2019/9/25 20:28
 * @description:
 * @className: ArticleController
 */
@Controller
@RequestMapping("/admin")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @RequestMapping("/test")

    public @ResponseBody String test(){

        return "hello ssm";
    }

    @RequestMapping("/getArticles")
    public @ResponseBody List<Map<String,Object>> getArticles(Integer pageNum, Integer pageSize){

        List<Map<String, Object>> articleList = articleService.findArticle(pageNum, pageSize);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(articleList);
        return pageInfo.getList();
    }
}
