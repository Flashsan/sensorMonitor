package com.labinvent.sensorMonitor.service.impl;

import com.labinvent.sensorMonitor.converter.Converter;
import com.labinvent.sensorMonitor.dto.SensorDto;
import com.labinvent.sensorMonitor.entity.Sensor;
import com.labinvent.sensorMonitor.repository.SensorRepository;
import com.labinvent.sensorMonitor.service.SensorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SensorServiceImpl
        implements SensorService {

    SensorRepository sensorRepository;
    Converter sensorConverter;

    @Override
    public List<SensorDto> listAllSensors() {
        List<Sensor> sensorList = sensorRepository.findAll();
        List<SensorDto> sensorListDto = new ArrayList<>();
       SensorDto sensorDto = new SensorDto();
        for (Sensor sensor:sensorList) {
            sensorListDto.add(sensorConverter.toDto(sensor));
        }
        return sensorListDto;
    }
}
