package com.farmstory.entity;

import com.farmstory.dto.ArticleDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity                 // 엔티티 객체 정의
@Table(name = "article")
public class Article {

    @Id
    private int artNo;
    private int artComment;
    private String artCate;
    private String artTitle;
    private String artContent;
    private String artWriter;
    private int artFile;
    private int artHit;
    private String artRegip;

    @CreationTimestamp
    private LocalDateTime artRdate;
    private String artNick;


    public ArticleDTO toDTO(){
        return ArticleDTO.builder()
                .artNo(artNo)
                .artComment(artComment)
                .artCate(artCate)
                .artTitle(artTitle)
                .artContent(artContent)
                .artWriter(artWriter)
                .artFile(artFile)
                .artHit(artHit)
                .artRegip(artRegip)
                .artRdate(artRdate)
                .artNick(artNick)
                .build();
    }
}
