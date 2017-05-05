package com.bobanngame.blog.logic.service.impl;

import com.bobanngame.blog.logic.entity.Option;
import com.bobanngame.blog.logic.mapper.OptionMapper;
import com.bobanngame.blog.logic.service.IOptionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 配置信息表，用来保存网站的所有配置信息。 服务实现类
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@Service
public class OptionServiceImpl extends ServiceImpl<OptionMapper, Option> implements IOptionService {
	
}
