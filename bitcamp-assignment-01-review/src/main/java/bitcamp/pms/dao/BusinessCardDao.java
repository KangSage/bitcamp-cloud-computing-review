package bitcamp.pms.dao;

import bitcamp.pms.domain.BusinessCard;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessCardDao {
    int insert(BusinessCard bc);
}
