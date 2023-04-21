package com.church.tci.controller;

import com.church.tci.exception.ResourceNotFound;
import com.church.tci.model.ChurchMember;
import com.church.tci.repository.ChurchMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("church/api/v1/")
public class ChurchMemberController {

    @Autowired
    private ChurchMemberRepository churchMemberRepository;

    @GetMapping("/members")
    public List<ChurchMember> getAllChurchMembers(){
        return churchMemberRepository.findAll();
    }

//    @GetMapping("/members/{phoneNumber}")
//    public ChurchMember getMemberByPhoneContact(@PathVariable String phoneNumber){
//        return churchMemberRepository.findByPhoneContact(phoneNumber);
//    }

    @GetMapping("/members/{id}")
    public ResponseEntity<ChurchMember> getChurchMemberById(@PathVariable Long id){
        ChurchMember foundMember = churchMemberRepository.findById(id).orElseThrow(()->
                new ResourceNotFound("Member with " + id + " not found."));
        return ResponseEntity.ok(foundMember);
    }

    @PostMapping("/members")
    public ChurchMember addNewChurchMember(@RequestBody ChurchMember newMember){
        return churchMemberRepository.save(newMember);
    }

    @PutMapping("/members/{id}")
    public ResponseEntity<ChurchMember> updateChurchMemberDetails(@PathVariable long id, @RequestBody ChurchMember churchMember){
        ChurchMember updatedMember = churchMemberRepository.findById(id).orElseThrow(()-> new ResourceNotFound("Member Not Found"));

        updatedMember.setParentPhoneContact(churchMember.getParentPhoneContact());
        updatedMember.setFirstName(churchMember.getFirstName());
        updatedMember.setOtherName(churchMember.getOtherName());
        updatedMember.setLastName(churchMember.getLastName());
        updatedMember.setEmail(churchMember.getEmail());
        updatedMember.setGender(churchMember.getGender());
        updatedMember.setAreaName(churchMember.getAreaName());
        updatedMember.setDateOfBirth(churchMember.getDateOfBirth());
        updatedMember.setFullAddress(churchMember.getFullAddress());
        updatedMember.setPhoneNumber(churchMember.getPhoneNumber());
        updatedMember.setNationality(churchMember.getNationality());
        updatedMember.setUnitMembershipInChurch(churchMember.getUnitMembershipInChurch());

        ChurchMember savedMember = churchMemberRepository.save(updatedMember);
        return ResponseEntity.ok(savedMember);
    }

    @DeleteMapping("/members/{id}")
    public ResponseEntity<ChurchMember> deleteChurchMember(@PathVariable Long id){
        ChurchMember memberToDelete = churchMemberRepository.findById(id).orElseThrow(()->
                new ResourceNotFound("Member doesn't exist."));
        churchMemberRepository.delete(memberToDelete);
        return ResponseEntity.ok(memberToDelete);
    }

}
