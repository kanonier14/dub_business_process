package com.dub.bp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Igor_Strakhov
 */
@Controller
public class RootController {

    @RequestMapping("/")
    public String getMainPage() {
        return "index";
    }

    @RequestMapping("/bpeditor")
    public String getBPEditorPage() {
        return "bptemplateeditor";
    }

    @RequestMapping("/usercreate")
    public String createUserPage() {
        return "createuser";
    }
}
