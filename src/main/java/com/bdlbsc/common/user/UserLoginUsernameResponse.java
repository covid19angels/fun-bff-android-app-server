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
public class UserLoginUsernameResponse extends BaseResponse {

    private String access_token;
    private String refresh_token;
}
