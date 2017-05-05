package com.bobanngame.blog.logic.service.impl;

import com.bobanngame.blog.logic.entity.User;
import com.bobanngame.blog.logic.mapper.UserMapper;
import com.bobanngame.blog.logic.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表，保存用户信息。 服务实现类
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
