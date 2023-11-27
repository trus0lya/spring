package com.example.train.controller.train;

import com.example.train.model.Train;
import com.example.train.service.impl.TrainServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class TrainGetControllerTest {
    @Mock
    private TrainServiceImpl trainService;

    @InjectMocks
    private TrainGetController trainGetController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getTrainByIdReturnsTrainWhenTrainExists() {
        int trainId = 1;
        Train mockTrain = new Train(trainId, "6553A","Express", 13);
        when(trainService.getTrainById(trainId)).thenReturn(mockTrain);

        ResponseEntity<Train> response = trainGetController.getTrainById(trainId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockTrain, response.getBody());
    }

    @Test
    void getTrainByIdReturnsNotFoundWhenTrainDoesNotExist() {

        int trainId = 1;
        when(trainService.getTrainById(trainId)).thenReturn(null);

        ResponseEntity<Train> response = trainGetController.getTrainById(trainId);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertNull(response.getBody());
    }

    @Test
    void getAllTrainsReturnsTrainsWhenTrainsExist() {

        List<Train> mockTrains = Arrays.asList(new Train(1,"6553A","Express", 13),
                new Train(2, "6563B","Express", 14));
        when(trainService.getAll()).thenReturn(mockTrains);

        ResponseEntity<List<Train>> response = trainGetController.getAllTrains();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockTrains, response.getBody());
    }

    @Test
    void getAllTrainsReturnsNotFoundWhenNoTrainsExist() {
        when(trainService.getAll()).thenReturn(List.of());


        ResponseEntity<List<Train>> response = trainGetController.getAllTrains();

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertNull(response.getBody());
       // assertTrue(Objects.requireNonNull(response.getBody()).isEmpty());
    }
}
