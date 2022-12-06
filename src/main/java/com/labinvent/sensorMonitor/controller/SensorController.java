package com.labinvent.sensorMonitor.controller;

import com.labinvent.sensorMonitor.dto.SensorDto;
import com.labinvent.sensorMonitor.entity.Sensor;

import com.labinvent.sensorMonitor.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/sensorMonitors")
public class SensorController {

    @Autowired
    SensorService sensorService;

    @GetMapping("/sensors")
    public List<SensorDto> getAllSensors() {
        return sensorService.listAllSensors();
    }


//
//    @GetMapping("/sensors/{id}")
//    public ResponseEntity<Sensor> getSensorById(@PathVariable("id") long id) throws ResourceNotFoundException {
//        Sensor sensor = sensorRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Sensor not found Employee not found for this"));
//        return ResponseEntity.ok().body(sensor);
//
//    }
//
//    @PostMapping("/sensors")
//    public Sensor createSensor(@Valid @RequestBody Sensor sensor) {
//        return sensorRepository.save(sensor);
//    }
//
//    @PutMapping("/tutorials/{id}")
//    public ResponseEntity<Sensor> updateSensor(@PathVariable("id") long id, @Valid @RequestBody Sensor sensor) throws ResourceNotFoundException {
//        Sensor sensor1 = sensorRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Sensor not found Employee not found for this"));
//        return ResponseEntity.ok().body(sensor);
//
////        sensor1.setName(sensor.getName());
////        sensor1.setModel(sensor.getModel());
////        sensor1.setRangeFrom(sensor.getRangeFrom());
////        sensor1.setRangeTo(sensor.getRangeTo());
////        sensor1.setType(sensor.getType());
////        sensor1.setUnit(sensor.getUnit());
////        sensor1.setLocation(sensor.getLocation());
////        sensor1.setLocation(sensor.getDescription());
////        final Sensor sensorUpdate = sensorRepository.save;
////        return ResponseEntity.ok(sensorUpdate);
//    }
//
//    @DeleteMapping("/sensors/{id}")
//    public Map<String, Boolean> deleteSensor(@PathVariable("id") long id)
//            throws ResourceNotFoundException {
//        Sensor sensor = sensorRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Sensor not found for this id ::" + id));
//
//        sensorRepository.delete(sensor);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//
//    }
}
