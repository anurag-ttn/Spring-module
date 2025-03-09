package com.restfulassignment2.restdul.api2.Q5_VersioningRestfulAPIs;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersoningController {


    // versoning using Path parameters
    @GetMapping("/v1/get")
    public User1 getUser1BypathParameter(){
        return new User1(100,"Anurag Kundu");
    }
    @GetMapping("/v2/get")
    public User2 getUser2BypathParameter(){
        return new User2(20,new Name("Anurag","Kundu"));
    }

    // Vesroning using Request parameters
    @GetMapping(value = "/get",params = "v=1")
    public User1 getUser1ByrequestParameter(){
        return new User1(100,"Anurag Kundu");
    }
    @GetMapping(value = "/get",params = "v=2")
    public User2 getUser2ByrequestParameter(){
        return new User2(20,new Name("Anurag","Kundu"));
    }

    // versoning using Custom Header Versioning
    @GetMapping(value = "/get",headers = "X-API-V=1")
    public User1 getUser1ByHeaderParameter(){
        return new User1(100,"Anurag Kundu");
    }
    @GetMapping(value = "/get",headers = "X-API-V=2")
    public User2 getUser2ByHeaderParameter(){
        return new User2(20,new Name("Anurag","Kundu"));
    }

    // versoning using media type
    @GetMapping(value = "/get",produces = "Application/com.ttn.company.app-v1+JSON")
    public User1 getUser1ByMediaTYpe(){
        return new User1(100,"Anurag Kundu");
    }
    @GetMapping(value = "/get",produces = "Application/com.ttn.company.app-v2+JSON")
    public User2 getUser2ByMediaTYpe(){
        return new User2(20,new Name("Anurag","Kundu"));
    }
}
