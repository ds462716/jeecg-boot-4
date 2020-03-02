package org.jeecg.modules.demo.test.controller;


import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/jeecgDemo")
@Slf4j
public class TestHelloController {
    /**
     * hello world
     *
     * @param
     * @return
     */
    @GetMapping(value = "/hello")
    public Result<String> hello() {
        Result<String> result = new Result<String>();
        result.setResult("Hello World! two");
        result.setSuccess(true);
        return result;
    }
}
