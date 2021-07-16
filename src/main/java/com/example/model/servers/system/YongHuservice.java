package com.example.model.servers.system;

import com.example.model.dao.system.YongHuDao;
import com.example.model.pojos.system.YongHu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class YongHuservice {
    @Resource
    YongHuDao yongHuDao;

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    public boolean getyh(String id){
            return yongHuDao.deleteById(id)==1;
    }

    /**
     * 根据用户ID修改用户密码
     * @param yongHu
     * @return
     */
    public int updateyh(YongHu yongHu){
        return yongHuDao.updateById(yongHu);
    }

    /**
     * 根据ID删除用户
     * @param id
     * @return
     */
    public int deleteyh(String id){
        return yongHuDao.deleteById(id);
    }

    /**
     * 新增用户
     * @param yongHu
     * @return
     */
    public int insertyh(YongHu yongHu){
        yongHu.setYhMm("aaaaa");
        return yongHuDao.insert(yongHu);
    }

}
