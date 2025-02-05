<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title> Job Portal</title>
    <link rel="stylesheet" href="home.css">
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-light bg-clr">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium " href="#">Telusko Job
            Portal Web App</a>
        <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="home">Home</a>
                </li>
                <li class="nav-item"><a class="nav-link" href="viewalljobs">All
                    Jobs</a></li>

                <li class="nav-item"><a class="nav-link"
                                        href="https://telusko.com/">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <div class="row">
        <!-- Card 1 -->
        <div class="col-md-6 mb-5">
            <div class="card bg-warning">
                <div class="card-body text-center">
                    <h5 class="card-title">View AllJobs</h5>
                    <form action="/viewalljobs" method="get">
                        <!-- Add your form fields here -->
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                </div>
            </div>
        </div>

        <!-- Card 2 -->
        <div class="col-md-6 mb-5">
            <div class="card">
                <div class="card-body text-center">
                    <h5 class="card-title">Add Job</h5>
                    <form action="/addjob" method="get">
                        <!-- Your form fields go here if needed -->

                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>

                </div>
            </div>
        </div>


    </div>
</div>


<!-- Add the Bootstrap JS and Popper.js scripts -->
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>