package com.latin.mapper;


import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ArticleMapper {



    /**
     * @Description:
     * @Param: []
     * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     * @Author: util.you.com@gmail.com
     * @Date: 2019/9/25 20:45
     */
    @Select("select * from article")
    List<Map<String, Object>> selectArticle();
}
