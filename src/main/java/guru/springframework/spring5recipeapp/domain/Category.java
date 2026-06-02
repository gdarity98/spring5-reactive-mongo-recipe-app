package guru.springframework.spring5recipeapp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Set;
import java.util.UUID;

/**
 * Created by gd on 9/6/2023
 */

@Getter
@Setter
@Document
public class Category {
//    @Id
//    @MongoId(FieldType.OBJECT_ID)
    private String id = UUID.randomUUID().toString();
    private String description;

    @DBRef
    private Set<Recipe> recipes;
}
