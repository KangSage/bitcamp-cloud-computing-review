package bitcamp.pms.controller.member;

import bitcamp.pms.controller.PageController;
import bitcamp.pms.dao.MemberDao;
import bitcamp.pms.domain.Member;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

// 톰캣 서버가 호출하는 5개의 메서드
public class MemberListController implements PageController {

    MemberDao memberDao;

    public MemberListController(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public String service(
            HttpServletRequest request,
                HttpServletResponse response) throws Exception {

        // DE에서 가져올 데이터의 페이지 정보
        HashMap<String, Object> params = new HashMap<>();

        if (request.getParameter("page") != null && 
                request.getParameter("size") != null)  {
            int page = Integer.parseInt(request.getParameter("page"));
            int size = Integer.parseInt(request.getParameter("size"));
            params.put("startIndex", (page - 1) * size);
            params.put("pageSize", size);
        }

            List<Member> list = memberDao.selectList(params);
            request.setAttribute("list", list);
            return "/member/list.jsp";
    }
}
