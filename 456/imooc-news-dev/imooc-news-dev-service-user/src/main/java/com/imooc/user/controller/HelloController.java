package com.imooc.user.controller;

import com.imooc.api.controller.user.HelloControllerApi;
import com.imooc.grace.result.GraceJSONResult;
import com.imooc.grace.result.IMOOCJSONResult;
import com.imooc.grace.result.ResponseStatusEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:刘震
 * @Description:
 * @Date: Created in20:33 2021/3/3.
 * @Modified By:
 */
@RestController
public class HelloController implements HelloControllerApi {
final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Override
    public Object Hello() {

        logger.info("info:hello");
        return GraceJSONResult.errorCustom(ResponseStatusEnum.NO_AUTH);
    }
}
