package com.restfulassignment2.restdul.api2.Q3_SwaggerUI;

import com.restfulassignment2.restdul.api2.Q4_StaticandDynamicfiltering.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "SWAGGER",description = "this controller gives apis to add , get and delte the user from list")
public class SwaggerController {
    @Autowired
    private ServiceSwaggerUser userswager;

    @GetMapping("/getuser/{id}")
    @Operation(summary = "Get user data", description = "Retrieves user data using id of one user ")
    public UserSwagger getUser(@PathVariable int id) {
        return userswager.getUser(id);
    }

    @PostMapping("/adduser")
    @Operation(summary = "add user details to the list", description = "Add new USer to the database")
    public UserSwagger addUser(@RequestBody UserSwagger user){
        return userswager.addMyUser(user);
    }

    @DeleteMapping("/deleteuser")
    @Operation(summary = "delete User by id", description = "deletes the user data using id of the user")
    public String deleteUser(@RequestParam int id){
        if(userswager.deleteUser(id)){
            return "user with id"+id+" is deleted successfully";
        }
        return "user with id"+id+" could not be deleted";
    }
}
