package com.sparta.mamo.entity;

import com.sparta.mamo.DTO.MemoRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Memo {
    private Long id;
    private String username;
    private String contents;

    public Memo(MemoRequestDto responseDto) {
        this.username = responseDto.getUsername();
        this.contents = responseDto.getContents();
    }
}