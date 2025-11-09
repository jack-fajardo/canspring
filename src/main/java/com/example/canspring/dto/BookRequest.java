// note: DTOs are first layer of validation. 
// I will only put here 'things I can validate without talking to the database'
// I used lombok here so I would get rid of boilerplate getters/setters code
// I have a custom validation rule here for limiting size of the description
package com.example.canspring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookRequest {

    private String title;
    private String author;

    //@DescriptionLimit
    private String description;
    private String file_name;
    private String file_url;
    private String file_size;
    private String content_type;
}

// When receiving data →
// It maps the JSON body from the request into a Java object, so my controller and service can easily work with it.
// When sending data →
// It can also serve as the response object, controlling what fields are sent back to the client (to avoid exposing things like passwords, internal IDs, etc.).
