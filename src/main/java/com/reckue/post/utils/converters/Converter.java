package com.reckue.post.utils.converters;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor
@Data
public class Converter {

    private static ModelMapper mapper;

    public static <T> T convert2(Object src, Class<T> dist) {
        return mapper.map(src, dist);
    }
}
