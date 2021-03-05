package com.imooc.api.controller.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author:刘震
 * @Description:
 * @Date: Created in14:42 2021/3/4.
 * @Modified By:
 */
@Api(value = "标题", tags = "标签")
public interface HelloControllerApi {
    @ApiOperation(value = "hello测试",notes = "hello方法的接口",httpMethod = "Get")
    @GetMapping("hello")
    public Object Hello();
}
