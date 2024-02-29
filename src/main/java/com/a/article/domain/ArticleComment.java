package com.a.article.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id;
    private Article article;    // 게시글 (ID)
    private String content;

    protected LocalDateTime createdAt; // 생성일시
    protected String createdBy; // 생성자
    protected LocalDateTime modifiedAt; // 수정일시
    protected String modifiedBy; // 수정자

}
