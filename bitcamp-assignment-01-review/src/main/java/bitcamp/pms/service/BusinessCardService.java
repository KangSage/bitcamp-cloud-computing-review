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

    public List<BusinessCard> list(int page, int size, int no) {
        HashMap<String, Object> params = new HashMap<>();

        if (page > 0 && (size > 0 && size <= 20))  {
            params.put("startIndex", (page - 1) * size);
            params.put("pageSize", size);
            params.put("writerNo", no);
        }
        return businessCardDao.selectList(params);
    }

    public int add(BusinessCard bc) {
        return businessCardDao.insert(bc);
    }

    public BusinessCard get(int no) {
        return businessCardDao.selectOne(no);
    }

    public int update(BusinessCard bc) {
        return businessCardDao.update(bc);
    }
}
