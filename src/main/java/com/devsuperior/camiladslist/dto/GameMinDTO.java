package com.devsuperior.camiladslist.dto;

import com.devsuperior.camiladslist.projection.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    // Construtor para GameMinProjection
    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getGameYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    // Métodos getters...
}

