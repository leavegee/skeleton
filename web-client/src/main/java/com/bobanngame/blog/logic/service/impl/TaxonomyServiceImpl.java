package com.bobanngame.blog.logic.service.impl;

import com.bobanngame.blog.logic.entity.Taxonomy;
import com.bobanngame.blog.logic.mapper.TaxonomyMapper;
import com.bobanngame.blog.logic.service.ITaxonomyService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类表。标签、专题、类别等都属于taxonomy。 服务实现类
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@Service
public class TaxonomyServiceImpl extends ServiceImpl<TaxonomyMapper, Taxonomy> implements ITaxonomyService {
	
}
