package com.hunter.community.model;

import lombok.Data;

/**
 * Created by Hunter on 7/17/2019
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatar_url;
}
