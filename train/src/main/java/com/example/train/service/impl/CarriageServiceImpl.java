package com.example.train.service.impl;

import com.example.train.entity.CarriageEntity;
import com.example.train.mapper.CarriageMapper;
import com.example.train.mapper.TrainMapper;
import com.example.train.model.Carriage;
import com.example.train.model.Train;
import com.example.train.repository.CarriageRepository;
import com.example.train.service.CarriageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarriageServiceImpl implements CarriageService {

    private final CarriageRepository carriageRepository;

    @Autowired
    public CarriageServiceImpl(CarriageRepository carriageRepository) {
        this.carriageRepository = carriageRepository;
    }

    @Override
    public Carriage getCarriageById(int id) {
        if(carriageRepository.existsById(id)) {
            CarriageEntity carriageEntity = carriageRepository.getReferenceById(id);
            return CarriageMapper.carriageEntityToCarriage(carriageEntity);
        }
        return null;
    }

    @Override
    public Train getTrainByCarriageId(int id) {
        if(carriageRepository.existsById(id)) {
            return TrainMapper.trainEntityToTrain(carriageRepository.getReferenceById(id).getTrain());
        }
        return null;
    }

    @Override
    public int getCarriageNumberByCarriageId(int id) {
        if(carriageRepository.existsById(id)) {
            return carriageRepository.getReferenceById(id).getCarriageNumber();
        }
        return -1;
    }

    @Override
    public Object getTypeByCarriageId(int id) {
        if(carriageRepository.existsById(id)) {
            return carriageRepository.getReferenceById(id).getType();
        }
        return null;
    }

    @Override
    public int getNumberOfSeatsByCarriageId(int id) {
        if(carriageRepository.existsById(id)) {
            return carriageRepository.getReferenceById(id).getNumberOfSeats();
        }
        return -1;
    }
}
