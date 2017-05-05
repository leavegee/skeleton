package com.bobanngame.blog.logic.service.impl;

import com.bobanngame.blog.logic.entity.Mapping;
import com.bobanngame.blog.logic.mapper.MappingMapper;
import com.bobanngame.blog.logic.service.IMappingService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 内容和分类的多对多映射关系。 服务实现类
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@Service
public class MappingServiceImpl extends ServiceImpl<MappingMapper, Mapping> implements IMappingService {
	
}
