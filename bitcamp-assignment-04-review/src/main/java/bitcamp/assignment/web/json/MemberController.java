package bitcamp.assignment.web.json;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MemberController {
    @RequestMapping("/member")
    public Object MemberController() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("name", "홍길동");
        return result;
    }
}
