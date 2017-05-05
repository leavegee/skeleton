package com.bobanngame.blog.logic.service.impl;

import com.bobanngame.blog.logic.entity.Metadata;
import com.bobanngame.blog.logic.mapper.MetadataMapper;
import com.bobanngame.blog.logic.service.IMetadataService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 元数据表，用来对其他表的字段扩充。 服务实现类
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@Service
public class MetadataServiceImpl extends ServiceImpl<MetadataMapper, Metadata> implements IMetadataService {
	
}
