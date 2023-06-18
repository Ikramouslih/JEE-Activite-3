package com.jee.activite_3;

import com.jee.activite_3.entities.Patient;
import com.jee.activite_3.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Activite3Application {

    public static void main(String[] args) {
        SpringApplication.run(Activite3Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(new Patient(null,"Ikram",new Date(),false,12));
            patientRepository.save(new Patient(null,"Rana",new Date(),true,14));
            patientRepository.save(new Patient(null,"Sohaib",new Date(),true,20));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}
