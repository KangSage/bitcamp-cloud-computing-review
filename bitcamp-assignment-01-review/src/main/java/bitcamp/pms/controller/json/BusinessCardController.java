package bitcamp.pms.controller.json;

import bitcamp.pms.domain.BusinessCard;
import bitcamp.pms.service.BusinessCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/bzcard")
public class BusinessCardController {

    @Autowired
    BusinessCardService businessCardService;

    @PostMapping("add")
    public Object add(BusinessCard bc) throws Exception {
        System.out.println(bc);
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

    @RequestMapping("update")
    public Object update(BusinessCard bc) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        if (businessCardService.update(bc) == 0) {
            result.put("status", "fail");
            result.put("error", "해당 아이디가 없습니다.");
        } else {
            result.put("status", "success");
        }
        return result;
    }

    @CrossOrigin
    @RequestMapping("list")
    public Object list(
            @RequestParam(defaultValue="1") int page,
            @RequestParam(defaultValue="3") int size, int no) throws Exception {

        if (page < 1) page = 1;
        if (size < 1 || size > 20) size = 3;

        List<BusinessCard> list = businessCardService.list(page, size, no);

        HashMap<String,Object> data = new HashMap<>();
        data.put("list", list);
        data.put("page", page);
        data.put("size", size);

        return data;
    }

    @GetMapping("view/{no}")
    public Object view(
            @PathVariable int no) throws Exception {
        System.out.println(no);
        HashMap<String, Object> data = new HashMap<>();
        BusinessCard bc = businessCardService.get(no);
        data.put("Bzcard", bc);
        return data;
    }

}










