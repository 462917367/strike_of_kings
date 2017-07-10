package mapper;

import domain.Test;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
public interface TestMapper {
    @Select("select * from t_user where user_id = #{user_id}")
    Test selectById(Integer user_id);
}
