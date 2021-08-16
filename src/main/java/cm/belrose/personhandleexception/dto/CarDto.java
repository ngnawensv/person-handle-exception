package cm.belrose.personhandleexception.dto;

import cm.belrose.personhandleexception.model.Car;
import cm.belrose.personhandleexception.model.Person;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDto {
    private Long id;
    private String name;
    private String mark;
    private PersonDto personDto;

    public static CarDto fromEntity(Car entity){
        if(entity==null){
            return null;
        }
        return CarDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .mark(entity.getMark())
                .personDto(PersonDto.fromEntity(entity.getPerson()))
                .build();
    }

    public static Car toEntity(CarDto dto){
        if(dto==null){
            return null;
        }
        return Car.builder()
                .id(dto.getId())
                .name(dto.getName())
                .mark(dto.getMark())
                .person(PersonDto.toEntity(dto.getPersonDto()))
                .build();
    }
}
