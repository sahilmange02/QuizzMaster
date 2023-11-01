<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <!-- <link rel="stylesheet" href="home.css"> -->
    <link rel="stylesheet" href="css/results.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary bg-dark border-bottom border-body" data-bs-theme="dark">
        <div class="container-fluid">
          <a class="navbar-brand" href="#"><img class = "nav-image"src="quizzlogo1.png" alt=""></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link " aria-current="page" href="faculty_home.html">Quizz</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" href="#">Results</a>
              </li>
              <!-- <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Contact
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Write to us</a></li>
                  <li><a class="dropdown-item" href="#">Call us</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li> -->
            </ul>
            <button class="quizztime-button btn btn-outline-success mx-3" onclick="history.back()">Go Back</button>
            <form class="d-flex" role="search">
              <a class="quizztime-button btn btn-outline-success" href="home.html">Logout</a>
            </form>
          </div>
        </div>
      </nav>
      <ul class="tilesWrap">
      
          <div class="home-title">
              Quizz Results
          </div>
       
           
        <form action="faculty_result_home" method="post">
          <li>
            <h2>01</h2>
            <h3 style="font-size: 3rem;">Java</h3>
            <!-- <p>onclick="window.location.href = 'faculty_java_results.jsp';"
              10/10 marks
            </p> -->
            
            <button  name='subjectBtn' value='101'>Show Results</button>
          </li>
          <li>
            <h2>02</h2>
            <h3 style="font-size: 3rem;">DBMS</h3>
            <!-- <p>
              10/10 marks
            </p> -->
            <button name='subjectBtn' value='303'>Show Results</button>
          </li>
          <li>
            <h2>03</h2>
            <h3 style="font-size: 3rem;">DSA</h3>
            <!-- <p>
              10/10 marks
            </p> -->
            <button name='subjectBtn' value='202'>Show Results</button>
          </li>
          </form>
          <!-- <li>
            <h2>04</h2>
            <h3 style="font-size: 3rem;">Title 4</h3>
            <p>
              10 marks
            </p>
            <button >Read more</button>
          </li> -->
        </ul>

    
      <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
          </body>
          <footer class="footer">
              &copy; 2023 QuizzMaster
          </footer>
</html>