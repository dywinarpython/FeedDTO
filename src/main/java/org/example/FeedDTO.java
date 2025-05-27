package org.example;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class FeedDTO {

    private Long userId;

    private String namePost;
}
