package bitcamp.pms.dao;

import bitcamp.pms.domain.BusinessCard;
import bitcamp.pms.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface BusinessCardDao {
    int insert(BusinessCard bc);
    List<BusinessCard> selectList(HashMap<String, Object> params);
    BusinessCard selectOne(int no);
    int update(BusinessCard bc);
}
