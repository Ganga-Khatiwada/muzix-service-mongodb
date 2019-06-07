package com.stackroute.muzixservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document(collection = "Music")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Music {

    @Id
    private int trackId;
    private String trackName;
    private String trackComments;
}
