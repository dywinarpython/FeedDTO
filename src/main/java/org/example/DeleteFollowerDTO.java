package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DeleteFollowerDTO {

    private Long id;

    private Long idCommunity;
}
