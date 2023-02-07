package com.example.testSecurity.service;

import com.example.testSecurity.dto.article.ArticleCreateDto;
import com.example.testSecurity.dto.article.ArticleInfoDto;
import com.example.testSecurity.dto.article.ArticleSearchConditionDto;
import com.example.testSecurity.dto.article.ArticleUpdateDto;
import com.example.testSecurity.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ArticleService {

    ArticleInfoDto createArticle(ArticleCreateDto articleCreateDTO, Long loginMemberNo);

    ArticleInfoDto getArticle(Long articleNo);

    ArticleInfoDto updateArticle(ArticleUpdateDto articleUpdateDto, Long articleNo);

    void deleteArticle(Long articleNo);

    void bookmarkArticle(Long articleNo, Member loginMember);


    Boolean checkIsMemberArticle(Long articleNo, Long loginMemberNo);

    ArticleInfoDto likeArticle(Long articleNo);

    Page<ArticleInfoDto> search(ArticleSearchConditionDto searchCondition, Pageable pageable);

    Page<ArticleInfoDto> getArticles(Pageable pageable);
}
