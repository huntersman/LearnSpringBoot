package com.hunter.community.model;

import lombok.Data;

/**
 * Created by Hunter on 7/23/2019
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmt_create;
    private Long gmt_modified;
    private Integer creator;
    private Integer viewCount;
    private Integer commmentCount;
    private Integer likeCount;
}
