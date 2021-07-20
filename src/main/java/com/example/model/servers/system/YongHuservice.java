package com.example.model.servers.system;

import com.example.model.dao.system.YongHuDao;
import com.example.model.pojos.system.YongHu;
import com.example.util.Password;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

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
     *重置密码
     */
    public int czmm(YongHu yongHu){
//        先删除用户
        deleteyh(yongHu.getYhId()+"");
//        在新增用户
        return insertyh(yongHu);
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
 //        随机生成密码键
        yongHu.setYhKey(Password.generateShortUuid());
//        将密码加密存进数据库
        try {
            yongHu.setYhMm(Password.encrypt("aaaaa",yongHu.getYhKey()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return yongHuDao.insert(yongHu);
    }

}
