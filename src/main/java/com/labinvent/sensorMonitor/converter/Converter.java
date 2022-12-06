package com.labinvent.sensorMonitor.converter;

import com.labinvent.sensorMonitor.dto.SensorDto;
import com.labinvent.sensorMonitor.entity.Sensor;

public class Converter {

    public SensorDto toDto(Sensor entity) {
        SensorDto dto = new SensorDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setModel(entity.getModel());
        dto.setRangeFrom(entity.getRangeFrom());
        dto.setRangeTo(entity.getRangeTo());
        dto.setUnit(entity.getUnit());
        dto.setLocation(entity.getLocation());
        dto.setDescription(entity.getDescription());
        return dto;
    }

    public Sensor toEntity(SensorDto dto) {
        Sensor entity = new Sensor();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setModel(dto.getModel());
        entity.setRangeFrom(dto.getRangeFrom());
        entity.setRangeTo(dto.getRangeTo());
        entity.setUnit(dto.getUnit());
        entity.setLocation(dto.getLocation());
        entity.setDescription(dto.getDescription());
        return entity;
    }


}
