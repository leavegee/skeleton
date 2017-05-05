package com.bobanngame.blog.logic.service.impl;

import com.bobanngame.blog.logic.entity.Comment;
import com.bobanngame.blog.logic.mapper.CommentMapper;
import com.bobanngame.blog.logic.service.ICommentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表，用于保存content内容的回复、分享、推荐等信息。 服务实现类
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {
	
}
