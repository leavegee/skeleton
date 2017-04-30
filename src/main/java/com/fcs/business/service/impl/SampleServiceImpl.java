package com.fcs.business.service.impl;

import com.fcs.business.entity.Sample;
import com.fcs.business.mapper.SampleMapper;
import com.fcs.business.service.ISampleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lucare
 * @since 2017-04-30
 */
@Service
public class SampleServiceImpl extends ServiceImpl<SampleMapper, Sample> implements ISampleService {
	
}
