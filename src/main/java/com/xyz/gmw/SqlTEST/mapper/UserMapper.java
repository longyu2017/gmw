package com.xyz.gmw.SqlTEST.mapper;

import com.xyz.gmw.SqlTEST.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xyz
 * @since 2021-07-20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
