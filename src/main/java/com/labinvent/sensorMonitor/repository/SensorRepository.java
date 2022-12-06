package com.labinvent.sensorMonitor.repository;

import com.labinvent.sensorMonitor.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository
        extends JpaRepository<Sensor, Long> {

}
