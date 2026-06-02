package guru.springframework.spring5recipeapp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

/**
 * Created by gd on 9/5/2023
 */
@Getter
@Setter
@Document
public class UnitOfMeasure {
    @Id
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private String description;
}
