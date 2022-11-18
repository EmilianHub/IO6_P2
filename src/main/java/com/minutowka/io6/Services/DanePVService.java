package com.minutowka.io6.Services;

import com.minutowka.io6.DTO.DanePV;
import com.minutowka.io6.Exceptions.CustomException;
import com.minutowka.io6.Exceptions.CustomExceptionBuilder;
import com.minutowka.io6.JPA.UzytkownikJPA;
import com.minutowka.io6.Repositories.DanePVRepo;
import com.minutowka.io6.Repositories.UzytkownikRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class DanePVService {
    private final DanePVRepo danePVRepo;
    private final UzytkownikRepo uzytkownikRepo;
    public String updateDane(DanePV danePV){
        verifyDanePresence(danePV);

        UzytkownikJPA uzytkownikJPA = uzytkownikRepo
    }
    private void verifyDanePresence(DanePV danePV){
        if (Objects.isNull(danePV.getNrDowodu())){
            throw CustomExceptionBuilder.getCustomException(HttpStatus.BAD_REQUEST,"nr Dowodu nie moze byc pusty jak ty ");

        }
        if (Objects.isNull(danePV.getPesel())){
            throw CustomExceptionBuilder.getCustomException(HttpStatus.BAD_REQUEST,"Pesel nie moze byc pusty jak piotr sz.");
        }
    }
}

