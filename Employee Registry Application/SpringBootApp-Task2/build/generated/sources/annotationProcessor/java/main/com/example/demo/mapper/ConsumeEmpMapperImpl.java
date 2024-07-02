package com.example.demo.mapper;

import com.example.demo.dto.ConsumeEmpDto;
import com.example.demo.vo.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-14T22:29:15+0530",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class ConsumeEmpMapperImpl implements ConsumeEmpMapper {

    @Override
    public ConsumeEmpDto convertToDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        ConsumeEmpDto consumeEmpDto = new ConsumeEmpDto();

        consumeEmpDto.setId( employee.getId() );
        consumeEmpDto.setName( employee.getName() );
        consumeEmpDto.setAddress( employee.getAddress() );

        return consumeEmpDto;
    }

    @Override
    public Employee convertToEntity(ConsumeEmpDto consumeEmpDto) {
        if ( consumeEmpDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( consumeEmpDto.getId() );
        employee.setName( consumeEmpDto.getName() );
        employee.setAddress( consumeEmpDto.getAddress() );

        return employee;
    }

    @Override
    public List<ConsumeEmpDto> convertToDtoList(List<Employee> employees) {
        if ( employees == null ) {
            return null;
        }

        List<ConsumeEmpDto> list = new ArrayList<ConsumeEmpDto>( employees.size() );
        for ( Employee employee : employees ) {
            list.add( convertToDto( employee ) );
        }

        return list;
    }

    @Override
    public List<Employee> convertToEntityList(List<ConsumeEmpDto> consumeEmpdtos) {
        if ( consumeEmpdtos == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( consumeEmpdtos.size() );
        for ( ConsumeEmpDto consumeEmpDto : consumeEmpdtos ) {
            list.add( convertToEntity( consumeEmpDto ) );
        }

        return list;
    }
}
