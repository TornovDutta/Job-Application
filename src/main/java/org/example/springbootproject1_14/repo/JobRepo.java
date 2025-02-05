package org.example.springbootproject1_14.repo;

import org.example.springbootproject1_14.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Software Engineer", "Develop and maintain software applications.", 2, Arrays.asList("Java", "Spring", "SQL")),
            new JobPost(2, "Data Scientist", "Analyze and interpret complex data.", 3, Arrays.asList("Python", "Machine Learning", "R")),
            new JobPost(3, "DevOps Engineer", "Manage and optimize CI/CD pipelines.", 4, Arrays.asList("Docker", "Kubernetes", "AWS")),
            new JobPost(4, "Frontend Developer", "Build responsive and user-friendly web interfaces.", 1, Arrays.asList("JavaScript", "React", "CSS")),
            new JobPost(5, "Backend Developer", "Design and implement server-side logic.", 3, Arrays.asList("Node.js", "Express", "MongoDB"))
    ));

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost job) {
        jobs.add(job);
    }
}