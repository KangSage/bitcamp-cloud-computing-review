package bitcamp.pms.controller.json;

import bitcamp.pms.dao.MemberDao;
import bitcamp.pms.domain.Member;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.HashMap;


@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    MemberDao memberDao;

   @PostMapping("/login")
    public Object login(
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            HttpServletRequest request,
            HttpServletResponse response,
            HttpSession session) throws Exception {

        Cookie cookie = new Cookie("email", "");
        cookie.setMaxAge(0); // 웹브라우저에 "email"이라는 이름으로 저장된 쿠키가 있다면 제거한다.
            // 즉 유효기간을 0으로 설정함으로써 "email"이라는 이름의 쿠키를 무효화시키는 것이다.
        response.addCookie(cookie);

        HashMap<String,Object> params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);

        Member member = memberDao.selectOneWithPassword(params);

        System.out.println(member);
        HashMap<String,Object> result = new HashMap<>();
        PrintWriter out = response.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        if (member != null) { // 로그인 성공!
            System.out.println("로그인 성공");
            session.setAttribute("loginUser", member);
            System.out.println(session.getAttribute("loginUser").toString());
            result.put("status", "success");
            out.print(mapper.writeValueAsString(result));
            return result;
        } else { // 로그인 실패!
            System.out.println("로그인 실패");
            result.put("status", "fail");
            session.invalidate();
            /*out.print(mapper.writeValueAsString(result));*/
            return result;
        }
    }

    @RequestMapping("/logout")
    public String logout(
            HttpServletRequest request,
            HttpSession session) throws Exception {

        // 세션을 꺼내 무효화시킨다.
        session.invalidate();

        // 웹 애플리케이션의 시작 페이지로 가라고 웹브라우저에게 얘기한다.
        return "loginform.html"; // ==> "/java106-java-project"
    }
}

//               [웹브라우저]                                  [웹서버]
// GET 요청: /java106-java-project/auth/login ===>
//                                                       <=== 응답: 로그인폼
// POST 요청: /java106-java-project/auth/login ===>
//                                                       <=== 응답: redirect URL
// GET 요청: /java106-java-project ===>
//                                                       <=== 응답: index.html
// 메인화면 출력!

//ver 51 - redirect URL 변경
//ver 50 - DAO 변경에 따른 메서드 호출 변경
//ver 49 - 요청 핸들러의 파라미터 값 자동으로 주입받기
//ver 48 - CRUD 기능을 한 클래스에 합치기
//ver 47 - 애노테이션을 적용하여 요청 핸들러 다루기
//ver 46 - 페이지 컨트롤러를 POJO를 변경
//ver 45 - 프론트 컨트롤러 적용
//ver 42 - JSP 적용
//ver 41 - 클래스 추가
