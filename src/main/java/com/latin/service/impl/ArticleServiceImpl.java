package com.latin.service.impl;

import com.github.pagehelper.PageHelper;
import com.latin.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: util.you.com@gmail.com
 * @date: 2019/9/25 17:55
 * @description:
 * @className: ArticleServiceImpl
 */
@Service
public class ArticleServiceImpl implements com.latin.service.ArticleService {

    @Autowired
    private ArticleMapper articleMapper;


    /**
     * @Description: 查询所有
     * @Param: [pageNum, pageSize]
     * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     * @Author: util.you.com@gmail.com
     * @Date: 2019/9/25 20:26
     */
    @Override
    public List<Map<String, Object>> findArticle(Integer pageNum, Integer pageSize){

        // 分页
        PageHelper.startPage(pageNum, pageSize);
        return articleMapper.selectArticle();
    }
}
