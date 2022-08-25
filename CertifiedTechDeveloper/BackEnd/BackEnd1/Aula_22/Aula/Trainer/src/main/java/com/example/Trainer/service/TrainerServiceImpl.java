package com.example.Trainer.service;

import com.example.Trainer.model.Trainer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService{
    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Luiz"), new Trainer("Maju"));
    }
}
