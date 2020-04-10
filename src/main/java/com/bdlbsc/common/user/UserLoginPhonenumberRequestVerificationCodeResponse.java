package com.bdlbsc.common.user;

import com.bdlbsc.common.base.BaseRequest;
import com.bdlbsc.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginPhonenumberRequestVerificationCodeResponse extends BaseResponse {

    private String verification_code;
}
