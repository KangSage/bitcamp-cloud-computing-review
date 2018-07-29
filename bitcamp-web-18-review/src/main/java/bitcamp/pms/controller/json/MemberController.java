package bitcamp.pms.controller.json;

import bitcamp.pms.domain.Member;
import bitcamp.pms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String add(Member member) throws Exception {
        memberService.add(member);
        return "redirect:list";
    }

    @RequestMapping("update")
    public String update(Member member) throws Exception {
        if (memberService.update(member) == 0) {
            return "member/updatefail";
        } else {
            return "redirect:list";
        }
    }

    @RequestMapping("delete")
    public String delete(String id) throws Exception {
            memberService.delete(id);
            return "redirect:list";
    }

}
