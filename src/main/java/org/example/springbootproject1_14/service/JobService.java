package org.example.springbootproject1_14.service;

import org.example.springbootproject1_14.model.JobPost;
import org.example.springbootproject1_14.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;
    public void addJob(JobPost job) {
        repo.addJob(job);
    }
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

}
