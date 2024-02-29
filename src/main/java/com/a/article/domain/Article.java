package com.a.article.domain;

import java.time.LocalDateTime;

public class Article {

    private Long id;
    private String title;
    private String content;
    private String hashtag;

    protected LocalDateTime createdAt; // 생성일시
    protected String createdBy; // 생성자
    protected LocalDateTime modifiedAt; // 수정일시
    protected String modifiedBy; // 수정자

}
