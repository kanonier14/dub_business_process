package com.dub.bp.controllers;

import com.dub.bp.domain.User;
import com.dub.bp.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Igor_Strakhov
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public void createUser(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        User createdUser = new User();
        createdUser.setFirstName(firstName);
        createdUser.setLastName(lastName);
        userRepository.save(createdUser);

        response.sendRedirect("/");
    }
}
