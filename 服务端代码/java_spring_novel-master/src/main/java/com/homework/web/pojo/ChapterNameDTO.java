package com.homework.web.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChapterNameDTO {

    @JsonProperty("chapterId")
    private Integer chapterId;

    @JsonProperty("chapterTitle")
    private String chapterTitle;
}
