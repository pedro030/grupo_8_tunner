package com.tunner.api.controllers;

import com.tunner.api.entities.User;
import com.tunner.api.services.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "tunner/api/users")
public class UserController extends BaseControllerImpl<User, UserServiceImpl>{
}
