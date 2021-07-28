package com.xyz.gmw.SqlTEST.service.impl;

import com.xyz.gmw.SqlTEST.model.User;
import com.xyz.gmw.SqlTEST.mapper.UserMapper;
import com.xyz.gmw.SqlTEST.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xyz
 * @since 2021-07-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
