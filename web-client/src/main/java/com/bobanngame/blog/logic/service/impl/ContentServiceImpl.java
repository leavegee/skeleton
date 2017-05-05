package com.bobanngame.blog.logic.service.impl;

import com.bobanngame.blog.logic.entity.Content;
import com.bobanngame.blog.logic.mapper.ContentMapper;
import com.bobanngame.blog.logic.service.IContentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 内容表，用于存放比如文章、帖子、商品、问答等用户自定义模型内容。也用来存放比如菜单、购物车、消费记录等系统模型。 服务实现类
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {
	
}
