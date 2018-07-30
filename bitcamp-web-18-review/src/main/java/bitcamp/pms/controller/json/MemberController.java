package bitcamp.pms.controller.json;

import bitcamp.pms.domain.Member;
import bitcamp.pms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    
    @Autowired MemberService memberService;

    @RequestMapping("list")
    public Object list(
            @RequestParam(defaultValue="1") int page, 
            @RequestParam(defaultValue="3") int size) throws Exception {

        if (page < 1) page =1;
        if (size < 1 || size > 20) size =3;
        
        // DB에서 가져올 데이터의 페이지 정보
        
        List<Member> list = memberService.list(page, size);

        HashMap<String, Object> data = new HashMap<>();
        data.put("list", list);
        data.put("page", page);
        data.put("size", size);
        data.put("totalPage",
                memberService.getTotalPage(size));
        return data;
    }
    
    @GetMapping("form")
    public void form() {
        /*리턴 값이 void면 현재 주소가 그대로 리턴됨*/
        /*return "member/form";*/
    }

    @RequestMapping("view/{id}")
    public Object view(@PathVariable String id) throws Exception {
        HashMap<String, Object> data = new HashMap<>();
        data.put("member", memberService.get(id));
        return data;
    }

    @PostMapping("add")
    public Object add(@RequestParam String id, Member member) throws Exception {
        /*
        System.out.printf("URL 디코딩 전 : %s\n", id);
        System.out.printf("URL 디코딩 후 : %s\n", URLDecoder.decode(id, "UTF-8"));
        */
        member.setId(URLDecoder.decode(id, "UTF-8"));
        HashMap<String, Object> result = new HashMap<>();
        memberService.add(member);
        result.put("status", "success");
        return result;
    }

    @RequestMapping("update")
    public Object update(@RequestParam() String id, Member member) throws Exception {

        member.setId(URLDecoder.decode(id, "UTF-8"));
        HashMap<String, Object> result = new HashMap<>();
        if (memberService.update(member) == 0) {
            result.put("status", "fail");
            result.put("error", "해당 아이디가 없습니다.");
        } else {
            result.put("status", "success");
        }
        return result;
    }

    @RequestMapping("delete")
    public Object delete(String id) throws Exception {
        String urlId = URLDecoder.decode(id, "UTF-8");
        HashMap<String, Object> result = new HashMap<>();
        if (memberService.delete(urlId) == 0) {
            result.put("status", "fail");
            result.put("error", "해당 아이디가 없습니다.");
        } else {
            result.put("status", "success");
        }
        return result;
    }

}
