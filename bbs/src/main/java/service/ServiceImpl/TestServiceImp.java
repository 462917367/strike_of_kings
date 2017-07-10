package service.ServiceImpl;

import domain.Test;
import mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TestService;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Service
public class TestServiceImp implements TestService{
    @Autowired
    private TestMapper testMapper;

    public Test getById(Integer user_id) {
        return testMapper.selectById(user_id);
    }
}
