package com.bobanngame.blog.logic.service.impl;

import com.bobanngame.blog.logic.entity.Attachment;
import com.bobanngame.blog.logic.mapper.AttachmentMapper;
import com.bobanngame.blog.logic.service.IAttachmentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 附件表，用于保存用户上传的附件内容。 服务实现类
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@Service
public class AttachmentServiceImpl extends ServiceImpl<AttachmentMapper, Attachment> implements IAttachmentService {
	
}
