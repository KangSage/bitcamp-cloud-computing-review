package bitcamp.pms.controller.member;

import bitcamp.pms.controller.PageController;
import bitcamp.pms.dao.MemberDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberDeleteController implements PageController {
    MemberDao memberDao;

    public MemberDeleteController(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public String service(
            HttpServletRequest request, 
                HttpServletResponse response) throws Exception {
        memberDao.delete(request.getParameter("id"));
        return "redirect:list";
    }
}
