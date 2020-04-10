package com.bdlbsc.app.controller;


import com.bdlbsc.common.Result;
import com.bdlbsc.common.ResultCode;
import com.bdlbsc.common.ResultMessage;
import com.bdlbsc.common.user.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {

    /**
     * 用户名密码登录
     *
     * @param request
     * @return
     */
    @PostMapping(value = "login/username")
    @ResponseBody
    public Result<UserLoginUsernameResponse> loginUsername(UserLoginUsernameRequest request) {
        log.info("login", request);

        Result<UserLoginUsernameResponse> result = new Result<>();
        result.setCode(ResultCode.SUCCESS);
        result.setMessage(ResultMessage.SUCCESS);
        result.setData(UserLoginUsernameResponse.builder().access_token("test_access_token").refresh_token("test_refresh_token").build());

        return result;
    }

    /**
     * 手机号登录请求验证码
     *
     * @param request
     * @return
     */
    @PostMapping(value = "login/phonenumber-request-verificationcode")
    @ResponseBody
    public UserLoginPhonenumberRequestVerificationCodeResponse loginPhonenumberRequestVerificationCode(UserLoginPhonenumberRequestVerificationCodeRequest request) {
        log.info("login", request);
        return UserLoginPhonenumberRequestVerificationCodeResponse.builder().verification_code("112233").build();
    }

    /**
     * 手机号登录
     *
     * @param request
     * @return
     */
    @PostMapping(value = "login/phonenumber")
    @ResponseBody
    public UserLoginPhonenumberResponse loginPhonenumber(UserLoginPhonenumberRequest request) {
        log.info("login", request);
        return UserLoginPhonenumberResponse.builder().refresh_token("test_refresh_token").access_token("test_access_token").build();
    }
}
