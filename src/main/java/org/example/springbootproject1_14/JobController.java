package org.example.springbootproject1_14;

import ch.qos.logback.core.model.Model;
import org.example.springbootproject1_14.model.JobPost;
import org.example.springbootproject1_14.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service;
    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }
    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public ModelAndView  handleForm(JobPost jobpost, ModelAndView mv) {

        service.addJob(jobpost);
        mv.addObject("jobpost",jobpost);
        mv.setViewName("success");
        return mv;
    }
    @GetMapping("viewalljobs")
    public ModelAndView viewalljobs(ModelAndView mv){
        List<JobPost> jobs=service.getAllJobs();
        mv.addObject("jobPosts",jobs);
        mv.setViewName("viewalljobs");
        return mv;
    }

}
