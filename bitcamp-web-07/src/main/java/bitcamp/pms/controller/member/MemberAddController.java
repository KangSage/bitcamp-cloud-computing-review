package bitcamp.pms.controller.member;

import bitcamp.pms.controller.PageController;
import bitcamp.pms.dao.MemberDao;
import bitcamp.pms.domain.Member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberAddController implements PageController {

    MemberDao memberDao;

    public MemberAddController(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public String service(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        if (request.getMethod().equals("GET")) {
            return "/member/form.jsp";
        }
        Member member = new Member();
        member.setId(request.getParameter("id"));
        member.setEmail(request.getParameter("email"));
        member.setPassword(request.getParameter("password"));

        memberDao.insert(member);
        return "redirect:list";
    }
} // class
