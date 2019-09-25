package com.latin.service;

import java.util.List;
import java.util.Map;

/**
 * @author: util.you.com@gmail.com
 * @date: 2019/9/25 20:27
 * @description:
 * @className: ArticleService
 */
public interface ArticleService {


    List<Map<String, Object>> findArticle(Integer pageNum, Integer pageSize);
}
