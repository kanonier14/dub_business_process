package com.dub.bp.controllers;

import com.dub.bp.domain.BusinessProcessTemplate;
import com.dub.bp.repositories.BusinessProcessTemplateRepository;

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
@RequestMapping(path = "/bp")
public class BusinessProcessController {

    @Autowired
    private BusinessProcessTemplateRepository businessProcessTemplateRepository;

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public void createBPTemplate(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String bpName = request.getParameter("bp_name");
        BusinessProcessTemplate businessProcessTemplate = new BusinessProcessTemplate();
        businessProcessTemplate.setName(bpName);
        businessProcessTemplateRepository.save(businessProcessTemplate);
        response.sendRedirect("/");
    }
}
