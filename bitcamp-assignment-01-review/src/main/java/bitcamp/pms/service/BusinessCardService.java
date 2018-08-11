package bitcamp.pms.service;

import bitcamp.pms.dao.BusinessCardDao;
import bitcamp.pms.dao.MemberDao;
import bitcamp.pms.domain.BusinessCard;
import bitcamp.pms.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BusinessCardService {
    
    @Autowired
    BusinessCardDao businessCardDao;

    public int add(BusinessCard bc) {
        return businessCardDao.insert(bc);
    }

}
