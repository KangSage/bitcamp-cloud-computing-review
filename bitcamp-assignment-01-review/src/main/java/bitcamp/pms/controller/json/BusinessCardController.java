package bitcamp.pms.controller.json;

import bitcamp.pms.domain.BusinessCard;
import bitcamp.pms.domain.Member;
import bitcamp.pms.service.BusinessCardService;
import bitcamp.pms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/bzcard")
public class BusinessCardController {

    @Autowired
    BusinessCardService businessCardService;

    @GetMapping("add")
    public Object add(BusinessCard bc, @RequestParam(defaultValue = "1") int writerNo) throws Exception {
        System.out.println("dd");
        System.out.println(bc);
        bc.setWriterNo(writerNo);
        System.out.println(writerNo);
        int count = businessCardService.add(bc);

        HashMap<String, Object> result = new HashMap<>();
        if (count != 1 ) {
            result.put("status", "error");
            result.put("count", count);
        } else {
            result.put("status", "success");
            result.put("count", count);
        }
        return result;
    }

    @CrossOrigin
    @RequestMapping("list")
    public Object list(
            @RequestParam(defaultValue="1") int page,
            @RequestParam(defaultValue="3") int size) throws Exception {

        if (page < 1) page = 1;
        if (size < 1 || size > 20) size = 3;


        HashMap<String,Object> data = new HashMap<>();
        data.put("page", page);
        data.put("size", size);

        return data;
    }

}










