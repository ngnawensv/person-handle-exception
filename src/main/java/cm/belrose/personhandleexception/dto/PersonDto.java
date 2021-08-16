package cm.belrose.personhandleexception.dto;

import cm.belrose.personhandleexception.model.Person;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonDto {
    private Long id;
    private String lastName;
    private String firstName;

    public static PersonDto fromEntity(Person entity){
        if(entity==null){
            return null;
        }
        return PersonDto.builder()
                .id(entity.getId())
                .lastName(entity.getLastName())
                .firstName(entity.getFirstName())
                .build();
    }

    public static Person toEntity(PersonDto dto){
        if(dto==null){
            return null;
        }
        return Person.builder()
                .id(dto.getId())
                .lastName(dto.getLastName())
                .firstName(dto.getFirstName())
                .build();
    }
}
