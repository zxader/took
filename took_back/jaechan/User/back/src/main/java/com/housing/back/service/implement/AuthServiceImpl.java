package com.housing.back.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.housing.back.common.CertificationNumber;
import com.housing.back.dto.request.auth.EmailCertificaionRequestDto;
import com.housing.back.dto.request.auth.IdCheckRequestDto;
import com.housing.back.dto.response.ResponseDto;
import com.housing.back.dto.response.auth.EmailCertificationResponseDto;
import com.housing.back.dto.response.auth.IdCheckResponseDto;
import com.housing.back.provider.EmailProvider;
import com.housing.back.repository.UserRepository;
import com.housing.back.service.AuthService;
import com.housing.back.entity.CertificationEntity;
import com.housing.back.repository.CertificationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
   
    private final UserRepository userRepository;
    private final CertificationRepository certificationRepository;
     
    private final EmailProvider emailProvider;

    @Override
    public ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto) {
    
        try{

            String userId = dto.getId();
            boolean isExistId = userRepository.existsByUserId(userId);

            if(isExistId) return IdCheckResponseDto.duplicatedId();

        }catch(Exception e){
            e.printStackTrace();
            return ResponseDto.databaseError();
        }
        
        return IdCheckResponseDto.success();
    }

    @Override
    public ResponseEntity<? super EmailCertificationResponseDto> emailCertification(EmailCertificaionRequestDto dto) {
       
        try{

            String userId = dto.getId();
            String email = dto.getEmail();

            boolean isExitsId = userRepository.existsByUserId(userId);

            if(isExitsId) return EmailCertificationResponseDto.duplicatedId();

            String certificationNumber = CertificationNumber.getCertificationNumber();

            boolean isSuccessed = emailProvider.sendCertificationMail(email, certificationNumber);

            if(!isSuccessed) return EmailCertificationResponseDto.mailSendFail();

            CertificationEntity certificationEntity = new CertificationEntity(userId,email,certificationNumber);
            certificationRepository.save(certificationEntity);

        }catch(Exception e){
            e.printStackTrace();
            return ResponseDto.databaseError();
        }

        return EmailCertificationResponseDto.success();   
    }



}
