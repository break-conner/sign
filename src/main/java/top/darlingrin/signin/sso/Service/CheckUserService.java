package top.darlingrin.signin.sso.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.darlingrin.signin.sso.beans.User;

@Mapper
public interface CheckUserService extends BaseMapper<User> {
    User QueryById(int id);
    User QueryByClunm(QueryWrapper wrapper);
}
