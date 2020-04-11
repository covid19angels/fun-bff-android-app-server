package com.bdlbsc.app.controller;


import com.bdlbsc.common.Result;
import com.bdlbsc.common.ResultCode;
import com.bdlbsc.common.ResultMessage;
import com.bdlbsc.common.api.USERAPI;
import com.bdlbsc.common.user.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {


    private static final String TAG = "UserController";

    /**
     * 用户名密码登录
     *
     * @param request
     * @return
     */
    @PostMapping(value = USERAPI.LOGIN_USERNAME)
    @ResponseBody
    public Result<UserLoginUsernameResponse> loginUsername(UserLoginUsernameRequest request) {
        log.info(TAG, request);
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
    @PostMapping(value = USERAPI.LOGIN_PHONENUMBER_REQUEST_VERIFICATIONCODE)
    @ResponseBody
    public Result<UserLoginPhonenumberRequestVerificationCodeResponse> loginPhonenumberRequestVerificationCode(UserLoginPhonenumberRequestVerificationCodeRequest request) {
        log.info(TAG, request);
        Result<UserLoginPhonenumberRequestVerificationCodeResponse> result = new Result<>();
        result.setData(UserLoginPhonenumberRequestVerificationCodeResponse.builder().verification_code("112233").build());
        return result;
    }

    /**
     * 手机号登录
     *
     * @param request
     * @return
     */
    @PostMapping(value = USERAPI.LOGIN_PHONENUMBER)
    @ResponseBody
    public Result<UserLoginPhonenumberResponse> loginPhonenumber(UserLoginPhonenumberRequest request) {
        log.info(TAG, request);
        Result<UserLoginPhonenumberResponse> result = new Result<>();
        result.setData(UserLoginPhonenumberResponse.builder().refresh_token("test_refresh_token").access_token("test_access_token").build());
        return result;
    }


    @PostMapping(value = USERAPI.REGISTERED_USERNAME)
    @ResponseBody
    public Result<UserRegisteredUsernameResponse> registeredUsername(UserRegisteredUsernameRequest request) {
        Result<UserRegisteredUsernameResponse> result = new Result<>();
        return result;
    }


    @PostMapping(value = USERAPI.REGISTERED_PHONENUMBER_REQUEST_VERIFICATIONCODE)
    @ResponseBody
    public Result<UserRegisteredPhonenumberRequestVerifocationCodeResponse> registeredPhonenumberRequestVerifocationCode(UserRegisteredPhonenumberRequestVerifocationCodeRequest request) {
        Result<UserRegisteredPhonenumberRequestVerifocationCodeResponse> result = new Result<>();
        return result;
    }

    @PostMapping(value = USERAPI.REGISTERED_PHONENUMBER)
    @ResponseBody
    public Result<UserRegisteredPhonenumberResponse> registeredPhonenumber(UserRegisteredPhonenumberRequest request) {
        Result<UserRegisteredPhonenumberResponse> result = new Result<>();
        return result;
    }
}
