package com.hunter.community.dto;

import lombok.Data;

/**
 * 超过两个参数要传递时最好创建一个类来进行传递
 * 传递参数
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
