package com.bobanngame.blog.logic.mapper;

import com.bobanngame.blog.logic.entity.Content;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  * 内容表，用于存放比如文章、帖子、商品、问答等用户自定义模型内容。也用来存放比如菜单、购物车、消费记录等系统模型。 Mapper 接口
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
public interface ContentMapper extends BaseMapper<Content> {

}