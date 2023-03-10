package cn.zko0.remotelabel.controller;

import cn.zko0.remotelabel.feign.CollectorFeign;
import cn.zko0.remotelabel.service.TestFeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MoniterPortController {

//    @Resource
//    private TestFeignService testFeignService;

    @Resource
    private CollectorFeign collectorFeign;
    
    @Value("${server.port}")
    private String serverPort;
 
    @GetMapping("")
    public String getPort(){
        return "nacos registry, serverPort: " + serverPort;
    }

    @GetMapping("/testFeign")
    public String testFeign(){
        boolean exist = collectorFeign.getExist(String.valueOf(1));
        return String.valueOf(exist);
//        return testFeignService.getOtherPort();
    }

 
}