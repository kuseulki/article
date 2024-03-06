package com.a.article.service;

import com.a.article.dto.ArticleCommentDto;
import com.a.article.repository.ArticleCommentRepository;
import com.a.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    // 조회
    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComment(Long articleId) {
        return List.of();
    }

    // 저장
    public void saveArticleComment(ArticleCommentDto dto) {
    }

}