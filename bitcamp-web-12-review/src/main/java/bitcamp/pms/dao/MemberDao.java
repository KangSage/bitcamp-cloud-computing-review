package bitcamp.pms.dao;

import bitcamp.pms.domain.Member;

import java.util.List;
import java.util.Map;

public interface MemberDao {
    List<Member> selectList(Map<String,Object> params);
    Member selectOne(String id);
    int update(Member member);
    int delete(String id);
    int insert(Member member);
}



