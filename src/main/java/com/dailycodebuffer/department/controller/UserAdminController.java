package com.dailycodebuffer.department.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/auth")
public class UserAdminController {

    @GetMapping("/welcome")
    public String welcome(){
      log.info("Auth enabled successfully...");
        return "Auth is NOT Enabled for this endPoint";
    }

   @GetMapping("/user/userProfile")
   @PreAuthorize("hasRole('USER')")
   public  String userProfile(){
       log.info("Auth enabled successfully for User...");
        return "User Profile Enabled";
    }

    @GetMapping("admin/adminProfile")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminProfile(){
        log.info("Auth enabled successfully for Admin...");
        return "User Profile Enabled";
    }
}
