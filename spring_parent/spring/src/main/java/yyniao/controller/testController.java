package yyniao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/21 16:59
 */
@RestController()
public class testController {

    @GetMapping("/1")
    public String test(){
        return "123";
    }
}
