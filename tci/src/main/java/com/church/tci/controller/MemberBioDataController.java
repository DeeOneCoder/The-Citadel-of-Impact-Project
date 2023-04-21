package com.church.tci.controller;

import com.church.tci.exception.ResourceNotFound;
import com.church.tci.model.MemberBioData;
import com.church.tci.repository.MemberBioDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("church/api/v1/members/")
public class MemberBioDataController {

    @Autowired
    private MemberBioDataRepository memberBioDataRepository;


    @GetMapping("/biodata")
    public MemberBioData getMemberBioData(@RequestBody Long id){
        return memberBioDataRepository.findById(id).orElseThrow(()-> new ResourceNotFound("Bio-data with id: " + id + " does not exist." ));
    }

    @PostMapping("/biodata")
    public MemberBioData createMemberBiodata(@RequestBody MemberBioData bioData){
        return memberBioDataRepository.save(bioData);
    }

    @PutMapping("/biodata")
    public ResponseEntity<MemberBioData> updateMemberBioData(@RequestBody Long id, @RequestBody MemberBioData memberToUpdate){
        MemberBioData newMemberBioData = getMemberBioData(id);
        newMemberBioData.setPassportPhotograph(memberToUpdate.getPassportPhotograph());
        newMemberBioData.setLeftFingerPrint(memberToUpdate.getLeftFingerPrint());
        newMemberBioData.setRightFingerPrint(memberToUpdate.getRightFingerPrint());

        memberBioDataRepository.save(newMemberBioData);

        return ResponseEntity.ok(newMemberBioData);
    }

    @DeleteMapping("/biodata")
    public ResponseEntity<MemberBioData> deleteMemberBioData(@RequestBody MemberBioData memberToDelete){
        memberBioDataRepository.delete(memberToDelete);
        return ResponseEntity.ok(memberToDelete);
    }
}
